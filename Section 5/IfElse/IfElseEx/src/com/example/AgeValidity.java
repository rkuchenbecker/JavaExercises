/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class AgeValidity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean drivingUnderAge = false;
        int Age = sc.nextInt();
        if (Age <= 18) {
            drivingUnderAge = true;
        }
        System.out.println(drivingUnderAge);
    }
}
