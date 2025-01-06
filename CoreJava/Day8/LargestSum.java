package Day8;

public class LargestSum {
    public static int largesum(int[] arr)
    {
        int large=0;
        int sum,i,j;
        for(i=0;i<arr.length-1;i++)
        {
            sum=arr[i];
            for (j=i+1;j<arr.length;j++)
            {
                sum=sum+arr[j];
                if(sum>large)
                {
                    large=sum;
                }
            }
        }
        return large;
    }
    public static void main(String[] args) {
        int arr[]={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int large = largesum(arr);
        System.out.println("Largest sum : "+large);

    }
}
