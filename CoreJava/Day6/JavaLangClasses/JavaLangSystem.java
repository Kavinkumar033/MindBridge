//System - Print a message to the console and measure the execution time of a simple loop using System.currentTimeMillis().
package Day6;

public class JavaLangSystem {
    public static void main(String[] args) {
        int i,sum=0,j,sum2=0;
        long start = System.currentTimeMillis();
        for(i=0;i<10000;i++)
        {
            sum=sum+i;
            if(i%5==0)
            {
                for (j=0;j<i;j++)
                {
                    sum2=sum2+j;
                }
            }
        }

        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
