public class Primitive {
    public static void main(String[] args) {
        byte a=100;
        short b= 32000;
        int c=123456;
        long d=123456789;
        float e = 1.20f;
        double f = 20.00;
        char g= 'k';
        boolean h=true;

        System.out.println("Byte : "+a);
        System.out.println("Small : "+b);
        System.out.println("Integer : "+c);
        System.out.println("Long : "+d);
        System.out.println("Float : "+e);
        System.out.println("Double : "+f);
        System.out.println("Char : "+g);
        System.out.println("Boolean : "+h);

        int ConvertInt = (int)f;
        System.out.println("Double converted into Integer : "+f+" to "+ConvertInt);

    }
}
