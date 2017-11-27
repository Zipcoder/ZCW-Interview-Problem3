package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem3Test {
    @Test
    public void testWuOrTang(){
        Problem3 test=new Problem3();
        String expected = "Wu";
        String actual = test.wuOrTang(3);
        Assert.assertEquals(expected, actual);

        expected = "Tang";
        actual = test.wuOrTang(5);
        Assert.assertEquals(expected, actual);

        expected = "WuTang";
        actual = test.wuOrTang(15);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testWuTangCounting(){
        Problem3 test = new Problem3();
        String expected = "1, 2, Wu, 4, Tang, Wu, 7, 8, Wu, Tang, 11, Wu, 13, 14, WuTang";
        String actual = test.wuTangCounting(15);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRecursiveWuTang(){
        Problem3 test = new Problem3();
        String expected = "1, 2, Wu, 4, Tang, Wu, 7, 8, Wu, Tang, 11, Wu, 13, 14, WuTang";
        String actual = test.recursiveWuTang(1,15);
        Assert.assertEquals(expected, actual);
    }

}
