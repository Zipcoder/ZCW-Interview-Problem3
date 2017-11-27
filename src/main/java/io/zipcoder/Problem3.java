package io.zipcoder;

import java.util.StringJoiner;

public class Problem3 {

    public String wutangForN(int n) {

        StringJoiner output = new StringJoiner(", ");

        for(Integer i = 1; i <= n; i ++) {
            if(i % 3 == 0 && i % 5 == 0) {
                output.add("WuTang");
            }
            else if (i % 3 == 0) {
                output.add("Wu");
            }
            else if(i % 5 == 0) {
                output.add("Tang");
            }
            else {
                output.add(i.toString());
            }
        }

        return output.toString();
    }

}
