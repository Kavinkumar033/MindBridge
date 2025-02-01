package MiniProject;

import java.io.*;
import java.nio.file.Files;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import static java.nio.file.Path.*;

public class StudentsList {
    private int ID;
    private String Name;
    private int Age;
    private String Grade;
    private String Email;
    public String fileName = "StudentsDataBase.txt";
    Scanner sc = new Scanner(System.in);

    public StudentsList(int ID, String name, int age, String grade, String email) {
        this.ID = ID;
        Name = name;
        Age = age;
        Grade = grade;
        Email = email;
    }

    public StudentsList() {}

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "StudentsList{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Grade=" + Grade +
                ", Email='" + Email + '\'' +
                '}';
    }
    //Adding Data
    public void Add(List<StudentsList> std) {
        System.out.println("---------------------Adding-----------------------");
        System.out.println("Enter ID : ");
        ID = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name : ");
        Name = sc.nextLine();
        System.out.println("Enter Age : ");
        Age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Grade [A-D]: ");
        Grade = sc.nextLine();

        if (!(Grade.equals("A") || Grade.equals("B") || Grade.equals("C") || Grade.equals("D"))) {
            System.out.println("Enter valid Grade [A-D]");
            return;
        }

        System.out.println("Enter Email : ");
        String format = "[a-zA-Z0-9._-]*@[a-zA-Z0-9]+\\.(com|org|net)$";
        Pattern pattern = Pattern.compile(format);
        Email = sc.nextLine();
        Matcher matcher = pattern.matcher(Email);

        if (matcher.find()) {
            std.add(new StudentsList(ID, Name, Age, Grade, Email));
            System.out.println("Added...");
        } else {
            System.out.println(Email + " is Invalid ");
            return;
        }
    }
    //Viewing Students Details
    public void View(List<StudentsList> std) {
        System.out.println("---------------------View-----------------------");
        if(std.isEmpty())
            System.out.println("Students Data Not Available(Empty)");
        std.forEach(System.out::println);
    }
    // Searching Students Details
    public void SearchId(int id, List<StudentsList> std) {
        System.out.println("---------------------Search-----------------------");
        System.out.println(std.stream().filter((ref) -> ref.getID() == id).findFirst());
    }
    //Updating Students Details
    public void UpdateId(int id, List<StudentsList> std) {
        for (StudentsList ref : std) {
            if (id == ref.getID()) {
                sc.nextLine();
                System.out.println("Enter Name : ");
                ref.setName(sc.nextLine());
                System.out.println("Enter Age : ");
                ref.setAge(sc.nextInt());
                sc.nextLine();

                System.out.println("Enter Grade : ");
                ref.setGrade(sc.nextLine());

                System.out.println("Enter Email : ");
                ref.setEmail(sc.nextLine());
            }
        }
    }
    //Deleting Students Details
    public static void Delete(int id, List<StudentsList> std) {
        std.removeIf(ref -> ref.getID() == id);
    }

    public void ThreadStore(List<StudentsList> stdref) {
        new Thread(() -> {
            try {
                Store(stdref);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }
    //Storing Students Details
    public void Store(List<StudentsList> std) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            std.forEach((ref) -> {
                try {
                    fileWriter.write(ref.getID() + "," + ref.getName() + "," + ref.getAge() + "," + ref.getGrade() + "," + ref.getEmail() + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //Name Sorting
    public void NameSort(List<StudentsList> std) {
        std.stream().sorted(Comparator.comparing((ref) -> ref.getName())).forEach(System.out::println);
    }
    //Age Sorting
    public void AgeSort(List<StudentsList> std) {
        std.stream().sorted(Comparator.comparing((ref) -> ref.getAge())).forEach(System.out::println);
    }
    //Grade Sorting
    public void GradeSort(String grade, List<StudentsList> std) {
        std.stream().filter((ref) -> ref.getGrade().equals(grade)).forEach(System.out::println);
    }

    // Storing DataList to List from Database(TextFile)
    public void load(List<StudentsList> std) {
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("Invalid FileName : " + fileName);
        }
        try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bf.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }
                String[] word = line.split(",");
                if (word.length == 5) {
                    int id = Integer.parseInt(word[0].trim());
                    String name = word[1].trim();
                    int age = Integer.parseInt(word[2].trim());
                    String grade = word[3].trim();
                    String email = word[4].trim();
                    std.add(new StudentsList(id, name, age, grade, email));
                }
            }
        } catch (Exception e) {
            System.out.println("Error occurred during reading the file : " + fileName);
        }
    }
}
