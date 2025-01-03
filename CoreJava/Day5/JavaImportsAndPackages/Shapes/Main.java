/*Create a package shapes with two classes:
Circle with a method to calculate the area of a circle.
Rectangle with a method to calculate the area of a rectangle.
Write a Main class in the default package to import and use these classes. */
import Day5.shapes.Circle;
import Day5.shapes.Rectangle;
        public class Main {
            public static void main(String[] args) {
                Circle c1 = new Circle(4);
                c1.CalculateArea();
                Rectangle r1 = new Rectangle(5,6);
                r1.CalculateArea();
            }
        }
