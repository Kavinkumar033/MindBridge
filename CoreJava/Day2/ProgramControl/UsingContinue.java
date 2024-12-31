//Write a program to print all numbers from 1 to 100, skipping multiples of 5 (use continue).package Day2;

public class UsingContinue {
    public static void main(String[] args) {
        int n=100,i;
        for(i=1;i<=n;i++)
        {
            if(i%5==0)
            {
                continue;
            }
            else {
                System.out.print(i+" ");
            }
        }
    }
}
