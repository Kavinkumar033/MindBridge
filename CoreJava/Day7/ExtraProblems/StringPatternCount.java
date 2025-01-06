package Day7;
import java.util.*;

public class StringPatternCount {

    static int patternWordCount(String[] pattern,String word)
    {
        int count=0;
        for(String wd : pattern)
        {
            if(word.contains(wd))
            {
                count++;
            }
        }

        return  count;
    }
    public static void main(String[] args) {
        String patterns[]= {"a","bc","abc","vx"};
        String word = "abc";
        int result = patternWordCount(patterns,word);
        System.out.println("Word Contains Patterns Count : "+result);
    }
}
