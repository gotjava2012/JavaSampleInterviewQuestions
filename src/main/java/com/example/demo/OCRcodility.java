package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class OCRcodility {


    public static void main(String[] args) {
//        String S ="1Ad";
//        String T = "ba1";

        String S ="a10";
        String T = "10a";

//        ('a10', '10a')
//        ('ba1', '1Ad')
        System.out.println(solution(S,T));
    }

    public static boolean solution(String S, String T) {
            // write your code in Java SE 8
            if(S.length() != T.length()){
                return false;
            }
            List listS = new ArrayList();
            StringBuilder word = new StringBuilder();
            int count = 0;
            String newS = findNumber(S, listS, word, count);

            List listT = new ArrayList();
            int count2 = 0;
            StringBuilder word2 = new StringBuilder();
            String newT = findNumber(T, listT, word2, count2);

            if(listS.equals(listT)){
                return true;
            }
            if(compareString( newT, newS)){
                return true;
            }
            return false;
    }

    private static boolean compareString(String newT, String newS) {
        boolean temp =  false;
        for( int i = 0; i < newS.length(); i ++){

            if(newT.charAt(i) == newS.charAt(i) ){
                    temp = true;
            }if(newT.charAt(i) != newS.charAt(i) ){
                if(newT.charAt(i) != '?' && newS.charAt(i) == '?'){
                    temp = true;
                }
                if(newT.charAt(i) != '?' && newS.charAt(i) == '?'){
                    temp = true;
                }
            }

        }
        return temp;
    }

    public static String findNumber(String str, List list, StringBuilder word , int count){

        for(int i = 0 ; i < str.length(); i ++){

            if(Character.isDigit(str.charAt(i))){
                list.add(str.charAt(i));
                count++;
                return findNumber(str.substring(i + 1, str.length()), list, word, count);
            }if(Character.isAlphabetic(str.charAt(i))){

                if( !list.isEmpty() && count != 0){
                    int num = converToInteger(list);
                    System.out.println(num);
                    while(num != 0){
                        word.append("?");
                        num--;
                    }
                    word.append(str.charAt(i));
                }else
                    word.append(str.charAt(i));
                list.clear();
                count = 0;

            }


        }
        if( !list.isEmpty()){
            int num = converToInteger(list);
            System.out.println(num);
            while(num != 0){
                word.append("?");
                num--;
            }
        }
        System.out.println(word.toString());
        return word.toString();
    }
    public static int converToInteger(List integers){
            StringBuilder str = new StringBuilder();
            for(int i = 0 ; i < integers.size(); i++){
                str.append(integers.get(i));
            }
            return Integer.parseInt(str.toString());

    }
}
