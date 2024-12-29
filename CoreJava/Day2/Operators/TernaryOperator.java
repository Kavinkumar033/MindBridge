package Day2;
import java.util.*;
public class TernaryOperator {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println( ((a>b)&&(a>c)) ? "a is Largest number "  : ((b>a)&&(b>c)) ? "b is Largest number " : " c is Largest number " );
    }
}
