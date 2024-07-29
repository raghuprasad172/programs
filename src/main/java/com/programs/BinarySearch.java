package com.programs;

public class BinarySearch {


    public static void main(String[] args) {
        int []array={2,3,4,10,40};
        int target =10;
        //binarySearch(array,target);
        if (binarySearch(array,target)==-1){
            System.out.println("Element isn't present in given array");
        }
        else
            System.out.println("Element found at index "+binarySearch(array,target));
    }


    public static void printOnce(String removeDuplicate){
        String printOnce = "";
        for (int i=0;i<=removeDuplicate.length()-1 ;i++ ){
            for (int j=i+1;j<=removeDuplicate.length()-1 ;j++ ){
                if (removeDuplicate.charAt(i)==removeDuplicate.charAt(j)){
                    printOnce = printOnce+removeDuplicate.charAt(i);
                    break;
                }
            }
            i++;
        }
        System.out.println("removed all duplicate Characters "+printOnce);
    }
    public static int binarySearch(int [] array , int target){
        int left =0;
        int right =array.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            ///System.out.println(mid);
            if (array[mid]==target){
                return mid;
            }
            //if not  add one from left
            if (array[mid]<target){
                left=mid+1;
            }
            //if not  minus one from right
            else {
                right=mid-1;
            }


        }
        return -1;


    }
}
