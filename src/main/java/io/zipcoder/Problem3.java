package io.zipcoder;

public class Problem3 {

    public String wuTangBuzz(){

        String wuTangReturn = "";

        for(int i = 1; i <= 50; i++){
            if(i % 15 == 0){
                wuTangReturn += "WuTang, ";
            } else if(i % 3 == 0){
                wuTangReturn += "Wu, ";
            } else if(i % 5 == 0){
                wuTangReturn += "Tang, ";
            } else {
                wuTangReturn += String.valueOf(i) + ", ";
            }
        }
        // cuts off the ", " at end of String by last two substrings
        String wuTangFinal = wuTangReturn.substring(0, wuTangReturn.length() - 2);
        return wuTangFinal;
    }
}
