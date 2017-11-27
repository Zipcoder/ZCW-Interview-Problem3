package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem3Test {

    @Test
    public void Test1(){
        Problem1 test = new Problem1();

        String expected = "[1]";
        String actual = test.wuTang(1);

        Assert.assertEquals(expected,actual);

    }
    @Test
    public void Test5(){
        Problem1 test = new Problem1();
        String expected = "[1, 2, Wu, 4, Tang]";
        String actual = test.wuTang(5);

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void Test50(){
        Problem1 test = new Problem1();
        String expected = "[1, 2, Wu, 4, Tang, Wu, 7, 8, Wu, Tang, 11, Wu, 13, 14, Wu, Tang, WuTang, 16, 17, Wu, 19, Tang, Wu, 22, 23, Wu, Tang, 26, Wu, 28, 29, Wu, Tang, WuTang, 31, 32, Wu, 34, Tang, Wu, 37, 38, Wu, Tang, 41, Wu, 43, 44, Wu, Tang, WuTang, 46, 47, Wu, 49, Tang]";

        String actual = test.wuTang(50);

        Assert.assertEquals(expected,actual);

    }
}
