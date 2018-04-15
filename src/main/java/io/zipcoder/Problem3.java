package io.zipcoder;

public class Problem3 {

    public String printNumbers(int n){
        String numbers = "";
        for(int i=1;i<=n;i++){
           if(isWuTang(i)){
               numbers+="WuTang, ";
           }else if(isWu(i)){
               numbers+="Wu, ";
           }else if(isTang(i)){
               numbers+="Tang, ";
           }else numbers+=i +", ";
        }
        return numbers;
    }

    public boolean isWu(int input){
        return input%3==0;
    }
    public boolean isTang(int input){
        return input%5==0;
    }
    public boolean isWuTang(int input){
        return isWu(input)&&isTang(input);
    }
}
