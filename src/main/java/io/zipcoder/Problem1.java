package io.zipcoder;

class Problem1 {

   // * For multiples of 3 print “Wu” instead of the number.
     //       * For multiples of 5 pring “Tang” instead of the number.
        //    * For numbers which are multiples of both 3 and 5 print “WuTang”

    public static String printNumberWithCharReplaced(int num) {
        String str = "1,";
        int i = 2;
        while (i <=num) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                str += " WuTang,";
            } else if (i % 3 == 0) {
                str += " Wu,";
            } else if (i % 5 == 0) {

                str += " Tang,";

            } else {

                str += " "+ i +"," ;
            }
            i++;
        }

        return str;

    }



    public static void main(String[] args) {
        System.out.println(printNumberWithCharReplaced(50));
    }




}
