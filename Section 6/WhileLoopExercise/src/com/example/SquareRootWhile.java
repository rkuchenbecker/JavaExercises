
package com.example;

import java.util.Scanner;


public class SquareRootWhile {
    public static void main(String args[])
    {
    System.out.print("Type a non-negative Double: ");
     Scanner console = new Scanner(System.in);
	double number = console.nextDouble();
	while (number > 0) {
	    number = Math.sqrt(number);
	    System.out.println(number);
	    console = new Scanner(System.in);
	    number = console.nextDouble();
    }

	
    
}
    
}
