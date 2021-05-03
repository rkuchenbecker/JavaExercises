/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalex;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class WatchMovie {

    public static void main(String args[]) {
        System.out.print("Enter the movie ticket price and Rating \n");
        Scanner sc = new Scanner(System.in);
        int Price = sc.nextInt();
        int Rating = sc.nextInt();
        if (Price >= 12 && Rating == 5) {
            System.out.println("I'm interested in watching the movie");
        }
        else {
            System.out.println("I'm not interested in watching the movie");
        }

    }
}
