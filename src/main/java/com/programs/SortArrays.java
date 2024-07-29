package com.programs;

import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SortArrays {

    public static void main(String[] args) {
        int[] arr ={2,4,1,7,3,9};
       List<Integer>list= Arrays.asList(1,4,23,5,6,9,65,89,46,2);
        ascendingSort(arr);
        //descendingSort(list);
    }
   /* public static void ascendingSort(List<Integer> arr){
        List<Integer> ascendingSort=arr.stream().sorted().collect(Collectors.toList());
        System.out.println("Ascending order "+ascendingSort);
    }*/
    public static void ascendingSort(int[] arr){
        for (int i=0;i<= arr.length-1;i++){
            for (int j=i+1;j<= arr.length-1;j++){
                if (arr[i]>arr[j]){
                    System.out.print(""+arr[i]);
                }
            }
        }
    }





    public static void descendingSort(List<Integer> arr){
       List<Integer> descendingSort=arr.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("descending sort "+descendingSort);
    }
}
