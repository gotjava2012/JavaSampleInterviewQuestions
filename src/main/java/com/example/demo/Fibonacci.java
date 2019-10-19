package com.example.demo;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String args[]) {

        //input to print Fibonacci series
        System.out.println("Enter a number for how many iterations of the Fibonacci series to printed: ");
        int number = new Scanner(System.in).nextInt();

        System.out.println("Fibonacci series " + number +" numbers : ");
        //printing Fibonacci series
        for(int i=1; i<=number; i++){
          //  System.out.println(fibonacci2(i) +" ");
            System.out.println(fibonacci(i) +" ");
        }

    }

    /*
     * Java program for Fibonacci number using recursion.
     * This program uses tail recursion to calculate Fibonacci number for a given number
     * @return Fibonacci number
     */
    public static int fibonacci(int number){
        if(number == 1 || number == 2){
            return 1;
        }

        return fibonacci(number-1) + fibonacci(number -2); //tail recursion
    }

    /*
     * Java program to calculate Fibonacci number using loop or Iteration.
     * @return Fibonacci number
     */
    public static int fibonacci2(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        int fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= number; i++){

            //Fibonacci number is sum of previous two Fibonacci number
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;

        }
        return fibonacci; //Fibonacci number

    }

}
