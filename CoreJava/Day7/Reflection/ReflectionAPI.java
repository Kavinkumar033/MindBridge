//Write a Java program to demonstrate the use of reflection. Your program should:
//Dynamically load a custom class (e.g., Person) using its fully qualified name.
//Display the following details about the class:
//All declared methods and their return types.
//All declared fields and their types.
//All constructors.
//Dynamically invoke a method on an object of the class, provided the method name and arguments as input.
package Day7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectionAPI {
    public static void main(String[] args) {
          int i;
       try(Scanner sc = new Scanner(System.in))
       {
//           System.out.println("Enter Class Name(ex : package and class name(Day7.Person) ) : ");
//           String strclsname = sc.nextLine();
//           Class clsname = Class.forName(strclsname);

           Class clsname = Class.forName("Day7.Person");
           Constructor cons[] =clsname.getDeclaredConstructors();
           System.out.println("***Constructors***");
           for (i=0;i< cons.length;i++)
           {
               System.out.println(cons[i]);
           }

           //setting values
           Person p1 = (Person)cons[1].newInstance("Kavin Kumar",20);

           Field fields[] =clsname.getDeclaredFields();
           System.out.println("***Fields(Variables)***");
           for (i=0;i< fields.length;i++)
           {
               System.out.println(fields[i]);
           }
           Method methods[] =clsname.getDeclaredMethods();
           System.out.println("***Methods***");
           for (i=0;i< methods.length;i++)
           {
               System.out.println(methods[i]);
           }
           System.out.println("***Invoking Methods***");
           for (i=0;i< methods.length;i++)
           {
               if(methods[i].getName().equals("getName"))
               {
                   methods[i].invoke(p1);
               }
               if(methods[i].getName().equals("getAge"))
               {
                   methods[i].invoke(p1);
               }
               if(methods[i].getName().equals("Welcome"))
               {
                   methods[i].invoke(p1);
               }

           }
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
    }
}
