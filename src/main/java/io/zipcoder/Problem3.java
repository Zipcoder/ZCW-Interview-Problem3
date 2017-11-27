package io.zipcoder;
import java.util.*;

public class Problem3 {
    ArrayList<String> numbers= new ArrayList<>();
//    public void addNumbers(int n) {
//        for (int i = 0; i<n;i++){
//            numbers.add(i+1);
//        }
//    }
    public ArrayList changeValues(int n) {

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                numbers.add("WuTang");
            } else {
                if (i % 3 == 0) {
                    numbers.add("Wu");
                } else {
                    if (i % 5 == 0) {
                        numbers.add("Tang");
                    } else {
                        numbers.add(Integer.toString(i));
                    }
                }
            }
        }
        return numbers;
    }
    public String arrayListToString(ArrayList<Integer> numbers) {
        StringJoiner join = new StringJoiner(", ");
        for(Integer number : numbers) {
            join.add(number.toString());
        }
        return join.toString();
        }
}
