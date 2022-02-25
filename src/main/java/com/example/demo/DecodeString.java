package com.example.demo;

public class DecodeString {
    public static String decodeString(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                int timesToRepeat = Integer.parseInt(""+s.charAt(i));
                StringBuilder repeats = new StringBuilder();

                for (int j=++i; j<s.length(); j++) {
                    if(Character.isDigit(s.charAt(j))){
                        repeats.append(decodeString((s.substring(j,s.length()-1))));
                        break;
                    }
                    if (s.charAt(j)=='[') {
                        //start of group
                    } else if (s.charAt(j)==']') {
                        //end of group
                        break;
                } else {
                    //has repeat character
                    repeats.append(s.charAt(j));
                }
                ++i;
                }
                // uses the repeat method to add the repeated character to the stringBuilder
                sb.append(repeats.toString().repeat(timesToRepeat));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String s = "3[a2[c]]"; //"accaccacc"

        String s1 = decodeString(s);
        System.out.println(s1);
    }
}