package Day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StringStartswithLetter {
    public static void filterString(List<String> list, Predicate<String> predicate)
    {
        for (String str : list)
        {
            if(predicate.test(str))
            {
                System.out.println(str);
            }
        }
    }
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Avocado");
        list.add("Cherry");
       // char ch ='A';
        filterString(list,(listone) -> listone.startsWith("A"));
    }
}
