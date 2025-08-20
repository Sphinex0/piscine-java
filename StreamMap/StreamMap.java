import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {
    public static Integer sumOfStringLength(Stream<String> s) {
        return s.collect(Collectors.joining()).length();
    }

    public static List<String> upperCaseAllString(Stream<String> s) {
        return s.map(word -> word.toUpperCase()).toList();
    }

    public static Set<Integer> uniqIntValuesGreaterThan42(Stream<Double> s) {
        return s.filter((el) -> el > 42.).map((el) -> ((int) el.doubleValue())).collect(Collectors.toSet());
    }
}