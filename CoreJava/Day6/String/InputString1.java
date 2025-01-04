//1) Write a program that takes a sentence as input from the user and performs the following operations:
//Count the number of words in the sentence.
//Reverse the entire sentence.
//Replace all vowels in the sentence with the character '*'.
package Day6;
import java.util.Scanner;
public class InputString1 {
    public static void main(String[] args) {
        String str;
        String[] words;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String Sentence : ");
        str = sc.nextLine();
       words=str.split(" ");
        System.out.println("No of Words : "+words.length);
        StringBuilder rev =new StringBuilder(str);
        System.out.println("String Reverse : "+rev.reverse().toString());
        System.out.println("Replaceing All Vowels into Character : "+str.replaceAll("[AEIOUaeiou]","*"));

    }
}
