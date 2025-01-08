package Day10;

import java.util.*;
public class LinkedListProgram {
    public static void main(String[] args) {
        int s=0;
        boolean f =true;
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<String>();
        list.add("Finish homework");
        list.add("Go for a run");
        list.add("Prepare dinner");
        while (f)
        {

            int i;
            String str;
            s=0;
            System.out.println("1.Add Task");
            System.out.println("2.Remove Task");
            System.out.println("3.Display Tasks List");
            System.out.println("4.Exit");
            System.out.println("Enter Option Number to perform : ");
            i=sc.nextInt();
            sc.nextLine();
                switch (i) {
                    case 1:
                        System.out.println("Enter the Task to add in list : ");
                        str = sc.nextLine();
                        list.add(str);
                        break;
                    case 2:
                        System.out.println("Enter Task Name to Remove from Task List : ");
                        str = sc.nextLine();
                        list.remove(str);
                        break;
                    case 3:
                        System.out.println("Task List...");
                        System.out.println("**************************");
                        for (String str1 : list) {
                            s++;
                            System.out.println(s + ". " + str1);
                        }
                        System.out.println("**************************");
                        break;
                    case 4:
                        f=false;
                        break;
                    default:
                        System.out.println("Invalid Operation Number");
                }

            }
        System.out.println("Program Exited...");

        }
  }

