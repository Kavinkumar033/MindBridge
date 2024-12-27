import java.util.*;
public class ArithmeticOperations {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Integer Numbers : ");
        num1=sc.nextInt();
        num2=sc.nextInt();
        System.out.println("Addition "+(num1+num2));
        System.out.println("Subtraction "+(num1-num2));
        System.out.println("Multiple "+(num1*num2));
        System.out.println("Divide "+(num1/num2));
        System.out.println("Modulus "+(num1%num2));
    }
}
