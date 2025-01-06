package Day7;
import java.lang.Math.*;
public class Chip {
    public static void main(String[] args) {
        int arr[]={1,3,2,5,4};
        int cost,even=0,odd=0;
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("Total cost is : "+Math.min(even,odd));
    }
}
