package collections.map;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CharIntPair {
    final int pos;
    final char ch;

    public CharIntPair(int pos, char ch) {
        this.pos = pos;
        this.ch = ch;
    }

    @Override
    public String toString() {
        return String.format("<Pos:%s:Char:%s>", pos, String.valueOf(ch));
    }

    public static void main(String[] args) {
        String origin = "This is a test string";
        for (int i = 0; i < origin.length(); i++) {
            System.out.print(origin.charAt(i));
        }
        System.out.println();

        List<CharIntPair> collect = IntStream
                .range(0, origin.length())
                .mapToObj(index -> new CharIntPair(index, origin.charAt(index)))
                .collect(Collectors.toList());
        System.out.println(collect);

        CharCounter charCounter = new CharCounter();
        for (int i = 0; i < origin.length(); i++) {
            charCounter.add(new Pair<>(origin.charAt(i), i));
        }
    }
}
