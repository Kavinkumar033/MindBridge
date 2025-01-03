//Create a generic class Pair<K, V> to hold a key-value pair. Write a program to store and display pairs of different data types, like <String, Integer> or <Integer, String>.
package Day5.shapes;
class Pair<k,v>
{
    private k key;
    private v value;
    public Pair(k key,v value)
    {
        this.key=key;
        this.value=value;
    }

    public k getKey() {
        return key;
    }

    public void setKey(k key) {
        this.key = key;
    }

    public void setValue(v value) {
        this.value = value;
    }

    public v getValue() {
        return value;
    }
    public void DisplayGeneric()
    {
        System.out.println("Pair { "+key+", "+value+" }");
    }
}
public class GenericClass {
    public static void main(String[] args) {
       Pair<String,Integer> p1 = new Pair<>("Kavin",33);
        p1.DisplayGeneric();
        Pair<Integer,String > p2 = new Pair<>(44,"Manoj");
        p2.DisplayGeneric();
        Pair<Boolean,Double> p3 = new Pair<>(true,56.00);
     p3.DisplayGeneric();
    }
}
