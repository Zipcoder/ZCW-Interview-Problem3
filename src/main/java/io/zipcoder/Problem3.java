package io.zipcoder;

public class Problem3 {

    public String wuTangTheMultiples(int n){
        int num = n;
        for (int i = 1; i < num; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            if(i % 3 == 0) stringBuilder.append("Wu");
            if(i % 5 == 0) stringBuilder.append("Tang");

            if(Integer.toString(i).indexOf("3") != -1) stringBuilder.append("Wu");
            if(Integer.toString(i).indexOf("5") != -1) stringBuilder.append("Tang");

            if (stringBuilder.length() == 0) System.out.print(i);
            else System.out.print(stringBuilder);
            System.out.println();
        }
        return stringBuilder.toString();
    }

    //need to figure out how to print out stringbuilder not use system.out.
}
