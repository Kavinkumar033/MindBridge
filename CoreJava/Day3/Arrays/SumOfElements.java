package Day3;
import java.util.*;
public class SumOfElements {
    public static void main(String[] args) {
        int size,i,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        size = sc.nextInt();
        System.out.println("Enter "+size+" Elements : ");
        int arr[]=new int[size];
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("Sum of Array Elements : "+sum);

    }
}
