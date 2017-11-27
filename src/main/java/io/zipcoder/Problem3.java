package io.zipcoder;

public class Problem3 {

    public String withLoop(int maxNumber){
        StringBuilder returnStr = new StringBuilder();
        returnStr.append(1);
        for(int currentIndex = 2;currentIndex<=maxNumber;currentIndex++){
            returnStr.append(", ");
            if(currentIndex%3 == 0 || currentIndex%5 ==0){
                if(currentIndex%3 == 0){
                    returnStr.append("Wu");
                }
                if(currentIndex%5 == 0){
                    returnStr.append("Tang");
                }
            }else{
                returnStr.append(currentIndex);
            }
        }
        return returnStr.toString();
    }
}
