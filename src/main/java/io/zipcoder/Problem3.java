package io.zipcoder;

import java.util.ArrayList;
import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String string1 = toReplce3And5(n);
        System.out.println(string1);
    }
    public static String toReplce3And5(int n){
        ArrayList<String> arrayList = new ArrayList<String>();
        String string = "";
        for (int i=1;i<=n;i++){
            if (i % 3 == 0 && i % 5 == 0){
                arrayList.add("WuTang");
            }
            else {
                if(i % 3 == 0){
                    arrayList.add("Wu");
                }
                else {
                    if(i % 5 == 0){
                        arrayList.add("Tang");
                    }
                    else {

                        arrayList.add((Integer.toString(i)));
                    }
                }
            }

        }
        return toIterateArraylist(arrayList);
    }
    public static String toIterateArraylist(ArrayList<String> arrayList){
        String string ="";
        for (String str:arrayList) {
            if(str!=arrayList.get(arrayList.size()-1)){
                string+= str+", ";
            }
            else
                string+= str;
        }
        return string;
    }

}
