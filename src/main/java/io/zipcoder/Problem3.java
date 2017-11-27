package io.zipcoder;

public class Problem3 {
    public static String cREAM(int chessBoxin) {
        String wuTangForTheBabies = " ";
        String shaolin = "";

        for (int i = 1; i <= chessBoxin; i++) {

            if (i % 15 == 0) {
                wuTangForTheBabies = "WuTang";
            } else if (i % 5 == 0) {
                wuTangForTheBabies = "Tang";
            } else if (i % 3 == 0) {
                wuTangForTheBabies = "Wu";
            } else {
                wuTangForTheBabies = Integer.toString(i);
            }
            if (i == 1){
                shaolin = shaolin + wuTangForTheBabies + ",";
            } else {
                shaolin = shaolin +" " + wuTangForTheBabies + ",";
            }
        }
        return shaolin;
    }
}

