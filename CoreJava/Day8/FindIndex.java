package Day8;

public class FindIndex {
    public static void result(int[] arr,int t)
    {
        int i,j;
        int n = arr.length;
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if((arr[i]+arr[j]) == t)
                {
                    System.out.println("Sum of Index "+i+" and "+"Index "+j+" is Equal to "+t);
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,11,15,7};
        int target = 9;
        result(arr,target);
    }
}
