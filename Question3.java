/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aditi
 */
public class Question3 {
    
    public static void main(String[] args) {
        int[] numbers = new int[500];
        Random randomGenerator = new Random();
        for (int i = 0; i < 500 ; i++) {
            int index = randomGenerator.nextInt(500);
            numbers[index] = index;
        }
        
        int n;
        System.out.print("Enter the value of n: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        
        System.out.println(n+"th smallest number is "+ numbers[n]);
    }
}
