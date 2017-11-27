package io.zipcoder;


public class Problem3 {


    public Object wuTangNumbersSequence(int n) {

        String wu = "Wu";
        String tang = "Tang";
        String wuTang = "WuTang";
        String result = "";
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0)
                result += (wu + ", ");
            else if (i % 5 == 0)
                result += (tang + ", ");
            else if (i % 3 == 0 && i % 5 == 0)
                result += (wuTang + ", ");
            else {
                result += (i + ", ");
            }
        }


        return result;
    }
}

