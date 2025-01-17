package Day13;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberMethodTest {

    PrimeNumberMethod p1 = new PrimeNumberMethod();
    @Test
    public void Test1() {
        boolean b = p1.isPrime(0);
        Assert.assertEquals(false,b);
    }
    @Test
    public void Test2() {
        boolean b = p1.isPrime(5);
        Assert.assertEquals(true,b);
    }
    @Test
    public void Test3() {
        boolean b = p1.isPrime(-5);
        Assert.assertEquals(false,b);
    }
    @Test
    public void Test4() {
        boolean b = p1.isPrime(104729);
        Assert.assertEquals(true,b);
    }
    @Test
    public void Test5() {
        boolean b = p1.isPrime(1);
        Assert.assertEquals(false,b);
    }
}