package Day8;

import java.util.Arrays;

public class FindingMissingNumber {
    public static void main(String[] args) {
        int arr[] = {3,0,1,2,5};
        Arrays.sort(arr);
        int st=arr[0],i;
        for (i=0;i<arr.length;i++)
        {
            if(st==arr[i])
            {
                st++;
                continue;
            }
            else
            {
                System.out.println("Missing Number is : "+st);
                break;
            }
        }
    }
}
