package io.zipcoder;
import org.junit.*;

class Problem1Test {

    @Test
    public void multipleOfThreeAndFivePrintsWuTangTest(){


        Assert.assertEquals("WuTang",Problem1.wuTangNumbers(15));

    }
    @Test
    public void multipleOfThreePrintsWuTest(){


        Assert.assertEquals("Wu",Problem1.wuTangNumbers(3));
    }
    @Test
    public void multipleOfFivePrintsWuTest(){


        Assert.assertEquals("Tang",Problem1.wuTangNumbers(5));
    }


}
