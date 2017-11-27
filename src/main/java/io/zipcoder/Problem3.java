package io.zipcoder;

public class Problem3 {

    public static void main(String[] args) {

        Problem3 problem3 = new Problem3();

        System.out.println(problem3.caveat());
    }

    public String caveat() {

        String result = "";
        for (int i = 1; i < 50; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                result += "WuTang,";
            } else if (i % 3 == 0) {
                result += "Wu,";
            } else if (i % 5 == 0) {
                result += "Tang,";
            } else {
                result += i + ",";
            }

        }
        return result;
    }
}