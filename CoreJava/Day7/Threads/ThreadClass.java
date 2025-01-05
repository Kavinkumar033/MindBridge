//Write a Java program to demonstrate the use of multithreading. The program should:
//Create two threads:
//Thread 1: Print numbers from 1 to 10 with a 500ms delay between each number.
//Thread 2: Print the square of numbers from 1 to 10 with a 700ms delay between each number.
//Ensure both threads run concurrently.
//Use Thread class or Runnable interface for thread implementation.
package Day7;

class PrintNumbers extends  Thread
{
    String name;
    int i;
    public  PrintNumbers(String name)
    {
        this.name = name;
    }

    public void run()
    {
        for (i=1;i<=10;i++)
        {
            System.out.println(name+"-"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class PrintSquare extends Thread
{
    String name;
    int i;

    public PrintSquare(String name) {
        this.name = name;
    }
    public void run()
    {
        for (i=1;i<=10;i++)
        {
            System.out.println(name+"-"+(i*i));
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadClass  {
    public static void main(String[] args) {
        PrintNumbers t1 = new PrintNumbers("Thread One");
        t1.start();
        PrintSquare  t2 = new PrintSquare("Thread two");
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Both threads are running simultaneously");
    }
}
