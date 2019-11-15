package iterable_and_iterator;

import java.util.Iterator;

public class Days implements Iterable<String> {
    private final String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

    @Override
    public Iterator<String> iterator() {

        Iterator<String> iter = new Iterator<String>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < days.length;
            }

            @Override
            public String next() {
                return days[index++];
            }
        };

        return iter;
    }
}
