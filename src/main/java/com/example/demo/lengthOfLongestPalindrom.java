package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class lengthOfLongestPalindrom {
    public static void main(String[] args) {
//        String word = "babad";
        String word = "cbbd";
        String longestPalindrome = lengthOfLongestPalindromFinder(word);
        System.out.println(longestPalindrome);
    }

    private static String lengthOfLongestPalindromFinder(String word) {
        List<Character> list = new ArrayList<>();
        List<Character> temp = new ArrayList<>();
        int j = 0;
        for( int i = word.length() - 1 ; i >= 0  ; i-- , j++){
            if( word.charAt(i) == word.charAt(j) ){
                    temp.add(word.charAt(i));
            }
            if(temp.size() > list.size()){
                list = temp;
            }

        }

        return String.valueOf(list);
    }
}
