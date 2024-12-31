package Day3;
import java.util.*;
public class Transpose {
    public static void main(String[] args) {
        int i,j,sum=0,r,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size : ");
        r=sc.nextInt();
        System.out.println("Enter column size : ");
        c=sc.nextInt();
        int arr1[][]=new int[r][c];
        int arr2[][]= new int[c][r];

        System.out.println("Enter Array1 Values : ");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                arr1[i][j]=sc.nextInt();
                // System.out.println(arr1[i][j]+" ");
            }
            // System.out.println();
        }
        System.out.println("2D Array Before Transpose : ");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("2D Array After Transpose : ");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                arr2[j][i]=arr1[i][j];
            }
        }
        for(i=0;i<c;i++)
        {
            for(j=0;j<r;j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

    }
}
