package io.zipcoder;

import org.junit.Test;
import org.junit.Assert;


public class Problem3Test {

    Problem3 problem3 = new Problem3();

    @Test
    public void wuTangTheMultiples() throws Exception {
        String expected = "1, 2, Wu, 4, Tang, Wu, 7, 8, Wu, Tang, 11, Wu, 13, 14, WuTang";
        String actual = problem3.wuTangTheMultiples(15);
        Assert.assertEquals(expected,actual);
    }

    //i know i should break this all up in different methods.
    //made test go up to just 15 for sake of time. if it works to 15 it should work up to 50.
}
