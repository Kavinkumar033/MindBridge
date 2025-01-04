//Write a program that:
//Accepts two integers from the user as input.
//Attempts to divide the first integer by the second.
//Implements exception handling to manage the following scenarios:
//Division by zero: Display an error message "Error: Division by zero is not allowed.".
//Invalid input: Display an error message "Error: Please enter valid integers.".
//Any other exceptions: Display "An unexpected error occurred.".
package Day6;
import java.util.*;
public class ExceptionHandling {
    public static void main(String[] args) {
        int num1,num2,res;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter num1 : ");
            num1=sc.nextInt();
            System.out.println("Enter num1 : ");
            num2=sc.nextInt();
            res=num1/num2;
            System.out.println("Result : "+res);
        }
        catch (ArithmeticException e)
        {
            System.err.println("Error: Division by zero is not allowed.");
        }
        catch (InputMismatchException e)
        {
            System.err.println("Error: Please enter valid integers.");
        }
        catch (Exception e)
        {
            System.err.println("An unexpected error occurred.");
        }
    }
}
