package io.zipcoder;

public class Problem3 {

    public static void main(String[] args){
        Problem3 test = new Problem3();
        System.out.println(test.wuTangCounting(50));
    }

    public String wuOrTang(int n){

        String returnMe="";
        if (n%3==0){
            returnMe+="Wu";
        }
        if (n%5==0){
            returnMe+="Tang";
        }
        if (n%3!=0 && n%5!=0){
            returnMe+=""+n;
        }

        return returnMe;
    }

    public String wuTangCounting(int n){
        StringBuilder output = new StringBuilder();
        for (int i=1; i<n; i++){
            output.append(wuOrTang(i)+", ");
        }
        output.append(wuOrTang(n));
        return(output.toString());
    }

}
