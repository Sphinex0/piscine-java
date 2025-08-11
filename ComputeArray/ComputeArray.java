import java.util.Arrays;

public class ComputeArray {
    public static int[] computeArray(int[] array) {
        return Arrays.stream(array)
        .map(e->{
            if (e % 3==0){
                return e*5;
            }else if ((e-1)%3==0){
                return e+7;
            }else{
                return e;
            }
        }).toArray();
    }
}