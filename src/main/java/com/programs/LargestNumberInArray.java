package com.programs;

public class LargestNumberInArray {

    public static void main(String[] args) {
        int[] arr ={32,45,-56,-567,8945};
        findLargestArray(arr);



    }

    public static void findLargestArray(int[] arr){
        int largest =arr[0];
        int smallest =arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>arr[0]){
                largest=arr[i];

            }
           else if (arr[i]<arr[0]){
                smallest=arr[i];

            }

        }
        System.out.println("largest number in given array "+largest);
        System.out.println("smallest number in given array "+smallest);

    }
}
