package collections.map;

import java.util.ArrayList;

public class Pair<A, B> {
    final A a;
    final B b;

    public Pair(A a, B b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) {
        Pair<String, Integer> name = new Pair<>("Eve", 30);
        Pair<Integer, Integer> ints = new Pair<>(12, 22);
        Pair<Character, Boolean> presence = new Pair<>('c', false);
        new ArrayList<Integer>();
        new ArrayList<Pair<String, Integer>>();
        new ArrayList<Pair<Character, Boolean>>();
        new ArrayList<Pair<Integer, Pair<Character, Boolean>>>();
        Pair<Integer, Pair<String, Boolean>> coolPair = new Pair<>(1, new Pair<>("A", true));
        Integer a = coolPair.a;
        Pair<String, Boolean> b = coolPair.b;
        String a1 = b.a;
        Boolean b1 = b.b;

    }
}
