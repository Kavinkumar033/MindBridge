package Day19;

import java.security.PrivateKey;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkAndJoinPool {
   public static class SumProcess extends RecursiveTask<Long>
    {
        private final long start;
        private final long end;
        private static final long Threshold = 10000;

        SumProcess(Long start,Long end)
        {
            this.start=start;
            this.end=end;
        }
        @Override
        protected Long compute() {
            if(end - start <=Threshold)
            {
                 long sum=0;
                 for(long i=start;i<=end;i++)
                 {
                     sum=sum+i;
                 }
                 return sum;
            }
            else
            {
                long mid = (start+end)/2;
                SumProcess leftTask = new SumProcess(start,mid);
                SumProcess rightTask = new SumProcess(mid+1,end);

                leftTask.fork();
                long rightResult = rightTask.compute();
                long leftResult = leftTask.join();
                return  leftResult+rightResult;
            }
        }
    }
    public static void main(String[] args) {
       long start = 1;
        long end = 1000000;
        ForkJoinPool fj = new ForkJoinPool();
        SumProcess sp = new SumProcess(start,end);
        long result = fj.invoke(sp);
        System.out.println("Sum of integers from " + start + " to " + end + " is: " + result);
    }
}
