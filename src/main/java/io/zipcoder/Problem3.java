package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

public class Problem3 {

    public String wuTang(int n){
        ArrayList<String> wuTangClan = new ArrayList<>();

        for(int i = 1; i <= n;i++){
            String holder = "";

            if(i % 3 == 0){
                holder += "Wu";
            }
            if(i % 5 == 0){
                holder += "Tang";
            }
            if(holder.equals("")){
                holder += i;
            }
            wuTangClan.add(holder);
        }
        String empty = "";
        for (String string : wuTangClan){
            empty += string + ", ";
        }
        return empty.substring(0, empty.length()-2);
    }

}
