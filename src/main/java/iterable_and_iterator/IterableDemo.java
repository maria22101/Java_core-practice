package iterable_and_iterator;

import java.util.Iterator;

public class IterableDemo {
    public static void main(String[] args) {

        Days days = new Days();

        Iterator<String> it = days.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
