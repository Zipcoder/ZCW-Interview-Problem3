package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem3Test {

    @Test
    public void numbers1Through50Test() {
        Problem3 prob3Test = new Problem3();
        String expected = "[1, 2, Wu, 4, Tang, Wu, 7, 8, Wu, Tang, 11, Wu, 13, 14, WuTang, 16, 17, Wu, 19, Tang, Wu, 22, 23, Wu, Tang, 26, Wu, 28, 29, Wu, 31, 32, Wu, 34, Tang, Wu, 37, 38, Wu, Tang, 41, Wu, 43, 44, Wu, 46, 47, Wu, 49, Tang]";
        String actual = prob3Test.numbers1Through50();
        Assert.assertEquals(expected, actual);
    }
}





