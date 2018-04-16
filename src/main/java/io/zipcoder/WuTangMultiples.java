package io.zipcoder;

public class WuTangMultiples {

    public static String result = "";

    public static String isWuTang(int i) {
        if (i % 15 == 0) {
            result = "WuTang";
        } else if (i % 3 == 0) {
            result = "Wu";
        } else if (i % 5 == 0) {
            result = "Tang";
        } else {
            result = String.valueOf(i);
        }
        return result;
    }
}
