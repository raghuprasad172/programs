package com.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Palindrome {

    public static void main(String[] args) {
        String str ="madam";
        checkPalindrome(str);
        reverseString(str);
    }



    public static void reverseString(String original){
       List<String>strings = Arrays.asList(original);
      strings.stream().map(String::toUpperCase).forEach(System.out::println);
    }
    public static void checkPalindrome(String original){
        String temp ="";

        for (int i=original.length()-1;i>=0;i--){
            temp=temp+original.charAt(i);

        }
        if (temp.equals(original)){
            System.out.println("palindrome "+temp);
        }
        else {
            System.out.println("not a palindrome "+ original);
        }
    }
}
