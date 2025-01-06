package Day7;

import java.util.Scanner;

public class PalindromeCheck {
   static boolean isPalindrome(String str)
    {
        int l=0,r=str.length()-1;
        while (l<r)
        {
            if(str.charAt(l)!= str.charAt(r))
            {
                return check(str,l+1,r);
            }
            l++;
            r--;
        }
        return true;
    }

    static boolean check(String str,int l,int r)
    {
        while (l<r)
        {
            if(str.charAt(l)!=str.charAt(r))
            {
                return  false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str= sc.nextLine();
        boolean result = isPalindrome(str);
        System.out.println(str+" -> "+result);
    }
}
