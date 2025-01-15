package Day12;

import java.io.*;

//public class Student implements Serializable
public class Student implements Externalizable {

    String name;
    transient int age;
    long rollNo ;

    public Student() {
    }

    Student(String name, int age, long rollNo)
    {
        this.name=name;
        this.age=age;
        this.rollNo=rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getRollNo() {
        return rollNo;
    }

    public void setRollNo(long rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("Writting in File");
        //out.write(Integer.parseInt(name));
        out.write(age);
        out.write((int) rollNo);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("Reading...");
        age=in.read();
        rollNo=in.read();
    }
}
