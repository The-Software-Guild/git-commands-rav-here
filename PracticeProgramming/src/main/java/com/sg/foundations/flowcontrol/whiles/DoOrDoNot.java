/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.whiles;
import java.util.Scanner;
/**
 *
 * @author rachelvickerman
 */
public class DoOrDoNot {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Should I do it? (y/n) ");
        boolean doIt;

        if (input.next().equals("y")) {
            doIt = true; // DO IT!
        } else {
            doIt = false; // DONT YOU DARE!
        }

        boolean iDidIt = false;

        while (doIt) { // while doit is true 
            iDidIt = true; // didit is true
            break;
        } 

        if (doIt && iDidIt) { // prints if both true 
            System.out.println("I did it!");
        } else if (!doIt && iDidIt) { // prints if doit false (hence negation true) and didit true true
            System.out.println("I know you said not to ... but I totally did anyways.");
        } else { // prints if doit is false and didit is false
            System.out.println("Don't look at me, I didn't do anything!");
        }
    }
    
}
