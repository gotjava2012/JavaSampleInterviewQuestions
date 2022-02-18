package com.example.demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {

        String letters = "sadcvfzaaaasdfaddddfgsfsd";
        System.out.println("Longest non repeating charcters is "+lengthOfLongestSubstring(letters));
        System.out.println("Longest non repeating charcters is "+getUniqueCharacterSubstring(letters));

    }

//    the time complexity of this approach is O(n^2).
    public static int lengthOfLongestSubstring(String input) {

        String output = "";

        for (int start = 0; start < input.length(); start++) {
            Set<Character> visited = new HashSet<>();
            int end = start;

            for (; end < input.length(); end++) {
                char currChar = input.charAt(end);
                if (visited.contains(currChar)) {
                    break;
                } else {
                    visited.add(currChar);
                }
            }
            if (output.length() < end - start + 1) {
                output = input.substring(start, end);
            }
        }
        System.out.println(output);
        return output.length();

    }
//    the time complexity will be linear, or O(n).
    public static int getUniqueCharacterSubstring(String str) {
        Map<Character, Integer> visited = new HashMap<>();
        String output = "";
        int  start = 0;
        for (int end = 0; end < str.length(); end++) {
            char currentCharacter = str.charAt(end);
            if (visited.containsKey(currentCharacter)) {
                start = Math.max(visited.get(currentCharacter)+1, start);
            }
            if (output.length() < end - start + 1) {
                output = str.substring(start, end + 1);
            }
            visited.put(currentCharacter, end);
        }
        System.out.println(output);

        return output.length();
    }
}
