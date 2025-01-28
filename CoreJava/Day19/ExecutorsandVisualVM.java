package Day19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsandVisualVM {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for(int i=1;i<=10;i++)
        {
             int taskId = i;
            executorService.execute(()-> System.out.println("Task "+taskId+" executed by "+Thread.currentThread().getName()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        executorService.shutdown();
    }
}
