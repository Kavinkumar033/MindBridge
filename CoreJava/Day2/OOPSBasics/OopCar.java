//Create a class Car with attributes like brand, model, and price. Write methods to display details of a car and calculate the discounted price.package Day2;
import java.util.*;
class Car
{
    private String Brand;
    String Model;
    double Price;

    Car(String brand,String model,double price)
    {
        this.Brand=brand;
        this.Model=model;
        this.Price=price;
    }
    String getBrand()
    {
        return this.Brand;
    }
    String getModel()
    {
        return this.Model;
    }
    double getPrice()
    {
        return this.Price;
    }
    public void DisplayCarDetails()
    {
        System.out.println("Car Details");
        System.out.println("Brand : "+Brand);
        System.out.println("Model : "+Model);
        System.out.println("Price : "+Price);
    }
    public double CalculateDiscountedPrice(double amount)
    {
        double p;
        p=Price-(Price*amount/100);
        return p;
    }
}
public class OopCar {
    public static void main(String[] args) {
       Car car1 = new Car("Tata Motors","Compact SUV",600000.00);
        Car car2 = new Car("Maruti Suzuki","Hatchback",700000.00);
        Car car3 = new Car("Hyundai","Mid-Size SUV",1000000.00);
        double DiscountPercent=15.0;
        car1.DisplayCarDetails();
        System.out.println(car1.getBrand()+" Price : "+car1.getPrice()+"| DiscountPercentage: "+DiscountPercent+"% | After Discount of 15.0% (Price : "+car1.CalculateDiscountedPrice(DiscountPercent)+" )");
        System.out.println("***************************************************");
        car2.DisplayCarDetails();
        System.out.println(car2.getBrand()+" Price : "+car2.getPrice()+"| DiscountPercentage: "+DiscountPercent+"% | After Discount of 15.0% (Price : "+car2.CalculateDiscountedPrice(DiscountPercent)+" )");
        System.out.println("***************************************************");
        car3.DisplayCarDetails();
        System.out.println(car3.getBrand()+" Price : "+car3.getPrice()+"| DiscountPercentage: "+DiscountPercent+"% | After Discount of 15.0% (Price : "+car3.CalculateDiscountedPrice(DiscountPercent)+" )");

    }
}
