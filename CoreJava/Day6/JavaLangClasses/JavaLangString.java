//String - Manipulate a string by finding its length, converting it to uppercase, and extracting a substring.
package Day6;

public class JavaLangString {
    public static void main(String[] args) {
        String str = "Kavin Kumar ,Welcome!..";
        String up = str.toUpperCase();
        int lenght = str.length();
        String sub = str.substring(13);
        System.out.println("Input String : "+str);
        System.out.println("Length of String : "+lenght);
        System.out.println("UpperCase of String :  "+up);
        System.out.println("SubString Start from index 13 : "+sub);
    }
}
