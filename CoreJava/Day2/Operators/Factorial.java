package Day2;
import java.sql.SQLOutput;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        int number ,i,fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Factorial Number : ");
        number = sc .nextInt();
        for(i=1;i<=number;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is "+fact);
    }
}
