package Day3;
import java.util.*;
public class FindLargeAndSmallElements {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter 5 Elements : ");
        for( i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Largest Elements : "+arr[4]+"|| Smallest Elements : "+arr[0]);
    }
}
