//Create a program to reverse a given number.
package Day2;
import java.util.*;
public class NumberReverse {
    public static void main(String[] args) {
        int num,rev=0,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to reverse : ");
        num=sc.nextInt();
        int temp=num;
        while(temp!=0)
        {
            m=temp%10;
            rev=rev * 10 + m;
            temp=temp/10;
        }
        System.out.println("Before reverse : number = "+num);
        System.out.println("After recerse : number = "+rev);
    }
}
