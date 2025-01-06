package Day7;

import javax.swing.plaf.IconUIResource;

public class FindIndex {
    public static void main(String[] args) {
        int arr[]={2,7,11,5};
        int target=13;
        int count=0;
        int i,j;
        for(i=0;i<arr.length-1;i++)
        {
            for (j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j] == target)
                {
                    System.out.println("Sum of Index "+i+" and "+(j)+" is equal to "+target);
                    count++;
                    break;
                }
                if (count==1)
                {
                    break;
                }
            }

        }
    }
}
