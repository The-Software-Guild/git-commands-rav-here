/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author rachelvickerman
 */
public class GuessMe {
    
     public static void main(String[] args) {
         int MyNumber = 14;
         int YourNumber;
         String stringNumber;
         
        Scanner myScanner = new Scanner(System.in);
        // receiving and storing inputs 
        System.out.println("I've chose a number. Bet you can't guess it!");
        stringNumber = myScanner.nextLine();
        YourNumber = Integer.parseInt(stringNumber);
        System.out.println("Your guess: " + YourNumber);
        
        if(YourNumber < MyNumber) {
            System.out.println(YourNumber + " ha nice try - too low! I chose " + MyNumber);
        }
        else if(YourNumber > MyNumber) {
            System.out.println(YourNumber + " ha nice try - too high! I chose " + MyNumber);
        }
        else {
            System.out.println("well done, good guess");
        }  
     }
}
