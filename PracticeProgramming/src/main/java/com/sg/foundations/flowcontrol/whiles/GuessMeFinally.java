/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rachelvickerman
 */
public class GuessMeFinally {
    
    public static void main(String[] args) {
        // initialise random
        Random randomizer = new Random();
        // variables
        int MyNumber = randomizer.nextInt(100- -100) + - 100;
        int YourNumber;
        String stringNumber;
        // scanner and question 
        Scanner myScanner = new Scanner(System.in);
        System.out.println("I've chose a number. Bet you can't guess it!");
           
        // do the guessing game while the input does not match
        do { 
            // receiving and storing inputs 
            stringNumber = myScanner.nextLine();
            YourNumber = Integer.parseInt(stringNumber);
            System.out.println("Your guess: " + YourNumber);

            if(YourNumber < MyNumber) {
                System.out.println(YourNumber + " ha nice try - too low! Guess again");
            }
            else if(YourNumber > MyNumber) {
                System.out.println(YourNumber + " ha nice try - too high! Guess again");
            }
            else {
                System.out.println("well done, good guess");
            }  
         } while (YourNumber != MyNumber);
    }
}
