package Day13;
import java.util.Arrays;

public class ArraySortingMethod {
    public int[] sort(int[] arr){
        if (arr==null){
            return null;
        }
        int[] arr2 = Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr2);
        return arr2;
    }
}