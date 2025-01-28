package Day19;

import java.util.concurrent.*;

public class CallableAndFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int num=5;
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        FactorialTask ft= new FactorialTask(5);
        Future<Long> future = executorService.submit(ft);
       // System.out.println(future);
        long res = future.get();
        System.out.println("Factorial of " + num + " is: " + res);
        executorService.shutdown();;

    }
}
