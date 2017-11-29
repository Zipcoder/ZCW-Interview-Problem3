package io.zipcoder;

import java.util.StringJoiner;

public class Problem3 {

    public String wuTangTheMultiples(int n){
        StringJoiner stringJoiner = new StringJoiner(", ");
        for (Integer i = 1; i <= n; i++) {

            if(i % 3 == 0 && i % 5 == 0){
                stringJoiner.add("WuTang");
            }
            else if(i % 3 == 0) {

                stringJoiner.add("Wu");
            }
            else if(i % 5 == 0) {
                stringJoiner.add("Tang");
            }
            else{
                stringJoiner.add(i.toString());
            }
        }
        return stringJoiner.toString();
    }
}
