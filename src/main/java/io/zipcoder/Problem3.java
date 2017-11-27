package io.zipcoder;

public class Problem3 {

    public String iterated() {
        Integer x;
        for (x = 1; x < 50; x++) {
            if (x % 3 == 0) {
                System.out.println("Wu, ");
            } else if (x % 5 == 0) {
                System.out.println("Tang, ");
            } else if (x % 3 == 0 && x % 5 == 0) {
                System.out.println("WuTang, ");
            } else {
                System.out.println(x.toString());
            }
        }
        return String.valueOf(x);
    }

    public void recursive(int d) {
            Integer x = d % 10;
            if (d == 0) { return; }
            else if (d % 3 == 0){ System.out.println("Wu"); }
            else if (d % 5 == 0){ System.out.println("Tang"); }
            else if (d % 5 == 0 && x % 5 == 0) { System.out.println("WuTang");}
            else { System.out.println(d); }
    }
}
