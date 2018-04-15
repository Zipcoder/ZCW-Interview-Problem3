package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem3Test {
    @Test
    public void testPrintNumbers1(){
        Problem3 test = new Problem3();
        int input  = 15;
        String expected = "1, 2, Wu, 4, Tang, Wu, 7, 8, Wu, Tang, 11, Wu, 13, 14, WuTang, ";
        String actual = test.printNumbers(15);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testPrintNumbers2(){
        Problem3 test = new Problem3();
        int input  = 50;
        String expected = "1, 2, Wu, 4, Tang, Wu, 7, 8, Wu, Tang, 11, Wu, 13, 14, WuTang, " +
                "16, 17, Wu, 19, Tang, Wu, 22, 23, Wu, Tang, 26, Wu, 28, 29, WuTang, 31, 32, " +
                "Wu, 34, Tang, Wu, 37, 38, Wu, Tang, 41, Wu, 43, 44, WuTang, 46, 47, Wu, 49, Tang, ";
        String actual = test.printNumbers(input);
        Assert.assertEquals(expected,actual);
    }
}
