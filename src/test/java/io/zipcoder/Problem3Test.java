package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem3Test {

    @Test
    public void Test1(){
        Problem1 test = new Problem1();

        String expected = "1\n";
        String actual = test.wuTang(1);

        Assert.assertEquals(expected,actual);

    }
    @Test
    public void Test5(){
        Problem1 test = new Problem1();
        String expected = "1\n" +
                "2\n" +
                "Wu\n" +
                "4\n" +
                "Tang\n";
        String actual = test.wuTang(5);

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void Test50(){
        Problem1 test = new Problem1();

        String expected = "1\n" +
                "2\n" +
                "Wu\n" +
                "4\n" +
                "Tang\n" +
                "Wu\n" +
                "7\n" +
                "8\n" +
                "Wu\n" +
                "Tang\n" +
                "11\n" +
                "Wu\n" +
                "13\n" +
                "14\n" +
                "Wu\n" +
                "Tang\n" +
                "WuTang\n" +
                "16\n" +
                "17\n" +
                "Wu\n" +
                "19\n" +
                "Tang\n" +
                "Wu\n" +
                "22\n" +
                "23\n" +
                "Wu\n" +
                "Tang\n" +
                "26\n" +
                "Wu\n" +
                "28\n" +
                "29\n" +
                "Wu\n" +
                "Tang\n" +
                "WuTang\n" +
                "31\n" +
                "32\n" +
                "Wu\n" +
                "34\n" +
                "Tang\n" +
                "Wu\n" +
                "37\n" +
                "38\n" +
                "Wu\n" +
                "Tang\n" +
                "41\n" +
                "Wu\n" +
                "43\n" +
                "44\n" +
                "Wu\n" +
                "Tang\n" +
                "WuTang\n" +
                "46\n" +
                "47\n" +
                "Wu\n" +
                "49\n" +
                "Tang\n";
        String actual = test.wuTang(50);

        Assert.assertEquals(expected,actual);

    }
}
