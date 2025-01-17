package Day13;

public class StringPalindromeMethod {
    public boolean palin(String str){
        String reverse=new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reverse);
    }
}