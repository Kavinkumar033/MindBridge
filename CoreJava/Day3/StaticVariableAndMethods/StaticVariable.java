package Day3;
class Counter
{
    static int count=0;
    Counter()
    {
        count++;
    }
    public static void DisplayCount()
    {
        System.out.println(count+" Objects Created...");
    }
}
public class StaticVariable {

    public static void main(String[] args) {
   Counter c1 = new Counter();
   Counter c2 = new Counter();
   Counter c3 = new Counter();
   Counter c4 = new Counter();
   Counter.DisplayCount();

    }
}