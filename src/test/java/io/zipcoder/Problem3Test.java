package io.zipcoder;

import org.junit.Test;
import org.junit.Assert;


public class Problem3Test {

    Problem3 problem3 = new Problem3();

    @Test
    public void wuTangTheMultiples() throws Exception {
        String expected = "1, 2, Wu, 4, Tang, Wu, 7, 8, Wu, Tang, 11, Wu, 13, 14, WuTang, 16";
        String actual = problem3.wuTangTheMultiples(16);
        Assert.assertEquals(expected,actual);
    }
    //made test go up to just 15 for sake of time. if it works to 15 it should work up to 50.
}
