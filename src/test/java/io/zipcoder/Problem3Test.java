package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem3Test {

    @Test
    public void wuTangTest(){
        Problem3 problem3 = new Problem3();

        String expected = "1, 2, Wu, 4, Tang, Wu, 7, 8, Wu, Tang, 11, Wu, 13, 14, WuTang, 16, 17, Wu, 19, Tang, Wu, 22, 23, Wu, Tang, 26, Wu, 28, 29, WuTang, 31, 32, Wu, 34, Tang, Wu, 37, 38, Wu, Tang, 41, Wu, 43, 44, WuTang, 46, 47, Wu, 49, Tang";
        String actual = problem3.wuTang(50);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void decideOutput3ShouldGiveWuTest(){
        Problem3 problem3 = new Problem3();

        String expected = "Wu";
        String actual = problem3.decideOutput(3);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void decideOutput5ShouldGiveTangTest(){
        Problem3 problem3 = new Problem3();

        String expected = "Tang";
        String actual = problem3.decideOutput(5);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void decideOutput15ShouldGiveWuTangTest(){
        Problem3 problem3 = new Problem3();

        String expected = "WuTang";
        String actual = problem3.decideOutput(15);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void decideOutput2ShouldGive2Test(){
        Problem3 problem3 = new Problem3();

        String expected = "2";
        String actual = problem3.decideOutput(2);

        Assert.assertEquals(expected, actual);
    }

}
