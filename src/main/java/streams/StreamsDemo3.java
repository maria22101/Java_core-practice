package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.IntFunction;
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

        //flatMap example
        int[][] nestedIntArr = {{1,2,3}, {4,5}};
        Stream<int[]> stream1 = Arrays.stream(nestedIntArr); //{1,2,3}, {4,5}
        Stream<Integer> stream2 = stream1.flatMap(new Function<int[], Stream<Integer>>() {
            @Override
            public Stream<Integer> apply(int[] ints) {
                Stream<Integer> streamOfInts = Arrays.stream(ints)
                        .mapToObj(new IntFunction<Integer>() {
                            @Override
                            public Integer apply(int value) {
                                return new Integer(value);
                            }
                        });
                return streamOfInts;
            }
        });

        //map example
        String s = stream2.map(new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return String.format("<%d>", integer);
            }
        })
                .collect(Collectors.joining(":"));
        System.out.println(s);
    }
}
