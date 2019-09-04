package collections.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
                .collect(Collectors.toList()); //List of CharIntPair(s) created
        System.out.println(collect);

        CharCounter charCounter = new CharCounter();
        for (int i = 0; i < origin.length(); i++) {
            charCounter.add(new Pair<>(origin.charAt(i), i)); // the Pair<Character, Integer> becomes/updates an element of the charCounter's storage(map)
        }

        System.out.println(charCounter.get()); //printing out the storage(map): positions occupied by a character

        System.out.println(charCounter.getNumberOfChars1()); //how many times a character occurs in the string (in form of a Map<Character, Integer>)

        System.out.println(charCounter.getNumberOfChars2()); //the same as above

        System.out.println(charCounter.getNumberOfChars3()); //how many times a character occurs in the string (in form of a List<Pair<Character, Integer>>)

        System.out.println(charCounter.getNumOfCharsWithPositions1());//how many times a character occurs in the string and positions of its occurrence(in form of a Map)

        System.out.println(charCounter.getNumOfCharsWithPositions2());//the same as above

        System.out.println(charCounter.getNumOfCharsWithPositions3());//the same as above
    }
}
