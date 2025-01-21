package Day15;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindLetterStarting {
    public static List<Students> FindStrings(List<Students> list,char letter)
    {
        return list.stream().filter(students -> students.getName().startsWith(String.valueOf(letter))).collect(Collectors.toList());
    }
        public static void main (String[] args){
            Students s1 = new Students("Kavin", 7.5);
            Students s2 = new Students("Manoj", 7.2);
            Students s3 = new Students("Poovarasan", 7.8);
            Students s4 = new Students("Kavi", 8.5);
            Students s5 = new Students("Rocky", 6.5);

            List<Students> list = new ArrayList<Students>();
            list.add(s1);
            list.add(s2);
            list.add(s3);
            list.add(s4);
            list.add(s5);
            char ch ='K';
            List<Students> list2 = FindStrings(list,ch);
            list2.forEach(students -> System.out.println(students.getName()));
            System.out.println("These are the names starts with '"+ch+"'...");
        }
    }

