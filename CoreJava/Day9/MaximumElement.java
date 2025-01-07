package Day9;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(22);
        list.add(80);
        list.add(42);
        list.add(17);
        System.out.println("List...");
        System.out.println(list);
        System.out.println("Maximum Element in list : "+ Collections.max(list));
    }
}
