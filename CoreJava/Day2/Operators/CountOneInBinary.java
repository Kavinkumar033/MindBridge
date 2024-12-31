//Create a program to find the count of 1s in the binary representation of a number.
package Day2;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class CountOneInBinary {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int count=0;
    while(n>0){
        if(n%2==1){
            count++;
        }
        n=n/2;
    }
    System.out.println(count);
    }
}
