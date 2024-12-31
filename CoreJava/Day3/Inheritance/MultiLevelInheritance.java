package Day3;
class Shape
{
    public void  area()
    {
        System.out.println("Calculate Area Depends on Shapes...");
    }
}
class Rectangle extends Shape
{
    int length;
    int breadth;

    Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    public void area() {
        System.out.println("Area of Rectangle : "+length*breadth);
    }
}
class Square extends Rectangle
{
   public Square(int length,int breadth)
   {
       super(length,breadth);
   }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
          Shape s1 =new Shape();
          Rectangle r1 = new Rectangle(10,5);
          Square sq1 = new Square(4,8);
          s1.area();
          r1.area();
          sq1.area();
    }
}
