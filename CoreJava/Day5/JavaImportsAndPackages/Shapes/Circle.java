package Day5.shapes;
import static java.lang.Math.PI;
public class Circle {
   double r;
   public Circle(int r)
   {
       this.r=r;
   }

    public void CalculateArea()
    {
        double area = PI*r*r;
        System.out.println("Area of Circle With Radius "+r+" : "+ String.format("%.2f",area));
    }
}

