package io.zipcoder;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Problem3 {

    public static void main(String[] args) {
        Problem3 problem3 = new Problem3();
        System.out.println(problem3.wuTang(50));
    }

    public String wuTang(int n) {
        ArrayList<String> entries = new ArrayList<String>();
        for(int i = 1; i <= n; i++) {
            String toAdd = "";
            if(i % 3 == 0) {
                toAdd += "Wu";
            }
            if(i % 5 == 0) {
                toAdd += "Tang";
            }
            if(toAdd.equals("")) {
                entries.add(String.valueOf(i));
            }
            else {
                entries.add(toAdd);
            }

        }
        return arrayListToString(entries);
    }

    public String arrayListToString(ArrayList<String> entries) {
        StringJoiner stringJoiner = new StringJoiner(", ");
        for(String entry : entries) {
            stringJoiner.add(entry.toString());
        }
        return stringJoiner.toString();
    }
}
