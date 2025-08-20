import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {
    public static Map<Character, List<String>> mapByFirstLetter(Stream<String> s) {
        // Map<Character, List<String>> res = new HashMap<>();
        // s.forEach((word) -> {
        // Character key = word.toUpperCase().charAt(0);
        // if (!res.containsKey(key)) {
        // res.put(key, new ArrayList<>());
        // }
        // res.get(key).add(word);

        // });

        // return res;
        return s.collect(Collectors.groupingBy(word -> word.toUpperCase().charAt(0)));
    }

    public static Map<Integer, Optional<Integer>> getMaxByModulo4(Stream<Integer> s) {
        return s.collect(Collectors.groupingBy(num -> num % 4, Collectors.maxBy(Integer::compareTo)));
    }

    public static String orderAndConcatWithSharp(Stream<String> s) {
        return "{"+s.sorted().collect(Collectors.joining(" # "))+"}";
    }
}