import java.util.List;
import java.util.Map;

public class ExerciseRunner {

    public static void main(String[] args) {
        Map<String, List<String>> men = Map.of(
                "Alice", List.of("Maths", "Littérature", "Physique", "Economie", "Histoire"),
                "Bob", List.of("Littérature", "Economie", "Physique", "Maths", "Histoire"),
                "Charlie", List.of("Physique", "Littérature", "Economie", "Histoire", "Maths"),
                "Daphnee", List.of("Littérature", "Histoire", "Physique", "Economie", "Maths"),
                "Emily", List.of("Physique", "Maths", "Economie", "Histoire", "Littérature"));
        Map<String, List<String>> women = Map.of(
                "Maths", List.of("Alice", "Bob", "Charlie", "Daphnee", "Emily"),
                "Littérature", List.of("Charlie", "Daphnee", "Emily", "Alice", "Bob"),
                "Physique", List.of("Charlie", "Alice", "Daphnee", "Bob", "Emily"),
                "Economie", List.of("Daphnee", "Emily", "Charlie", "Alice", "Bob"),
                "Histoire", List.of("Emily", "Bob", "Alice", "Charlie", "Daphnee"));
        Map<String, String> res = WeddingComplex.createBestCouple(men, women);
        System.err.println(res);
    }
}