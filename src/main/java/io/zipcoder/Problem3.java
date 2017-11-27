package io.zipcoder;

public class Problem3 {


    //The directions say print it but I returned it too to test it
    //Maybe not good SRP but it works

    public String printNumbers(int length){
        String toReturn = "";
        for(int i = 0; i <= length; i ++){
            if(i%3==0 && i%15!=0){
                System.out.print("Wu, ");
                toReturn += "Wu, ";
            } else if(i%5==0 && i%15!=0){
                System.out.print("Tang, ");
                toReturn += "Tang, ";
            } else if(i%15==0){
                System.out.print("WuTang, ");
                toReturn += "WuTang, ";
            } else {
                System.out.print(i + ", ");
                toReturn += i + ", ";
            }
        }
        toReturn += "...";
        System.out.println("...");
        return toReturn;
    }

}
