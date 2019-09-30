package streams;

import algorithms.AlgorithmOperations;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo1 {

    public static List<Integer> generateListInts(int from, int to, int size) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(from + (int) (Math.random() * (to - from + 1)));
        }
        return result;
    }

    public static List<Integer> topTenInArrayList(List<Integer> origin) {
        return origin
                .stream()
                .sorted(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2 - o1;
                    }
                })
                .limit(10)
                .collect(Collectors.toList());
    }

    public static void printAmazingArrayList(List<Integer> origin) {
        StringJoiner sj = new StringJoiner(":", "<", ">");
        origin.forEach(e -> sj.add(String.valueOf(e)));
        System.out.println(sj);
    }

    public static Map<Integer, Long> countListDuplicates(List<Integer> origin) {
        return origin
                .stream()
                .collect(Collectors.groupingBy(p -> p, Collectors.counting()));
    }

    public static List<Integer> generateEvenIntList(int upperLimit, int size) {
        return Stream.generate(new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * (upperLimit + 1));
            }
        })
                .limit(size)
                .filter(p -> p % 2 == 0)
                .collect(Collectors.toList());
    }

    public static PriorityQueue<Integer> generateOddIntPriorityQueue(int upperLimit, int size){
        return Stream.generate(new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * (upperLimit + 1));
            }
        })
                .limit(size)
                .filter(p -> p % 2 != 0)
                .collect(Collectors.toCollection(PriorityQueue::new));
    }

    public static void main(String[] args) {
        List<Integer> origin = generateListInts(0, 10, 20);
        System.out.println(origin);

        System.out.println(topTenInArrayList(origin));
        printAmazingArrayList(origin);
        System.out.println(countListDuplicates(origin));
        System.out.println(generateEvenIntList(100, 20));
        System.out.println(generateOddIntPriorityQueue(100, 20));
    }
}
