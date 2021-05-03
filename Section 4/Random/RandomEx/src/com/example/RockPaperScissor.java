/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;


import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(3);
        if (number == 0) {
            System.out.println("rock " + number);
        }
        else if (number == 1) {
            System.out.println("paper " + number);
        }
        else {
            System.out.println("scissors " + number);
        }
    }
}
