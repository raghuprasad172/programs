package com.programs;

public class Summation {

    public static void main(String[] args) {
        String str = "1 2 3";
        sumString(str);
    }
    public static void sumString(String str){
       String[] splitted=str.split("\\s+");
       int num =0;
       for (int i=0;i<splitted.length;i++){
            num =num+Integer.parseInt(splitted[i]) ;

       }
        System.out.println(num);




    }

}
