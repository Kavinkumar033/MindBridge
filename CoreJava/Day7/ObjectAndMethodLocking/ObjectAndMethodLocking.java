//Write a Java program to demonstrate object-level and method-level locking using multithreading. The program should:
//Create a shared resource class (e.g., SharedPrinter) with two synchronized methods:
//Method 1: Print a given string multiple times.
//Method 2: Print a countdown from a given number.
//Use two threads:
//Thread 1: Calls the first synchronized method (print string).
//Thread 2: Calls the second synchronized method (countdown).
//Demonstrate the difference between:
//Object-Level Locking: When both threads use the same instance of the shared resource.
//Class-Level Locking: When both threads use a static synchronized method or block.
//Show how the locks affect the execution order of the methods.
package Day7;

class  PrintString
{
   public static synchronized   void Display(String str)
    {
        for(int i=0;i<5;i++) {
            System.out.println(Thread.currentThread().getClass() + " -> " +str+""+i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

class Countdown
{
    public static synchronized void DisplayCountdown(int n)
    {
        for (int i=1;i<=n;i++)
        {
            System.out.println("Countdown -> "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class SharedPrinter extends Thread
{
    SharedPrinter ref;
    Boolean str;
    String name;
    public SharedPrinter(SharedPrinter ref , Boolean str) {
        this.ref=ref;
        this.str=str;
    }
    public SharedPrinter() {

    }
    @Override
    public void run() {
        if(str!=true)
        {
            PrintString.Display("");
        }
        else
        {
            Countdown.DisplayCountdown(5);
        }
    }

}
public class ObjectAndMethodLocking {
    public static void main(String[] args) {
  SharedPrinter s1 = new SharedPrinter();
   Thread ti = new SharedPrinter(s1,true);
   Thread t2 = new SharedPrinter(s1,false);
   ti.start();
   t2.start();

    }
}
