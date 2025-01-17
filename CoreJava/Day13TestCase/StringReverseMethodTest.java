package Day13;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseMethodTest {

    @Test
    public void empty() {
        StringReverseMethod r1 = new StringReverseMethod();
        String str1 = " ";
        String rev = r1.Reverse(str1);
        Assert.assertEquals(" ",rev);
    }
    @Test
    public void single() {
        StringReverseMethod r1 = new StringReverseMethod();
        String str1 = "K";
        String rev = r1.Reverse(str1);
        Assert.assertEquals("K",rev);
    }
    @Test
    public void normal() {
        StringReverseMethod r1 = new StringReverseMethod();
        String str1 = "Kavin";
        String rev = r1.Reverse(str1);
        Assert.assertEquals("nivaK",rev);
    }
    @Test
    public void specialChar() {
        StringReverseMethod r1 = new StringReverseMethod();
        String str1 = "!@#$%";
        String rev = r1.Reverse(str1);
        Assert.assertEquals("%$#@!",rev);
    }
    @Test public void num() {
        StringReverseMethod r1 = new StringReverseMethod();
        String str1 = "12345";
        String rev = r1.Reverse(str1);
        Assert.assertEquals("54321",rev);
    }
}