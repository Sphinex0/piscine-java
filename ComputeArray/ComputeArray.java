import java.util.Arrays;

public class ComputeArray {
    public static int[] computeArray(int[] array) {
        return array == null ? new int[]{} : Arrays.stream(array)
                .map(e -> {
                    if (e % 3 == 0) {
                        return e * 5;
                    } else if (e % 3 == 1) {
                        return e + (e>0?7:-7);
                    } else {
                        return e;
                    }
                }).toArray();
    }
}