package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem3Test {

    Problem3 problem1 = new Problem3();

    @Test
    public void printNumbersTest(){
        String expected = "WuTang, 1, 2, Wu, 4, Tang, Wu, 7, 8, Wu, Tang, 11, Wu, 13, 14, WuTang, ...";

        String actual = problem1.printNumbers(15);

        Assert.assertEquals(expected, actual);
    }
}
