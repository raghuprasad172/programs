package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AddNumbers {

    public static void main(String[] args) {
        /*List<Integer> list = Arrays.asList(1,2,3,1,5,3,9);
        addNumbers(list);
        averageNumbers(list);
        numberSquareAvg(list);
        evenNumbers(list);
        oddNumbers(list);
        removeDuplicates(list)*/;
        List<Integer> list = Arrays.asList(1,2,22,1,34,2,9);
        startsWithGivenNumber(list);

    }

    public static void addNumbers(List<Integer> list){
       Optional<Integer>sum= list.stream().reduce((a, b )-> a+b);
        System.out.println("sum of numbers "+sum.get());
    }

    public static void averageNumbers(List<Integer> list){
        double avg=list.stream().mapToInt(e->e).average().getAsDouble();
        System.out.println("average of the given nummbers "+avg);
    }

    public static void numberSquareAvg(List<Integer>list){
      double avg=  list.stream()
                .map(e -> e*e)
                .filter(e-> e>2)
                .mapToInt(e -> e)
                .average().getAsDouble();
        System.out.println("number avg  "+avg);

    }

    public static void evenNumbers(List<Integer>list){
      List<Integer> even=  list.stream()
                .filter(e -> e%2==0)
                .collect(Collectors.toList());
        System.out.println("Even numbers "+even);
    }

    public static void oddNumbers(List<Integer> list){
       List<Integer> odd= list.stream()
                .filter(e -> e%2!=0)
                .collect(Collectors.toList());
        System.out.println("Odd Numbers "+odd);

    }

    public static void removeDuplicates(List<Integer> list){
        List duplicates = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Duplicates "+duplicates);
    }

    public static void startsWithGivenNumber(List<Integer>list){
     List<Integer> starts=  list.stream()
                .map(e -> String.valueOf(e))
                .filter(e -> e.startsWith("2"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println("starts with given number "+starts);

    }
}
