package com.example.demo;

public class DecodeString {
    public static String decodeString(String timesToRepeat, String s) {

        StringBuilder sb = new StringBuilder();
        boolean closed = true;

        for (int i=0; i<s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                timesToRepeat += s.charAt(i);
                StringBuilder repeats = new StringBuilder();

                for (int j=++i; j<s.length(); j++) {
                    if(Character.isDigit(s.charAt(j))){
                        repeats.append(decodeString(timesToRepeat,(s.substring(j,s.length()))));
                        break;
                    }
                    if (s.charAt(j)=='[') {
                        //start of group
                        closed = false;
                    } else if (s.charAt(j)==']') {
                        //end of group
                        closed = true;
                        break;
                } else {
                    //has repeat character
                    repeats.append(s.charAt(j));
                }
                ++i;
                }
                // uses the repeat method to add the repeated character to the stringBuilder
                sb.append(repeats.toString().repeat(Integer.parseInt(timesToRepeat)));
                timesToRepeat = "" ;
            }
            if ( !Character.isDigit(s.charAt(i)) && closed && s.charAt(i)!=']' ){
                 sb.append(s.charAt(i));
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String s = "3[a2[c]]"; //"accaccacc"
//        String s = "abc3[cd]xyz"; //"accaccacc"
//        String s = "100[leetcode]"; //"accaccacc"
//        String s = "2[abc]3[cd]ef"; //"accaccacc"
//        String s = "3[a2[c]]"; //"accaccacc"

        String s1 = decodeString("",s);
        System.out.println(s1);
    }
}