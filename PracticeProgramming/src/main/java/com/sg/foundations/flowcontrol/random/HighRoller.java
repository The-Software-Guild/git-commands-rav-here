/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.random;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author rachelvickerman
 */
public class HighRoller {
    
        public static void main(String[] args) {
            
        Scanner input = new Scanner(System.in);
        System.out.println("How many sides does a single die have?");
        String sds = input.nextLine();
        int sides = Integer.parseInt(sds);
        
        Random diceRoller = new Random();
        
        int rollResult = diceRoller.nextInt(sides) + 1;
        
        
        System.out.println("TIME TO ROOOOOOLL THE DICE!");
        System.out.println("I rolled a " + rollResult);

        if (rollResult == 1) {
            System.out.println("You rolled a critical failure!");
        }
        else if (rollResult == sides) {
            System.out.println("You rolled a critical! Nice job!");  
        }
    }

    
}
