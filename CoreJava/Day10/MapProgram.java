package Day10;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    static void DisplayMap(Map<String , Integer> details)
    {
        int i=0;
        System.out.println("***********************");
        for(Map.Entry<String,Integer> entry : details.entrySet())
        {
            i++;
            System.out.println(i+". "+entry.getKey()+": "+entry.getValue());
        }
        System.out.println("***********************");
    }
    public static void main(String[] args) {
        Map<String,Integer> StudentDetails = new HashMap<>();
        StudentDetails.put("Kavin",80);
        StudentDetails.put("Manoj",82);
        StudentDetails.put("Gnana",84);
        StudentDetails.put("Anand",86);
        StudentDetails.put("Sanjay",90);
         DisplayMap(StudentDetails);
        System.out.println("Updating Grade (Kavin:92) : ");
        StudentDetails.put("Kavin",92);
        DisplayMap(StudentDetails);
        System.out.println("Reteiving gnana's Grade : "+StudentDetails.get("Gnana"));
        DisplayMap(StudentDetails);

    }
}
