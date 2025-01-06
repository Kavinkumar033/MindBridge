package Day8;

public class ArrayRotate {
    public static void rorate(int arr[],int k)
    {
        int i,j;
        int n=arr.length;
        int arr3[]=new int[n];

        System.arraycopy(arr,n-k,arr3,0,k);
        System.arraycopy(arr,0,arr3,k,n-k);
        System.out.print("[");
        for(i=0;i<n;i++)
        {
            System.out.print(arr3[i]);
            if(i!=(n-1))
            {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        rorate(arr,k);
    }
}
