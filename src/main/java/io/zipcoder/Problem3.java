package io.zipcoder;

public class Problem3 {

    public String printToFifty(){
        StringBuilder result=new StringBuilder();

        String delimiter="";
        for (int i=1; i<51; i++){

            result.append(delimiter);

            if(!(i%5==0||i%3==0))
                result.append(i);
            else {
                if (i % 3 == 0)
                    result.append("Wu");
                if (i % 5 == 0)
                    result.append("Tang");
            }

            delimiter=", ";
        }

        return result.toString();
    }
}
