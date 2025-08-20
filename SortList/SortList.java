import java.util.ArrayList;
import java.util.List;

public class SortList {

    public static List<Integer> sort(List<Integer> list) {
        List<Integer> l = new ArrayList<>(list);
        l.sort(null);
        return l;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        List<Integer> l = new ArrayList<>(list);
        l.sort((a, b) -> Integer.compare(b, a));
        return l;
    }
}