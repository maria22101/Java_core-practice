package collections.iterable;

import java.util.Iterator;

public class IterableEx01 implements Iterable<String>{
    String[] it = {"first", "second", "third", "fourth"};

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            int counter = 0;
            @Override
            public boolean hasNext() {
                return counter < it.length;
            }

            @Override
            public String next() {
                return it[counter++];
            }
        };
    }

    public static void main(String[] args) {
        IterableEx01 itEx = new IterableEx01();
        for (String i : itEx) {
            System.out.print(i + " ");
        }
    }
}
