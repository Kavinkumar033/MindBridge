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

class SharedPrinter
{

    public synchronized void printString(String str, int n) {

        for(int i = 0; i < n; i++){
            System.out.println(str);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void countDown(int n){
        for(int i = 0; i < n; i++){
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Printer{

    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    public static void printString(String str, int n){
        synchronized (lock1){
            for(int i = 0; i < n; i++){
                System.out.println(str);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void countDown(int n){
        synchronized (lock2){
            for(int i = 0; i < n; i++){
                System.out.println(i);
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

public class ObjectAndMethodLocking {
    public static void main(String[] args) throws InterruptedException {
        SharedPrinter sharedPrinter = new SharedPrinter();
        System.out.println("Object synchronized");
        //Object Locking
        Thread thread1 = new Thread(() ->{
            sharedPrinter.printString("Kavin", 10);
        });

        Thread thread2 = new Thread(() ->{
            sharedPrinter.countDown(10);
        });

        thread2.start();
        thread1.start();

        thread1.join();
        thread2.join();
        System.out.println(" Method synchronized ");

        Printer printer = new Printer();
        Thread thread3 = new Thread(()->
        {
            Printer.printString("Teddy",5);
        });
        Thread thread4 = new Thread(()->
        {
            printer.countDown(5);
        });
        thread3.start();
        thread4.start();

        thread3.join();
        thread4.join();
    }
}
