package com.example.demo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        //creating two int array and adding values
        int[] arrayNum1 = new int[]{1,1,3,4,4,5,6};
        int[] arrayNum2 = new int[]{2,2,3,4,5,5,7,7};

        // calling the method we created
        int[] result = intersect(arrayNum1, arrayNum2);

        // printing out the values of the array
        System.out.println(Arrays.toString(result));

    }

        public static int[] intersect(int[] array1, int[] array2) {
            //validating the arrays are not empty or null
            if(array1 == null || array2 == null || array1.length==0  || array2.length==0)
                return new int[0];

            // step1: Put elements in array1 into the map
            HashMap<Integer,Integer> map = new HashMap<>();

            for(int arr:array1)
                if(map.containsKey(arr))
                    map.put(arr,map.get(arr)+1);
                else
                    map.put(arr,1);

                // step 2: iterate the array2 and get the result
            List<Integer> result = new ArrayList<>();

            for (int arr : array2) {
                if (map.containsKey(arr) && map.get(arr) > 0)
                {   result.add(arr);
                    int freq = map.get(arr);
                    freq--;
                    map.put(arr, freq);
                }
            }
            System.out.println("array1 = " + Arrays.toString(array1) + ", array2 = " + Arrays.toString(array2));
            System.out.println("result = " + result.toString());
            return listToArray(result);
        }

        //converting the list of autoBoxed Integers to an int[]
        private static int[] listToArray(List<Integer> list) {
            int[] result = new int[list.size()];

            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }

            return result;
        }

}
