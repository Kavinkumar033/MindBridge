package Day7;

import java.util.Scanner;

public class WordRepeating {
    public static void main(String[] args) {
        String sentence;
        String word;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        sentence=sc.nextLine();
        System.out.println("Enter word : ");
        word = sc.nextLine();
        int i,count=0;
       if(word.length()%2==0)
       {
           for (i=0;i<sentence.length()-1;i++)
           {
               if(sentence.substring(i,i+2).equals(word))
               {
                   count++;
               }
           }
       }
       else {
           for (i=0;i<sentence.length()-2;i++)
           {
               if(sentence.substring(i,i+3).equals(word))
               {
                   count++;
               }
           }
       }
        System.out.println(count);
     }
}
