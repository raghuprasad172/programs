package com.programs;

public class Factorial {
    //5!=5*4*3*2*1 = 120
    static int factorial = 9;

    public static void main(String[] args) {
        System.out.print(" = "+factorial(factorial));;




    }




    public static int factorial(int factorial) {
        System.out.print(factorial+" * ");
        if (factorial == 0 || factorial == 1) {
            return 1;
        }
        else {
            return factorial*factorial(factorial-1);
        }


    }


}
