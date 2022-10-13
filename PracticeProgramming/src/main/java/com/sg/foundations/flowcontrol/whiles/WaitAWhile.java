/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.whiles;

/**
 *
 * @author rachelvickerman
 */
public class WaitAWhile {
    
    public static void main(String[] args) {

        int timeNow = 5; //this being larger than bedTime means the loop ends after one iteration
        int bedTime = 10; //runs the code up to 11 oclock

        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            timeNow++; // Time passes //without this the loop would continue at 5
        }

        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");
    }
    
}
