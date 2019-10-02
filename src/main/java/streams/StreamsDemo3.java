package streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo3 {
    public static void main(String[] args) {

        //stream partitioning
        Map<Boolean, List<Integer>> partitionedMap = Stream.generate(() -> Math.random() * 50)
                            .map(p -> p.intValue())
                            .distinct()
                            .limit(10)
                            .collect(
                                    Collectors.partitioningBy(
                                            new Predicate<Integer>() {
                                                @Override
                                                public boolean test(Integer integer) {
                                                    return integer % 2 == 0;
                                                }
                                            }
                                    )
                            );

        System.out.println(partitionedMap);
    }
}
