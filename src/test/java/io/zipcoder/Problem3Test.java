package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem3Test {

    @Test
    public void wuTangForTheBabiesTest() {

        String expected = "1, 2, Wu, 4, Tang, Wu, 7, 8, Wu, Tang, 11, Wu, 13, 14, WuTang,";
        String actual = Problem3.cREAM(15);
        Assert.assertEquals(expected, actual);


    }
}
