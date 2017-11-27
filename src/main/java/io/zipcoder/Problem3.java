package io.zipcoder;

import java.util.ArrayList;

class Problem1 {
    public String wuTang(int n) {

        ArrayList<String> arrayList = new ArrayList <String>();

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0) arrayList.add("Wu");

            if (i % 5 == 0) arrayList.add("Tang");

            if (i % 3 == 0 && i % 5 == 0) arrayList.add("WuTang");

            else if (i % 3 != 0 && i % 5 != 0) arrayList.add(String.valueOf(i));
        }
        return arrayList.toString();
    }
}
