package Day13;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySortingMethodTest {

    ArraySortingMethod a1 = new ArraySortingMethod();
    @Test
    public void Test1() {
        int arr[] = a1.sort(new int[]{});
        assertArrayEquals(new int[]{},arr);
    }
    @Test
    public void Test2() {
        int arr[] = a1.sort(new int[]{5});
        assertArrayEquals(new int[]{5},arr);
    }
    @Test
    public void Test3() {
        int arr[] = a1.sort(new int[]{0,8,7,6});
        assertArrayEquals(new int[]{0,6,7,8},arr);
    }
    @Test
    public void Test4() {
        int arr[] = a1.sort(new int[]{5,6,7,8});
        assertArrayEquals(new int[]{5,6,7,8},arr);
    }
    @Test
    public void Test5() {
        int arr[] = a1.sort(new int[]{9,8,2,2,1});
        assertArrayEquals(new int[]{1,2,2,8,9},arr);
    }
}