package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Problem3Test {

    @Test
    public void toReplce3And5(){
        String string1="";
        String expected = "1, 2, Wu, 4, Tang, Wu, 7, 8, Wu, Tang, 11, Wu, 13, 14, WuTang, 16";
        string1+= Problem3.toReplce3And5(16);
        Assert.assertEquals(expected,string1);
    }
    @Test
    public void toIterateArraylistTest(){
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        String expected = "1, 2, 3";
        String actual = Problem3.toIterateArraylist(arrayList);
    }
}
