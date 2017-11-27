package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Problem3Test {
    @Test
    public void testChangeValues(){
        Problem3 problem = new Problem3();
        String actual = problem.changeValues(15);
        String expected= "1, 2, Wu, 4, Tang, Wu, 7, 8, Wu, Tang, 11, Wu, 13, 14, WuTang";
        Assert.assertEquals(expected,actual);
    }
}
