package Day10;

import java.util.Scanner;
import java.util.Stack;

public class StackProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<String> list= new Stack<>();
        int n=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String Action = sc.nextLine();

            if(Action.substring(0,4).equalsIgnoreCase("Type")) {
                list.push(Action.substring(5));
            }
            else{
                list.pop();
            }

        }
        System.out.println("Current Text : ");
        for(String text:list){
            System.out.print(text+" ");
        }
    }
}