package Day10;

import java.util.Queue;
import java.util.*;

public class QueueProgram {
    public static void main(String[] args) {
        Queue<String> name = new LinkedList<>();
        name.add( "Alice");
        name.add( "Bob");
        name.add("Charlie");
        int serveCustomer =1 ;
      //  System.out.println("Enter the Number to take");
       // Scanner sc = new Scanner(System.in);
        //name=sc.nextLine();
        System.out.println("Serving : "+name.remove());
        System.out.println("Waithing : "+name);

    }
}
