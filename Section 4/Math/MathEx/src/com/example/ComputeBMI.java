/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;


import java.util.Scanner;
import java.lang.Math;


public class ComputeBMI {
    public static void main(String[] args)
	{
        double BMI;
        double weight;
        double height;

        Scanner sc = new Scanner(System.in);
        weight = sc.nextDouble();
        height = sc.nextDouble();

        BMI = weight / (Math.pow(height,2)) * 703;
        BMI = Math.round(BMI);
        System.out.println(BMI);
        
        }
}
