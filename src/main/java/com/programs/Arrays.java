package com.programs;

import java.util.*;

public class Arrays {

    public static void main(String[] args) {
        /*int [] arr = {10,20,30,10,40,40};
        removeDuplicates(arr);*/
        String [] strings = {"Bangalore","Mysore","Hyderabad","Telangana","Mysore"};
        removeDuplicatesinString(strings);
    }

    public static void removeDuplicatesinString(String[] strings){
        ArrayList<String> ls = new ArrayList<String>();
        for (int i=0;i<strings.length;i++){
            for (int j=i+1;j<strings.length;j++){
                if (strings[i]==strings[j]){
                    //System.out.println("Duplicates "+strings[j]);
                    ls.add(strings[j]);
                }


            }


        }
        System.out.println(ls);



    }


    public static void removeDuplicates(String[] strarray){
        Set set = new HashSet();
        for (int i =0;i<strarray.length;i++){

        }
    }
    public static void removeDuplicates(int [] arr) {


       for (int i=0;i<arr.length;i++){
           //System.out.print("outer "+arr[i]);
           for (int j=i+1;j<arr.length;j++){
               if (arr[i]==arr[j]){
                   System.out.println("duplicate numbers "+arr[j]);

               }


           }


       }


    }
}
