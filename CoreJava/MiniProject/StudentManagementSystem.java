package MiniProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        StudentsList std = new StudentsList();
        int choice;
        List<StudentsList> stdref = new ArrayList<>();
        std.load(stdref);
        Scanner sc = new Scanner(System.in);
        int end = 1, loop;

        while (end != 0) {
            System.out.println("-----------------------");
            System.out.println("|      Operations     |");
            System.out.println("|---------------------|");
            System.out.println("|      1. Add         |");
            System.out.println("|      2. View        |");
            System.out.println("|      3. Search      |");
            System.out.println("|      4. Update      |");
            System.out.println("|      5. Delete      |");
            System.out.println("|      6. Sort        |");
            System.out.println("------------------------");
            System.out.println("Enter operation number to perform...");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    std.Add(stdref);
                    std.ThreadStore(stdref);
                    break;
                case 2:
                    std.View(stdref);
                    break;
                case 3:
                    System.out.println("Enter ID to find: ");
                    int idone = sc.nextInt();
                    std.SearchId(idone, stdref);
                    break;
                case 4:
                    System.out.println("---------------------Update-----------------------");
                    System.out.println("Enter ID Number to Update: ");
                    int updateId = sc.nextInt();
                    std.UpdateId(updateId, stdref);
                    System.out.println("Updated...");
                    std.ThreadStore(stdref);
                    break;
                case 5:
                    System.out.println("---------------------Delete-----------------------");
                    System.out.println("Enter ID number to Delete: ");
                    int deleteId = sc.nextInt();
                    std.Delete(deleteId, stdref);
                    System.out.println("Deleted");
                    std.ThreadStore(stdref);
                    break;
                case 6:
                    System.out.println("---------------------Sorting-----------------------");
                    System.out.println("1. Name-based sorting");
                    System.out.println("2. Age-based sorting");
                    System.out.println("3. Grade-based sorting");
                    System.out.println("Enter your choice: ");
                    int sort = sc.nextInt();

                    if (sort == 1) {
                        System.out.println("---------------------Name Sorting-----------------------");
                        std.NameSort(stdref);
                    } else if (sort == 2) {
                        System.out.println("---------------------Age Sorting-----------------------");
                        std.AgeSort(stdref);
                    } else if (sort == 3) {
                        System.out.println("---------------------Grade Sorting-----------------------");
                        sc.nextLine();
                        System.out.println("Enter any one Grade [A-F] to sort: ");
                        String grade = sc.nextLine();
                        std.GradeSort(grade, stdref);
                    } else {
                        System.out.println("Invalid option");
                    }
                    break;
                default:
                    System.out.println("---------------------------------------------");
                    System.out.println("Invalid choice! Try again.");
            }

            System.out.println("-----------------------------------------------------------------");
            System.out.println("To Continue: Enter any Number || To Exit: Enter 0 ");
            loop = sc.nextInt();
            end = loop;
        }
        System.out.println("Exited...");
    }
}
