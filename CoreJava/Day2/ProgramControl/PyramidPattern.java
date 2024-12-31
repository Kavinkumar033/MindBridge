//Write a program to print a pyramid pattern using nested loops.
package Day2;

public class PyramidPattern {
    public static void main(String[] args) {
        int num=6;
        int i,j;
        for(i=1;i<=num;i++)
        {
            for(j=num;j>i;j--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
