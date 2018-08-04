package io.zipcoder;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Problem3 {

    private ArrayList<Integer> wuTangArrayList = new ArrayList<>();
    private StringJoiner wuTangString = new StringJoiner(", ", "", "");

    public String wuTangMultiples(int number) {
        String numberToAdd;
        for (int x = 0; x < number; x++)
            wuTangArrayList.add(x);

        for (int i = 1; i <= wuTangArrayList.size(); i++) {
            numberToAdd = Integer.toString(i);

            if (i % 3 == 0 && i % 5 == 0) {
                //wuTangArrayList.remove(i);
                wuTangString.add("WuTang");
            } else if (i % 3 == 0) {
                //wuTangArrayList.remove(i);
                wuTangString.add("Wu");
            } else if (i % 5 == 0) {
                //wuTangArrayList.remove(i);
                wuTangString.add("Tang");
            } else {
                wuTangString.add(numberToAdd);
            }

        }

        return wuTangString.toString();
//need to swtich to if and else if statements
    }
}
