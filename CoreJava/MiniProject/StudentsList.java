package MiniProject;

import java.io.*;
import java.nio.file.Files;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.nio.file.Path.*;

public class StudentsList {
    private int ID;
    private String Name;
    private int Age;
    private String Grade;
    private String Email;
    String filName = "StudentsDataBase.txt";
    Scanner sc = new Scanner(System.in);

    public StudentsList(int ID, String name, int age, String grade, String email) {
        this.ID = ID;
        Name = name;
        Age = age;
        Grade = grade;
        Email = email;
    }

    public StudentsList() {

    }

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
        System.out.println("Enter Grade [A-F]: ");
        Grade = sc.nextLine();
        System.out.println("Enter Email : ");
        Email = sc.nextLine();
        std.add(new StudentsList(ID, Name, Age, Grade, Email));
    }

    public void SearchId(int id, List<StudentsList> std) {
        System.out.println("---------------------Search-----------------------");
        System.out.println(std.stream().filter((ref) -> ref.getID() == id).findFirst());
    }

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

    public static void Delete(int id, List<StudentsList> std) {
        std.removeIf(ref -> ref.getID() == id);

    }

    public  void ThreadStore    (List<StudentsList> stdref){
        new Thread(()->{
            try {
                Store(stdref);
            }catch (Exception e){
                e.printStackTrace();
            }
        }).start();
    }

    public void Store(List<StudentsList> std) {
        try {
            FileWriter fileWriter = new FileWriter(filName);
            std.forEach((ref) -> {
                try {
                    fileWriter.write("StudentsList{" +
                            "ID=" + ref.getID() +
                            ", Name='" + ref.getName() + '\'' +
                            ", Age=" + ref.getAge() +
                            ", Grade=" + ref.getGrade() +
                            ", Email='" + ref.getEmail() + '\'' +
                            '}' + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void View(List<StudentsList> std) {
        System.out.println("---------------------View-----------------------");
        try (Stream<String> lines = Files.lines(of(filName))) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // std.forEach(System.out::println);
        // stdref.forEach((ref-> System.out.println(ref.toString())));
    }

    public void NameSort(List<StudentsList> std) {
        std.stream().sorted(Comparator.comparing((ref) -> ref.getName())).forEach(System.out::println);
    }

    public void AgeSort(List<StudentsList> std) {
        std.stream().sorted(Comparator.comparing((ref) -> ref.getAge())).forEach(System.out::println);
    }

    public void GradeSort(String grade, List<StudentsList> std) {
        std.stream().filter((ref) -> ref.getGrade().equals(grade)).forEach(System.out::println);
    }

}



























/*
    public static void loadFromFile(List<StudentsList> std) {
        File file = new File("StudentsDataBase.txt");
        if (!file.exists()) return; // If file does not exist, skip loading

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                std.add(StudentsList.fromString(line)); // Convert line to student object
            }
        } catch (IOException e) {
            System.out.println("Error loading file: " + e.getMessage());
        }
    }
    public static StudentsList fromString(String line) {
        String[] parts = line.split(",");
        return new StudentsList(
                Integer.parseInt(parts[0]),
                parts[1],
                Integer.parseInt(parts[2]),
                parts[3],
                parts[4]);
    }
 */
