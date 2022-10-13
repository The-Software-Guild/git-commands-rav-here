/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.arrays;
import java.util.Random;
/**
 *
 * @author rachelvickerman
 */
public class HiddenNuts {
    
    public static void main(String[] args) {

        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        System.out.println("The nut has been hidden ...");
        
        for (int i=0; i < hidingSpots.length; i++) {
            String space = hidingSpots[i];
            if (space == "Nut") {
                System.out.print("Found it! It's in spot " + i);
            }
            
        }
    }
    
}
