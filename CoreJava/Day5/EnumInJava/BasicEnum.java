//Define an enum Day with values for all days of the week.
//Write a program to print a message like "It's a weekday" or "It's a weekend" based on the day.
package Day5.shapes;

public class BasicEnum {
    public enum Days
    {
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
    }
    public static void main(String[] args) {
           for(Days day : Days.values())
           {

               switch (day)
               {
                   case SATURDAY :
                   case SUNDAY:
                       System.out.println("It's a Weekend...");
                       break;
                   default:
                       System.out.println("It's a Weekday...");
               }
           }

    }
}
