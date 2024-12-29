package Day2;
import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year : ");
        year=sc.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println(year+" is a Leap year");
                }
                else
                {
                    System.out.println(year+" is not a Leap year");
                }
            }
            else {
                System.out.println(year+" is a Leap year");
            }
        }
        else {
            System.out.println(year+" is not Leap Year");
        }
    }
}
