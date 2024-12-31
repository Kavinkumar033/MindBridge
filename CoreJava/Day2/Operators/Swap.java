//Write a program to swap two numbers without using a third variable (use XOR).
package Day2;
import java.util.*;
public class Swap {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number to Swap : ");
        num1=sc.nextInt();
        num2=sc.nextInt();
        System.out.println("Before Swap : num1 = "+num1+" num2 = "+num2);
        num1=num1^num2;
        num2=num1^num2;
        num1=num1^num2;
        System.out.println("After Swap : num1 = "+num1+" num2 = "+num2);
    }
}
