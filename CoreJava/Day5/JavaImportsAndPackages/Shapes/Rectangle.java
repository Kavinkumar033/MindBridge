package Day5.shapes;

public class Rectangle {
    double length;
    double width;
    public Rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    public void CalculateArea()
    {
        System.out.println("Area of Rectangle with Length : "+length+" and Width : "+width+" is : "+(length*width));
    }
}
