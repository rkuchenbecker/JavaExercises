/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ComputeAvg {

    public static void main(String args[]) {
        double[] scores = new double[5];
        Scanner keyboard = new Scanner(System.in);
        double avg = 0.0, sum = 0.0;

        System.out.println("Enter 5 Test Scores here: ");
        for (int i = 0; i<scores.length; i++) {
            scores[i] = keyboard.nextInt();
        }
        System.out.println("Display the Entered Scores: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
            avg = sum / scores.length;
        }
        System.out.println("Your Average Score is: "+ avg);
    }

}
