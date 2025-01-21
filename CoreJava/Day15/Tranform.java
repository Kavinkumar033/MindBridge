package Day15;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Tranform {
    public static Map<String,String> StringTransform(List<Students> names)
    {
        return names.stream().collect(Collectors.toMap(name->name.getName(),name->"Student : "+name.getName().toUpperCase()));

        //return names.stream().collect(Collectors.toMap(name->name.getName(),name->name.getName().toUpperCase()));
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

            Map<String , String> trans = StringTransform(list);
            trans.forEach((original, transformed)-> System.out.println("Original : "+original+" [ Tranformed : "+transformed+" ]"));
        }
    }

