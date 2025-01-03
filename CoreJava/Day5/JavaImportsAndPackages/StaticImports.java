//Use Math class methods like sqrt() and pow() in a program to calculate the hypotenuse of a right-angled triangle using static imports.
package Day5.shapes;
import java.util.Scanner;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
public class StaticImports {
    public static void main(String[] args) {
        double base;
        double height;
        Scanner sc = new Scanner(System.in);
        System.out.println("*****HypotenuseCalculator*****");
        System.out.println("Enter Base Value : ");
        base=sc.nextInt();
        System.out.println("Enter Heigth Value : ");
        height=sc.nextInt();
        System.out.println("Hypotenuse of triangle : "+sqrt(pow(base,2)+pow(height,2)));
    }
}
