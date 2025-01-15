package Day12;

import java.io.*;

public class SerializationExample {
    public static void main(String[] args) {
        Student stu1 = new Student("Kavin Kumar S",20,33);
        ObjectOutputStream oos = null;
        try {

            oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\kavin\\OneDrive\\Desktop\\HandsOn\\CoreJava\\Day12\\Serialized.txt"));
            oos.writeObject(stu1);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            try
            {
                if(oos!=null)
                {
                    oos.close();
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
//Deserialization
        ObjectInputStream ois = null;
        try
        {
            ois = new ObjectInputStream(new FileInputStream("C:\\Users\\kavin\\OneDrive\\Desktop\\HandsOn\\CoreJava\\Day12\\Serialized.txt"));
            Student std = (Student) ois.readObject();
            System.out.println(std.getName());
           System.out.println(std.getAge());
            System.out.println(std.getRollNo());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            try {
                if(ois!=null)
                {
                    ois.close();
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

        }
    }
}
