package com.example.demo;

import java.util.List;

public class functionaProgramming
{
    public static void main(String[] args) {
        List<String> list = List.of("Bird","Dog","Cat","Fish");
        List<Integer> intList = List.of(1,3,4,56,7,75);

        printIntList(intList);

        printList(list);
        printListFunc(list);
        printList2(list);
    }

    private static void printIntList(List<Integer> intList) {
        intList.stream().forEach(element -> System.out.println(element));
    }

    private static void printList2(List<String> list)  {
        list.stream().forEach(System.out::println);
    }

    private static void printList(List<String> list) {
        for(String string : list){
            System.out.println(string);
        }
    }

    private static void printListFunc(List<String> list) {
        list.stream().forEach(element -> System.out.println(element));
    }
}
