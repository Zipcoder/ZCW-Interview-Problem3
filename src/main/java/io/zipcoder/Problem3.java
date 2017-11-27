package io.zipcoder;

class Problem1 {
    public String wuTang(int n) {
        StringBuilder output = new StringBuilder();

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0) output.append("Wu\n");

            if (i % 5 == 0) output.append("Tang\n");

            if (i % 3 == 0 && i % 5 == 0) output.append("WuTang\n");

            else if (i % 3 != 0 && i % 5 != 0) output.append(i).append("\n");
        }
        return output.toString();
    }
}
