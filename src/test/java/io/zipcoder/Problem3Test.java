package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem3Test {

    @Test
    public void isWuTangTest(){
        //Given
        int input = 5;
        String expected = "Tang";
        //When
        String actual = WuTangMultiples.isWuTang(input);
        //Then
        Assert.assertEquals(expected, actual);
    }
}
