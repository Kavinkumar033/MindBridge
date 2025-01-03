//Write a program to add a list of integers using a List<Integer> and demonstrate how autoboxing allows seamless addition of primitive int.
package Day5.shapes;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxing {
    public static void main(String[] args) {
        int sum=0;
        List<Integer> a = new ArrayList<>();
        a.add(34);
        a.add(45);
        a.add(12);
        a.add(13);
        a.add(76);
        for(int num : a)
        {
            sum = sum+num;
        }
        System.out.println("ArrayList Elements : "+a);
        System.out.println("Sum of ArrayList : "+sum);
    }
}
