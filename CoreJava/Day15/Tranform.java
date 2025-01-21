package Day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Tranform {
    public static void ConvertToUpperCase(List<Students> list, Function<Students,String> function)
    {
        Map<String,String> map = new HashMap<>();
        for(Students list1 : list)
            map.put(list1.getName(),"Student : "+function.apply(list1));
        for (Map.Entry<String,String> entry : map.entrySet())
            System.out.println("Name : "+entry.getKey()+" && "+entry.getValue());
    }
        public static void main(String[] args){
            Students s1 = new Students("Kavin", 7.5);
            Students s2 = new Students("Manoj", 7.2);
            Students s3 = new Students("Poovarasan", 7.8);
            Students s4 = new Students("Teddy", 8.5);
            Students s5 = new Students("Rocky", 6.5);

            List<Students> list = new ArrayList<Students>();
            list.add(s1);
            list.add(s2);
            list.add(s3);
            list.add(s4);
            list.add(s5);
            ConvertToUpperCase(list,(str)-> str.getName().toUpperCase());
        }
    }

