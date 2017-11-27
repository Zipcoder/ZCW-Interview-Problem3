package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem3Test {

    @Test
    public void iteratorTest(){
        Problem3 problem3 = new Problem3();
        String example = "1, 2, Wu, 4, Tang, Wu, 7, 8, Wu, Tang, 11, Wu, 13, 14, WuTang";
        String expected = example;
        String actual = problem3.interator();

        Assert.assertEquals(expected, actual);
    }
}
