/*Access Modifier Example:
Create a class Person with:
name (public)
age (protected)
address (default)
salary (private)
Create a subclass Employee in the same package to demonstrate which members are accessible.
Create another class TestAccess in a different package to test accessibility.
*/
package Day3;
import  Day5.shapes.Person;
public class TestAccess{
    public static void main(String[] args) {
        Person p1 = new Person("Kavin",20,"Sankari",50000);
        System.out.println("Employee Name : "+p1.name);
       // System.out.println("EMployee Age : "+p1.age);
        //System.out.println("Employee Address : "+p1.address);
        System.out.println("Employee Salary : "+p1.getSalary());
    }

}
