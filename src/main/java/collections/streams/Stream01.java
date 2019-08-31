package collections.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Stream01 {
    public static List<Integer> top3(ArrayList<Integer> origin){
        return origin
                .stream()
                .sorted(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2 - o1;
                    }
                })
                .limit(3)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            a.add((int) (Math.random() * 101));
        }
        System.out.println(a);

        System.out.println(top3(a));

        StringJoiner sj = new StringJoiner(":", "<", ">");
        a.forEach(p -> sj.add(String.valueOf(p)));
        System.out.println(sj);

        Map<Integer, Long> map = a
                .stream()
                .collect(Collectors.groupingBy(v -> v, Collectors.counting()));
        System.out.println(map);
    }

}
