package Day13;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialMethodTest {

    FactorialMethod f1 = new FactorialMethod();
    @Test
    public void Test1() {
        long fact = f1.findfact(5);
        Assert.assertEquals(120,fact);
    }
    @Test
    public void Test2() {
        long fact = f1.findfact(-2);
        Assert.assertEquals(-1,fact);
    }
    @Test
    public void Test3() {
        long fact = f1.findfact(0);
        Assert.assertEquals(1,fact);
    }
    @Test
    public void Test4() {
        long fact = f1.findfact(10);
        Assert.assertEquals(3628800,fact);
    }
    @Test
    public void Test5() {
        long fact = f1.findfact(-9);
        Assert.assertEquals(-1,fact);
    }
}