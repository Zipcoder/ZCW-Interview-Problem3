package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem3Test {
    Problem3 problem3 = new Problem3();
    int number = 15;

    @Test
    public void wuTangMultiplesTest(){
        String expected = "1, 2, Wu, 4, Tang, Wu, 7, 8, Wu, Tang, 11, Wu, 13, 14, WuTang";
        String actual = problem3.wuTangMultiples(number);
        Assert.assertEquals(expected, actual);
        //1, 2, Wu3, 4, Tang5, Wu6, 7, 8, Wu9, Tang10, 11,
        //actual so far

    }
}
