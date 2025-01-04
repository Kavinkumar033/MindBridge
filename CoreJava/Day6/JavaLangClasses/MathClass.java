//Math - Perform basic mathematical operations like finding the square root, power, and maximum of two numbers.
package Day6;
import  static java.lang.Math.sqrt;
import  static java.lang.Math.pow;

public class MathClass {
    public static void main(String[] args) {
        int num1=10,num2=20;
        int base=2,exponent=4;
        System.out.println("Square Root of "+num2+" is "+sqrt(num1));
        System.out.println("Square Root of "+num1+" is "+sqrt(num2));
        System.out.println("Power of "+num1+" and "+num2+" is "+pow(base,exponent));
        System.out.println("Largest value in "+num1+" and "+num2+" is : "+ java.lang.Math.max(num1,num2));
    }
}
