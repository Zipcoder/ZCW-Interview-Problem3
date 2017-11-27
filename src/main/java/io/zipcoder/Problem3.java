package io.zipcoder;

public class Problem3 {

    public String printNumbers1To50WuTangStyle() {
        StringBuilder returnString = new StringBuilder();
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                returnString.append("WuTang");
            }
            else if (i % 3 == 0) {
                returnString.append("Wu");
            }
            else if (i % 5 == 0) {
                returnString.append("Tang");
            }
            else {
                returnString.append(i);
            }
            if (i != 50) {
                returnString.append(", ");
            }
        }
        return returnString.toString();
    }
}
