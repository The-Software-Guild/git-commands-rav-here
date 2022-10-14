/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.fors;
import java.util.Scanner;
/**
 *
 * @author rachelvickerman
 */
public class TwoForsAndTenYearsAgo {
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("What year would you like to count back from? ");
        int year = userInput.nextInt();

        for (int i = 0; i <= 10; i++) { // start at zero, stop at 10
            System.out.println(i + " years ago would be " + (year - i));
        }

        System.out.println("\nI can count backwards using a different way too...");

        for (int i = year; i >= year - 20; i--) { // start at the year, end at the year minus 10
            System.out.println( (year - i) + " years ago would be " + i);
        }
    }
    
}


// top loop clearer, runs 10 times clearly - other one very specific to question