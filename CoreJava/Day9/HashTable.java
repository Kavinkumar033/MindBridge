package Day9;
import java.io.FilterOutputStream;
import java.util.Collections;
import java.util.*;
public class HashTable {
    public static void main(String[] args) {
        Hashtable<String,Long> contact = new Hashtable<>();
        contact.put("Kavin", 6385454330L);
        contact.put("Purusoth",2312454330L);
        contact.put("Anand", 3333333330L);
        contact.put("Manoj", 4444444444L);
        contact.put("Teddy", 5555555555L);
        System.out.println("Contact Directory");
        for(var k : contact.entrySet())
        {
            System.out.println(k.getKey()+" : "+k.getValue());
        }
        String name = "Teddy";
        System.out.println("Search Result for "+name+" : "+contact.get(name));
        System.out.println("After Removal...");
        contact.remove("Manoj");
        int length = contact.size();
        for(var k : contact.entrySet())
        {
            System.out.println(k.getKey()+" : "+k.getValue());
        }

    }
}
