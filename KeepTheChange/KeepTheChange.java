import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class KeepTheChange {
    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        List<Integer> coin = new ArrayList<>(coins);
        Collections.sort(coin);
        Collections.reverse(coin);
        
        List<Integer> res = new ArrayList<>();

        for (int c : coin) {
            while (c <= amount && amount > 0) {
                    amount -= c;
                    res.add(c);
            }
        }

        return res;
    }
}