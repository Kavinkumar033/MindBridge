//Create an enum Season with values WINTER, SPRING, SUMMER, and FALL. Add a method getAverageTemperature() to return an average temperature for each season.
package Day5.shapes;

public class EnumMethods {
    public enum Season
    {
        WINTER(-5),SPRING(15),SUMMER(25),FALL(10);
        private final int AverageTemperature;
      Season(int AverageTemperature)
      {
          this.AverageTemperature=AverageTemperature;
      }
       public int getAverageTemperature()
       {
           return this.AverageTemperature;
       }
    }
    public static void main(String[] args) {
           for(Season s : Season.values())
           {
               System.out.println("Average Temperature in "+s+" : "+s.getAverageTemperature()+"°C");
           }
    }
}
