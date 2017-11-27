package io.zipcoder;

class Problem1 {

    public static void main(String[] args) {
   // Problem1.wuTangNumbers(50);
    }


    public int wuTangNumbers(int n){
        String wuTang = "WuTang\n";
        String wu = "Wu\n";
        String tang = "Tang\n";
        for(int i = 1; i <= n; i++){
            if(i%3==0 && i%5==0){
                return Integer.parseInt(wuTang);
            }
            else if(i%5==0){
                return Integer.parseInt(tang);
            }
            else if(i%3==0){
                return Integer.parseInt(wu);
            }
            else{
                return i;
            }
        }
        return Integer.parseInt("\n");
    }
}
