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
public class BewareTheKraken {
    
    public static void main(String[] args) {

        System.out.println("Already, get those flippers and wetsuit on - we're going diving!");
        System.out.println("Here we goooOOooOooo.....! *SPLASH*");

        int depthDivedInFt = 0;

        // Turns out the ocean is only so deep, 36200 at the deepest survey,
        // so if we reach the bottom ... we should probably stop.
        while(depthDivedInFt < 36200){
            System.out.println("So far, we've swum " + depthDivedInFt + " feet");
            System.out.println("Do you want to keep going?");
            Scanner inputReader = new Scanner(System.in);
            String status = inputReader.nextLine();
            
            if (status.equals("No")){
                System.out.println("Time to resurface.");
            }
                        
            else if(depthDivedInFt >= 20000){
                System.out.println("Uhhh, I think I see a Kraken, guys ....");
                System.out.println("TIME TO GO!");
                break;
            }

            // I can swim, really fast! 500ft at a time!
            depthDivedInFt += 1000;
            String[] fish = new String[] {"tuna", "salmon", "trout"};
            Random r = new Random();
            int rfish = r.nextInt(fish.length);
            String f = fish[rfish];
            System.out.println("Look a " + f);
        }
        System.out.println("");
        System.out.println("We ended up swimming " + depthDivedInFt + " feet down.");
        System.out.println("I bet we can do better next time!");
    }
    
}
