package Day10;

import javax.xml.transform.sax.SAXResult;
import java.awt.*;
import java.rmi.ConnectIOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetProgram {
    static void ListDisplay(Set<String> n)
    {
        int s=0;
        System.out.println("*********************");
        System.out.println("Displaying List...");
        System.out.println("*********************");
        for(String name : n)
        {
            s++;
            System.out.println(s+". "+name);
        }
        System.out.println("*********************");
    }
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
       String namesAdd[] = {"Alice", "Bob", "Alice", "Eve", "Charlie"};
       for(String name : namesAdd)
       {
           if(names.add(name))
           {
               System.out.println(name+"is Adding to List...");

           }
           else
           {
               System.out.println(name+" is Already Added.");
           }
       }
        ListDisplay(names);


    }
}
