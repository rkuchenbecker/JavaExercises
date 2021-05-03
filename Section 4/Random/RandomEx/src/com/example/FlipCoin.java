/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Random;

public class FlipCoin {

    public static void main(String[] args) {
        int i = 0;
        int y = 1;
        int heads = 0;
        int tails = 0;
        // 50% chance heads, 50% chance tails
        while (i < 100) {
            Random rand = new Random();
            double chance = rand.nextDouble();
            //System.out.println(chance);
            if (chance < 0.5) {
                heads++;
            } else {
                tails++;
            }
            i++;
            }
        while (y < 11) {
            System.out.println("heads: " + heads);
            System.out.println("tails: " + tails);
            System.out.println("iteration: " + y);
            y++;
        }
        }
    }

