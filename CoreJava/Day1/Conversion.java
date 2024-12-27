import java.util.Scanner;
public class Conversion {
    public static void main(String[] args) {
        float f;
        Scanner sc = new Scanner(System.in);
        f=sc.nextFloat();
        int ConvertInt = (int) f;
        System.out.println("Float value : "+f);
        System.out.println("After Conversion : "+ConvertInt);
    }
}
