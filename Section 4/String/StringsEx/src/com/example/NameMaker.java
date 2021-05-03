/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;


import java.util.Scanner;

public class NameMaker {
    
    public static void main(String args[])
    {
        String firstName;
        String middleName;
        String lastName;
        String fullName;

        Scanner sc = new Scanner(System.in);
        firstName = sc.next();
        middleName = sc.next();
        lastName = sc.next();
        fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("fullname: " + fullName);
    }
    
}
