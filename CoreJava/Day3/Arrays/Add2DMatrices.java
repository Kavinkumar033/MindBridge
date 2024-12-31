//Write a program to add two 2D matrices.
package Day3;
import java.util.*;
public class Add2DMatrices {
    public static void main(String[] args) {
        int i,j,sum=0,r,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size : ");
        r=sc.nextInt();
        System.out.println("Enter column size : ");
        c=sc.nextInt();
        int arr1[][]=new int[r][c];
        int arr2[][]= new int[r][c];
        int arr3[][]= new int[r][c];
        System.out.println("Enter Array1 Values : ");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Array2 Values : ");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                arr2[i][j]=sc.nextInt();

            }

        }
        System.out.println("Sum of two 2D Matrices are : ");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                arr3[i][j]=arr1[i][j]+arr2[i][j];

            }

        }
        System.out.println("2D Array1 Elements");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {

                System.out.print(arr1[i][j]+" ");
            }
             System.out.println();
        }
        System.out.println("2D Array2 Elements");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {

                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum of 2D Array Elements");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {

                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
