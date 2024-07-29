package com.programs;

public class Fibonacci {
    //0,1,1,3,5,8,13
    static int n1 = 0, n2 = 1, n3 = 0;

    public static void main(String[] args) {
        int count = 10;
        System.out.println(n1 + " " + n2);
        getFibonacci(count);
    }

    public static void getFibonacci(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            getFibonacci(count - 1);

        }

    }
}
