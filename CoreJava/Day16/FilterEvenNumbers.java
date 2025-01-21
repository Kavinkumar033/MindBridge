package Day16;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class FilterEvenNumbers {
    public static void evenFilter(List<Integer> list, Predicate<Integer> predicate)
    {
        List<Integer> list2 = new ArrayList<>();
        for(int num : list)
        {
            if(predicate.test(num))
            {
                list2.add(num);
            }
        }
        System.out.println(list2);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(45);
        list.add(22);
        list.add(35);
        list.add(60);
        evenFilter(list,(listone) -> (listone%2==0) );
    }

}
