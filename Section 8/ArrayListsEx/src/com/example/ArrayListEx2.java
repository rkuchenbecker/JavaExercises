/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.ArrayList;
import java.util.ListIterator;


public class ArrayListEx2 {
    public static void main(String args[]) {
        ArrayList<Integer> numbers;
        numbers = new ArrayList();
        numbers.add(132);
        numbers.add(24);
        numbers.add(75);
        numbers.add(98);
        numbers.add(172);
        numbers.add(52);
        ListIterator<Integer> iterator = numbers.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        while (iterator.hasPrevious()) {
            if (iterator.previous() % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
