/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.random;
import java.util.Random;
/**
 *
 * @author rachelvickerman
 */
public class CoinFlipper {
    
    public static void main(String[] args) {
        
        System.out.println("Ready, set, flip...");
        Random r = new Random();
        double randomV = r.nextDouble(); //random number between 0.0 and 1.0
        boolean coinHeads = randomV < 0.5;
        if (coinHeads == true){
            System.out.println("You got heads!");
        }
        else {
            System.out.println("You got tails!");
        }
        
    }
    
}
