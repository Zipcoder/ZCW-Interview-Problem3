package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem1Test {
    @Test
    public void printNumberWithCharReplaced() throws Exception {

        String expected = "1, 2, Wu, 4, Tang, Wu, 7, 8, Wu, Tang, 11, Wu, 13, 14, WuTang,";
        String actual   = Problem1.printNumberWithCharReplaced(15);

        Assert.assertEquals(expected, actual);
    }

}