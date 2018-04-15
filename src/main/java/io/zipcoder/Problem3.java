package io.zipcoder;

public class Problem3 {

    public static String wuTang(Integer num) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= num; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                sb.append("WuTang, ");
            } else if(i % 5 == 0) {
                sb.append("Tang, ");
            } else if(i % 3 == 0) {
                sb.append("Wu, ");
            } else {
                sb.append(i + ", ");
            }
        }

        return sb.toString().substring(0, sb.length() - 2);
    }
}
