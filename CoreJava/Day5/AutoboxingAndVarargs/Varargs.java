//Create a method sum(int... numbers) that takes a variable number of integers as input and returns their sum. Test it with different numbers of arguments.
package Day5.shapes;

public class Varargs {
    public static int sum(int...numbers)
    {
        int sum=0;
        for(int b : numbers)
        {
            sum=sum+b;
        }
        return sum;
    }
    public static double sum(double...numbers)
    {
        double sum=0;
        for(double b : numbers)
        {
            sum=sum+b;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Sum of Integers : "+sum(1,2,3));
        System.out.println("Sum od Double : "+sum(56.8,45.00,334.56));
    }
}
