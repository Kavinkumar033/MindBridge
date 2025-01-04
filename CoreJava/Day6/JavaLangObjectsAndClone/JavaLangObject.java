//Creating an object of a class.
//Using the basic methods of the Object class: getClass() and toString().
package Day6;
public class JavaLangObject {
    String name;
    int age;
    JavaLangObject(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "JavaLangObject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        JavaLangObject obj = new JavaLangObject("Kavin",20);
        System.out.println("getClass Name : "+obj.getClass());
        System.out.println(obj.toString());
    }
}
