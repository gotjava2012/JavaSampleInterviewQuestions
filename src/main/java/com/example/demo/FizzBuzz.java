package com.example.demo;

public class FizzBuzz {
    public static void main(String[] args) {

        int number = 100;
        fizzBuzz(number);


    }

    private static void fizzBuzz(int number) {

        for (int i=1; i<=number; i++)
        {
            // number divisible by 15(divisible by
            // both 3 & 5), print 'FizzBuzz' in
            // place of the number
            if (i%15==0)
                System.out.println("FizzBuzz"+" ");

            // number divisible by 5, print 'Buzz'
            // in place of the number
            else if (i%5==0)
                System.out.println("Buzz"+" ");

            // number divisible by 3, print 'Fizz'
            // in place of the number
            else if (i%3==0)
                System.out.println("Fizz"+" ");

            else // print the numbers
                System.out.println(i+" ");
        }
    }
}
