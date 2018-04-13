package io.zipcoder;

public class Problem3 {

    public String wuTangPrinter() {
        String ret = "";
        // For loop here
        for (int i = 1; i <= 50; i++) {
            ret += wuOrTang(i);
            ret += ", ";
        }
        return ret.substring(0, ret.length()-2);
    }

    public String wuOrTang(int input) {
        String ret = "";
        if (input%3==0) ret += "Wu";
        if (input%5==0) ret += "Tang";
        if ((input%3!=0)&&(input%5!=0)) return Integer.toString(input);
        return ret;
    }

}
