package io.zipcoder;

public class Problem3 {
    //Write a java program that prints the numbers from 1 to 50 with these caveat :
//    For multiples of 3 print “Wu” instead of the number.
//    For multiples of 5 pring “Tang” instead of the number.
//    For numbers which are multiples of both 3 and 5 print “WuTang”

// Ex: 1, 2, Wu, 4, Tang, Wu, 7, 8, Wu, Tang, 11, Wu, 13, 14, WuTang, …

    public String interator(){

        String[] numbers = new String[50];
        for (int i = 0; i < numbers.length; i++){
            System.out.println(i);
            if (i == 3){
                return "Wu";
            }
            if(i == 5){
                return "Tang";
            }
            System.out.println(i);
// total fail ... this should be easy...
        }

        //return numbers.toString();
        String interator = interator();
        return interator;
    }



}
