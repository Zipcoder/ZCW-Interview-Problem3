package io.zipcoder;

import java.util.ArrayList;

public class Problem3 {

    ArrayList<String> result;

    public Problem3() {
        this.result = new ArrayList<String>();
    }
    public void WuTang(int s){
        for(int i = 1; i <= s; i++)
        if(i%3 == 0 && i%5 == 0){
            result.add("WuTang");
        } else if(i%5 == 0){
            result.add("Tang");
        }else if(i%3 == 0){
            result.add("Wu");
        }else
            result.add(Integer.toString(i));
    }

    @Override
    public String toString(){
        return result.toString().replace("[", "").replace("]", "");
    }
}


