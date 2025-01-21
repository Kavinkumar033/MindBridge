package Day15;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindLetterStarting {
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
            System.out.println("Name Starts With K...");
            Predicate<Students> predicate = (ref)-> ref.getName().startsWith("K");
           for (Students list1 : list)
           {
               if(predicate.test(list1))
               {
                   System.out.println(list1.getName());
               }
           }
        }
    }

