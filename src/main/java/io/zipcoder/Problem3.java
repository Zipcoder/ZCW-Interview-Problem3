package io.zipcoder;

import java.util.ArrayList;

public class Problem3 {

    ArrayList<String> string1Through50 = new ArrayList<String>();

    public String numbers1Through50() {
        for (int number = 1; number <= 50; number++) {
            if (number % 15 == 0) {
                string1Through50.add("WuTang");
            }  else if (number % 3 == 0) {
                string1Through50.add("Wu");
            }  else if (number % 5 == 0) {
                string1Through50.add("Tang");
            }  else {
                string1Through50.add(String.valueOf(number));
            }
        }
        return string1Through50.toString();
    }
}
