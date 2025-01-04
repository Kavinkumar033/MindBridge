//2) Write a program that:
//Takes two strings as input from the user.
//Compares them lexicographically using compareTo() method.
//Checks if the two strings are equal (case-sensitive and case-insensitive).
//Concatenates the two strings and prints the result.
package Day6;
import java.util.*;
public class InputString2 {
    public static void main(String[] args) {
        String str1,str2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String1 : ");
        str1 = sc.nextLine();
        System.out.println("Enter String2 : ");
        str2 = sc.nextLine();
        int comparison = str1.compareTo(str2);
        if(comparison>0)
        {
            System.out.println("Str1 is lexicographically greater than str2");
        } else if (comparison<0) {
            System.out.println("Str1 is lexicographically Smaller than str2");
        }
        else
        {
            System.out.println("Both String are lexicographically equal.");
        }
        if(str1.equals(str2))
        {
            System.out.println("The two strings are equal...");
        }
        else {
            System.out.println("The two strings are not equal...");
        }
        if(str1.equalsIgnoreCase(str2))
        {
            System.out.println("The two strings are equal...case insensitive");
        }
        else
        {
            System.out.println("The two strings are not equal...case insensitive");
        }
        String concat = str1+str2;
        System.out.println("Conadination of two String : "+concat);
    }
}
