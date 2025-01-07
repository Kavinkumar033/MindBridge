package Day9;

import java.util.ArrayList;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<>();
        list.add("Milk");
        list.add("Egg");
        list.add("Bread");
        list.add("Butter");
        System.out.println("Shooping List...");
        System.out.println(list);
        System.out.println("After removal...");
        list.remove(2);
        System.out.println(list);
    }
}
