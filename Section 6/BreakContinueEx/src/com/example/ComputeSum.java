package com.example;

import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 2;
        int number = 0;
        System.out.println("enter a Number that is not 0: ");
        number = sc.nextInt();
        int sum = 0;
        while (number >= 0) {
            sum = sum + number;
            System.out.println("enter a Number that is not 0: ");
            number = sc.nextInt();
            if (i >= 10) {
                System.out.println(sum);
                break;
            }
            System.out.println(i++);
        }
       

    }
}
