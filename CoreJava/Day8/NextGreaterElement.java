package Day8;

import java.util.ArrayList;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[]={4,5,2,10,20};
        int i,j;
        ArrayList<Integer> list = new ArrayList<>();
        for(i=0;i<arr.length;i++)
        {
            if(i!=arr.length-1)
            {
                for(j=i+1;j<arr.length;j++)
                {
                    if(arr[j]>arr[i])
                    {
                        list.add(arr[j]);
                        break;
                    }
                    else
                    {
                        continue;
                    }
                }
            }
            else {
                list.add(-1);
            }
        }
        System.out.println(list);
    }
}
