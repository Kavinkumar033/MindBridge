//Write a Java program that takes two numbers as input from the user and divides the first number by the second. Handle the following exceptions:
//ArithmeticException: If the second number is zero, display an error message: "Division by zero is not allowed."
//InputMismatchException: If the user enters non-numeric input, display an error message: "Invalid input. Please enter numeric values."
//General Exception: For any other unexpected errors, display a generic error message: "An error occurred: [error message]."
package Day7;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 extends Throwable {
    public static void main(String[] args) {
        int num1,num2,div;
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.println("Enter num1 : ");
            num1=sc.nextInt();
            System.out.println("Enter num2 : ");
            num2=sc.nextInt();
            div=num1/num2;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Division by zero is not allowed.");
        }
        catch (InputMismatchException e)
        {
            System.out.println("Invalid input. Please enter numeric values.");
        }
        catch (Exception e)
        {
            System.out.println("An error occurred");
        }
    }
}
