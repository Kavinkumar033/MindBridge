package Day19;

import java.util.concurrent.Callable;

public class FactorialTask  implements Callable<Long> {
    int num;
    long result=1;
    FactorialTask()
    {

    }
    FactorialTask(int num)
    {
       this.num=num;
    }
    @Override
    public Long call() throws Exception {
        return calculatefact(num);
    }

    public Long calculatefact(int num)
    {
        if(num<0)
        {
            System.out.println("Invalid number");
        }
        else
        {
            for (int i=1;i<=num;i++)
            {
                result=result*i;
            }
        }
        return result;
    }
}
