package io.zipcoder;

public class Problem3 {

    public String wuTang(int n){
        StringBuilder sb = new StringBuilder();

        sb.append("1");
        for (int i = 2; i <= n; i++) {
            sb.append(", ");
            sb.append(decideOutput(i));
        }
        return sb.toString();
    }

    String decideOutput(int i) {
        String output;
        if((i % 15) == 0){
            output = "WuTang";
        } else if((i % 5) == 0){
            output = "Tang";
        } else if((i % 3) == 0){
            output = "Wu";
        } else {
            output = ""+i;
        }
        return output;
    }

}
