package com.example;

import java.util.Scanner;

public class Divisors {

    public static void main(String args[]) {

        
         Scanner console = new Scanner(System.in);
         
        System.out.print("Enter the number :  "); //user inputs a number
        int num = console.nextInt();
         
     System.out.print("Divisors of " + num+" "+ "="+" " ); // prints String for Divisor

        for (int i = 1; i < num; i++) { //counter initialized, stops if counter is higher then number, increments counter
            if (num % i != 0) { //when number is not Even, returns back at top of iteration
                continue;
            }
            System.out.print(i + " , "); // prints Divisors
        }
    }
}
