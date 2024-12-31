//Create a program to check if a number is prime using logical operators.
package Day2;
import java.util.*;
public class PrimeNumberCheck {
    public static void main(String[] args) {
        int number,i,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        number=sc.nextInt();
        if(number==0 || number==1)
        {
            System.out.println(number+" is not Prime Number");
        }
        else {
            for(i=2;i<=number;i++)
            {
                if(number%i==0)
                {
                    count++;
                }
            }
            if(count==1 && number > 0)
            {
                System.out.println(number+" is Prime Number");
            }
            else {
                System.out.println(number+" is not Prime Number");
            }
        }

    }
}
