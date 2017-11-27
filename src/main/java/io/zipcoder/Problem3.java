package io.zipcoder;

public class Problem3 {

    public static void main(String[] args){
        Problem3 test = new Problem3();
        System.out.println("Iterative:");
        System.out.println(test.wuTangCounting(50));
        System.out.println("\nRecursive");
        System.out.println(test.recursiveWuTang(1,50));
    }

    public String wuOrTang(int n){

        String returnMe="";
        if (n%3==0){
            returnMe+="Wu";
        }
        if (n%5==0){
            returnMe+="Tang";
        }
        if (n%3!=0 && n%5!=0){
            returnMe+=""+n;
        }

        return returnMe;
    }

    public String recursiveWuTang(int start, int n){
        if (start>n){
            return "";
        }
        String returnMe="";
        if (start%3==0){
            returnMe+="Wu";
        }
        if (start%5==0){
            returnMe+="Tang";
        }
        if (start%3!=0 && start%5!=0){
            returnMe+=""+start;
        }
        if (start==n){
            return returnMe;
        }

        return returnMe+(", "+recursiveWuTang(start+1, n));
    }

    public String wuTangCounting(int n){
        StringBuilder output = new StringBuilder();
        for (int i=1; i<n; i++){
            output.append(wuOrTang(i)+", ");
        }
        output.append(wuOrTang(n));
        return(output.toString());
    }

}
