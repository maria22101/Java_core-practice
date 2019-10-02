package streams;

import algorithms.AlgorithmOperations;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.*;

public class StreamsDemo2 {

    public static void main(String[] args) {
        int[] data = AlgorithmOperations.generateArray(0, 20, 6);
        System.out.println(Arrays.toString(data));

        //finding elements of data array > 5 and composing a List collection;
        //boxing required as primitives are not required for collections.
        List<Integer> list1 = Arrays.stream(data)
                .boxed()
                .filter(l -> l > 5)
                .collect(Collectors.toList());

        //applying a function given in "map" to all stream's elements and compose a LinkedList collection
        List<Integer> list2 = Arrays.stream(data)
                .boxed()
                .map(x -> x * 2)
                .collect(Collectors.toCollection(LinkedList::new));

        //There are three streams for primitives:
        IntStream intStream = IntStream.of(2, 3, 4, 5);
        LongStream longStream = LongStream.of(2, 3, 4, 5);
        DoubleStream doubleStream = DoubleStream.of(2.1, 3.2, 4.3, 5.4);

        //printing out alphabet
        IntStream.rangeClosed('A', 'Z')
                .mapToObj(a -> (char) a)
                .forEach(System.out::print);
        System.out.println();

        //joining a string using String stream
        String stringJoined = Stream.of("Mia", "Mila", "Masha", "Monica", "Magdalena")
                                    .collect(Collectors.joining(":","<",">"));
        System.out.println(stringJoined);
    }
}
