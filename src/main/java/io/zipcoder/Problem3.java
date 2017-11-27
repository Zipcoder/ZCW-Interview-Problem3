package io.zipcoder;

public class Problem3 {

    private StringBuilder wuTandCount = new StringBuilder();

    public String wuTang(Integer n) {

        for (int x = 1; x <= n; x++) {
            if ((x % 3 != 0 || x % 5 != 0)) {
                if (x % 3 == 0) wuTandCount.append("Wu");
                else if (x % 5 == 0) wuTandCount.append("Tang");
                else wuTandCount.append(x);
            }
            else {
                wuTandCount.append("WuTang");
            }

            if (x != n) wuTandCount.append(", ");
        }
        return wuTandCount.toString();
    }

}
