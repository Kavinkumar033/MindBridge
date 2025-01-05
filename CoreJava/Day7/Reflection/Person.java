package Day7;

public class Person {
    String name;
    int age;
    public Person() {
        this.name = "Null";
        this.age = 0;
    }
    public Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public String getName() {
        System.out.println("Name is "+name+" .(getName Invoked)");
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {
        System.out.println("Age is "+age+" .(getAge Invoked)");
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void Welcome() {
        System.out.println("Welcome Mr."+name+" !");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
