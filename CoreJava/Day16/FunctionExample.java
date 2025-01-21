package Day16;

import java.util.Map;
import java.util.function.Function;

public class FunctionExample {
    public  static  void  StringLengthFind(String strs[] , Function<String,Integer> function )
    {
        for(String s : strs)
        {
            System.out.println(s+" : "+function.apply(s));
        }
    }
    public static void main(String[] args) {
        String words[] = {"Hello", "World", "Java"};
        StringLengthFind(words,(str)->str.length()) ;
        System.out.println("--------------------------------------------------------------");
        Function<String,Integer> function = (str)->str.length();
        for(String s : words)
        {
            System.out.println(s+" : "+function.apply(s));
        }
    }
}
