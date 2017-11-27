package io.zipcoder;

public class Problem3 {

    public String replaceMultiplesOf3And5(Integer n) {

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < n + 1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sb.append("WuTang, ");
            } else if (i % 3 == 0) {
                sb.append("Wu, ");
            } else if (i % 5 == 0) {
                sb.append("Tang, ");
            } else {
                sb.append(i + ", ");
            }

        }
        return sb.toString();
    }
}

