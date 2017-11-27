package io.zipcoder;

public class Problem3 {

    public String wuTangForever(int n) {

        StringBuilder wutang = new StringBuilder();

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                wutang.append("WuTang, ");
            } else if (i % 3 == 0) {
                wutang.append("Wu, ");
            } else if (i % 5 == 0) {
                wutang.append("Tang, ");
            } else {
                wutang.append(i + ", ");
            }
        }

        //conversion to string and use of substring to remove final comma and space
        String answer = wutang.toString();
        return answer.substring(0,answer.length()-2);
    }

}
