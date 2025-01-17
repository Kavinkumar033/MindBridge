package Day13;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
public class StringPalindromeMethodTest {

    StringPalindromeMethod s1 = new StringPalindromeMethod();
    @Test
    public void Test1() {
       boolean b= s1.palin("MadaM");
        Assert.assertEquals(true,b);
    }
    @Test
    public void Test2() {
        boolean b= s1.palin("Malayalam");
        Assert.assertEquals(true,b);
    }
    @Test
    public void Test3() {
        boolean b= s1.palin("kavin kumar");
        Assert.assertEquals(false,b);
    }
    @Test
    public void Test4() {
        boolean b= s1.palin("This is plaindrome check");
        Assert.assertEquals(false,b);
    }
    @Test
    public void Test5() {
        boolean b= s1.palin("kak");
        Assert.assertEquals(true,b);
    }
}