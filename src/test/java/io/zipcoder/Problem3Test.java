package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem3Test {
    Problem3 testProb;

    @Before
    public void setup(){
        testProb = new Problem3();
    }

    @Test
    public void testWuTang(){
        int n = 15;
        String expectedOutput = "1, 2, Wu, 4, Tang, Wu, 7, 8, Wu, Tang, 11, Wu, 13, 14, WuTang";
        testProb.WuTang(n);
        String actualOutput = testProb.toString();
        Assert.assertEquals(expectedOutput, actualOutput);
    }

}


//    Write a java program that prints the numbers from 1 to 50 with these caveat :
//        * For multiples of 3 print “Wu” instead of the number.
//        * For multiples of 5 pring “Tang” instead of the number.
//        * For numbers which are multiples of both 3 and 5 print “WuTang”
//        UNIT TESTING IS MANDATORY !!!
//
//        Example:
//
//        1, 2, Wu, 4, Tang, Wu, 7, 8, Wu, Tang, 11, Wu, 13, 14, WuTang, …

