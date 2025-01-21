package Day16;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void BiConsumerSum(Map<Integer,Integer> map1 , BiConsumer<Integer,Integer> biConsumer)
    {
       for(Map.Entry<Integer,Integer> map2 : map1.entrySet())
       {
           biConsumer.accept(map2.getKey(),map2.getValue());
       }
    }
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(5,8);
        map.put(7,3);
        BiConsumerSum(map , (num1,num2)-> System.out.println(num1+" + "+num2+" = "+(num1+num2)));
    }
}
