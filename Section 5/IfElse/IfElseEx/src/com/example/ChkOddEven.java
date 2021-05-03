/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author anshenoy
 */
import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter a number between 1 to 10:");
        num = in.nextInt();
        if (num > 10) {
            System.out.println("Number is not in Valid Range");
        }
        else if (num % 2 == 1) {
            System.out.println("The Number: " + num + " is Odd");
        }
        else {
            System.out.println("The Number: "+num+" is Even");
        }
    }
}
