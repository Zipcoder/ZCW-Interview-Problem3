package io.zipcoder;

public class Problem3 {


    //Write a java program that prints the numbers from 1 to 50 with these caveat :
    //* For multiples of 3 print “Wu” instead of the number.
    //* For multiples of 5 print “Tang” instead of the number.
    // * For numbers which are multiples of both 3 and 5 print “WuTang”
    public static void main(String[] args) {
//        for (int i = 1; i <= 50; i++) {
//            if (i % 15 == 0) {
//                System.out.println("WuTang");
//            } else if (i % 3 == 0) {
//                System.out.println("Wu");
//            } else if (i % 5 == 0) {
//                System.out.println("Tang");
//            } else {
//                System.out.println(i);
//            }
//        }
    }

    public String wuTangNumberString(int n) {
        String s = "";
        if (n == 0)
            return s;
        if ((n % 5) == 0)
            s = "Tang" + s;
        if ((n % 3) == 0)
            s = "Wu" + s;
        if (s.equals(""))
            s = n + "";
        return wuTangNumberString(n - 1) + s + ", ";
    }
}