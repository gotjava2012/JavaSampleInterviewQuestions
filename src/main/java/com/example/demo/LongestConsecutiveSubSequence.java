package com.example.demo;

/*
 *Given an array of integers, find the length of the longest sub-sequence such that elements in the
 * subsequence are consecutive integers, the consecutive numbers can be in any order.
 *
 * Examples:
 *      Input: arr[] = {1, 9, 3, 10, 4, 20, 2}
 *      Output: 4
 *      Explanation:
 *      The subsequence 1, 3, 4, 2 is the longest
 *      subsequence of consecutive elements
 *
 *      Input: arr[] = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42}
 *      Output: 5
 * Explanation:
 *      The subsequence 36, 35, 33, 34, 32 is the longest
 *      subsequence of consecutive elements.
 */

import java.util.HashSet;

public class LongestConsecutiveSubSequence {

        public static void main(String[] args) {
            int nums[] = {49, 1, 3, 200, 2, 4, 70, 5, 6};

            System.out.println("Original array length: "+nums.length);
            System.out.print("Array elements are: ");

            for (int i = 0; i < nums.length; i++)
            {
                System.out.print(nums[i]+" ");
            }
            System.out.println("\nThe new length of the array is: "+longest_sequence(nums));

        }

        public static int longest_sequence(int[] nums) {

            final HashSet<Integer> hashSet = new HashSet<Integer>();
            for (int i : nums) hashSet.add(i);

            int longest_sequence_len = 0;
            for (int i : nums) {
                int length = 1;
                for (int j = i - 1; hashSet.contains(j); --j) {
                    hashSet.remove(j);
                    ++length;
                }
                for (int j = i + 1; hashSet.contains(j); ++j) {
                    hashSet.remove(j);
                    ++length;
                }
                longest_sequence_len = Math.max(longest_sequence_len, length);
            }
            return longest_sequence_len;
        }

}
