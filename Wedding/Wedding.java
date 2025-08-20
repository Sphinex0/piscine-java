import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Wedding {
    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
        int min = Math.min(first.size(), second.size());
        List<String> first1 = new ArrayList<>(first), second1 = new ArrayList<>(second);
        Map<String, String> res = new HashMap<>();
        for (int i = 0; i < min; i++) {
            res.put(first1.get(i), second1.get(i));
        }
        return res;
    }
}