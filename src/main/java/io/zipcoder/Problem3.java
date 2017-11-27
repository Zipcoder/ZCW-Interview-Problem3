package io.zipcoder;

import java.util.ArrayList;

public class Problem3 {

    ArrayList<Integer> wuTangArrayList = new ArrayList<Integer>();
    StringBuilder wuTangString = new StringBuilder();

    public String wuTangMultiples(int number){
        for (int x = 0; x <=number; x++)
            wuTangArrayList.add(x);

        for (int i = 1; i <= wuTangArrayList.size(); i++) {

            if (i % 3 == 0) {
                wuTangArrayList.remove(i);
                wuTangString.append("Wu");
            }

            if (i % 5 == 0) {
                wuTangArrayList.remove(i);
                wuTangString.append("Tang");
            }

            if (i % 3 == 0 && i % 5 == 0) {
                wuTangArrayList.remove(i);
                wuTangString.append("WuTang");
            }
            wuTangString.append(i + ", ");
        }
        return wuTangString.toString();
    }
//need to swtich to if and else if statements
}
