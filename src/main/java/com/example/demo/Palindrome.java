package com.example.demo;

public class Palindrome {
    public static void main(String args[]) {
        System.out.println("Is ababab palindrom?: " + isPalindromString("aaa"));
        System.out.println("Is abc palindrom?: " + isPalindromString("abc"));

        System.out.println("Is bbbb palindrom?: " + isPalindromString("bbbb"));
        System.out.println("Is defg palindrom?: " + isPalindromString("defg"));

        System.out.println("Is ababab palindrom?: " + isPalindromString2("aaa"));
        System.out.println("Is abc palindrom?: " + isPalindromString2("abc"));

        System.out.println("Is bbbb palindrom?: " + isPalindromString2("bbbb"));
        System.out.println("Is defg palindrom?: " + isPalindromString2("defg"));

    }

    /**
     * Java method to check if given String is Palindrome
     * @param input
     * @return true if text is palindrome, otherwise false
     */
    public static boolean isPalindromString(String input){
        String reverse = reverse(input);
        return input.equals(reverse) ;
    }

    public static boolean isPalindromString2(String input){
        String reverse = getReverse(input);
        return input.equals(reverse) ;
    }

    /**
     * Java method to reverse String using recursion
     * @param input
     * @return reversed String of input
     */
    public static String reverse(String input){
        if(input == null || input.isEmpty()){
            return input;
        }
        return input.charAt(input.length()- 1) + reverse(input.substring(0, input.length() - 1));
    }

    public static String getReverse(String word){
        char[] temp  = new char[word.length()];

        int j = 0;
        for( int i = word.length() - 1 ; i >= 0  ; i-- , j++){
           temp[j] = word.charAt(i);
        }

        return String.valueOf(temp);

    }

}
