//Create a class Utility with a static method convertToUpper(String str) that takes a string as input and returns it in uppercase. Test this method in the main function.
package Day3;
class Utility
{
  public static String convertToUpper(String str)
  {
      if(str==null)
      {
          return null;
      }
      else {
          return str.toUpperCase();
      }
  }
}
public class StaticMethod {
    public static void main(String[] args) {
         String name1 = "kavin";
         String name2 = "manoj";
         String name3 = "teddy";
        System.out.println("Before Convert to UpperCaes : "+name1+" After Converted : "+Utility.convertToUpper(name1));
        System.out.println("Before Convert to UpperCaes : "+name2+" After Converted : "+Utility.convertToUpper(name2));
        System.out.println("Before Convert to UpperCaes : "+name3+" After Converted : "+Utility.convertToUpper(name3));
    }
}
