//Create a program to exit a loop if the user enters the number 0 (use break).
package Day2;
import java.util.*;
public class UsingBreak {
    public static void main(String[] args) {
        int i=1,count=1;
        Scanner sc = new Scanner(System.in);
        while(i!=0)
        {
            System.out.println("Enter 1 to Continue or Enter 0 to Exit ");
            i=sc.nextInt();
            System.out.println("Count of Looping "+count);
            count++;
        }
        System.out.println("Exit Successfully");
    }
}
