package collections.map;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class CharCounter {
    private final Map<Character, ArrayList<Integer>> storage = new HashMap<>();

    void add(Pair<Character, Integer> pair) {
        Character ch = pair.a;
        Integer pos = pair.b;
        boolean alreadyExist = storage.containsKey(ch);

        ArrayList<Integer> ints;
        if (alreadyExist) {
            ints = storage.get(ch);
        } else {
            ints = new ArrayList<>();
        }
        ints.add(pos);
        storage.put(ch, ints);
    }

    Map<Character, ArrayList<Integer>> get() {
        return storage;
    }

    Map<Character, Integer> getNumberOfChars1() {
        Map<Character, Integer> numberOfChars = new HashMap<>();
        Set<Map.Entry<Character, ArrayList<Integer>>> storageSet = storage.entrySet();
        for (Map.Entry<Character, ArrayList<Integer>> entry : storageSet) {
            Character ch = entry.getKey();
            int num = entry.getValue().size();
            numberOfChars.put(ch, num);
        }
        return numberOfChars;
    }

    Map<Character, Integer> getNumberOfChars2() {
        Map<Character, Integer> numberOfChars = new HashMap<>();
        storage.forEach((ch, list) -> numberOfChars.put(ch, list.size()));
        return numberOfChars;
    }

    List<Pair<Character, Integer>> getNumberOfChars3() {
        return storage.entrySet()
                .stream()
                .map(el -> new Pair<>(el.getKey(), el.getValue().size()))
                .collect(Collectors.toList());
    }

    Map<Character, Pair<Integer, List<Integer>>> getNumOfCharsWithPositions1() {
        Map<Character, Pair<Integer, List<Integer>>> result = new HashMap<>();
        storage.forEach((ch, list) -> result.put(ch, new Pair<>(list.size(), list)));
        return result;
    }

    Map<Character, Pair<Integer, List<Integer>>> getNumOfCharsWithPositions2() {
        Map<Character, Pair<Integer, List<Integer>>> result = new HashMap<>();

        BiConsumer<Character, List<Integer>> function = new BiConsumer<Character, List<Integer>>() {
            @Override
            public void accept(Character character, List<Integer> integers) {
                result.put(character, new Pair<Integer, List<Integer>>(integers.size(), integers));
            }
        };

        storage.forEach(function);
        return result;
    }

    Map<Character, Pair<Integer, List<Integer>>> getNumOfCharsWithPositions3() {
        Map<Character, Pair<Integer, List<Integer>>> result = new HashMap<>();
        BiConsumer<Character, List<Integer>> function = (character, integers) ->
                result.put(character, new Pair<Integer, List<Integer>>(integers.size(), integers));
        storage.forEach(function);
        return result;
    }

}
