//Create a class Student with fields for the name and age. Write a program to create a clone (copy) of a Student object using the clone() method.
package Day6;
import java.lang.Object;
class Student implements Cloneable
{
    String name;
    int age;
    Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Clone {
    public static void main(String[] args) {

        try
        {
            Student s1 = new Student("Kavin",20);
            Student s2 =(Student) s1.clone();
            System.out.println(s1.toString());
            System.out.println(s2.toString());
            System.out.println("Hashcode for s1 : "+s1.hashCode());
            System.out.println("Hashcode for s2 : "+s2.hashCode());

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
