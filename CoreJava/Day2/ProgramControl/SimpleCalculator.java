//Create a program to simulate a simple calculator using switch-case.
package Day2;
import java.util.*;
public class SimpleCalculator {
    public static void main(String[] args) {
        int num1,num2,c,n=1;
        Scanner sc = new Scanner(System.in);

        while(n!=0) {
            System.out.println("Enter two number to Calculate");
            num1=sc.nextInt();
            num2=sc.nextInt();
            System.out.println("Simple Calculator");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiple");
            System.out.println("4.Divide");
            System.out.println("5.Module");
            System.out.println("Enter operation number to perform : ");
            c=sc.nextInt();
            switch (c) {
                case 1:
                    System.out.println("Addition : " + num1 + "+" + num2 + " :" + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Subtraction : " + num1 + "-" + num2 + " :" + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Multiple : " + num1 + "*" + num2 + " :" + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Divide : " + num1 + "/" + num2 + " :" + (num1 / num2));
                    break;
                case 5:
                    System.out.println("Module : " + num1 + "%" + num2 + " :" + (num1 % num2));
                    break;
                default:
                    System.out.println("Invalid Operation");
            }
            System.out.println("For Continue Enter 1 or Exit Enter 0");
            n=sc.nextInt();
        }
    }
}
