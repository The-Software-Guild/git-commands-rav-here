/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.scanner;

import java.util.Scanner;
/**
 *
 * @author rachelvickerman
 */
public class AllTheTrivia {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("What unit is equivalent to 1024 Gigabytes?");
        String s1 = input.nextLine();
        System.out.println( "Which planet is the only one that rotates clockwise in our Solar System?");
        String s2 = input.nextLine();
        System.out.println("The largest volcano ever discovered is located on which planet?");
        String s3 = input.nextLine();
        System.out.println("What is the most abundant element in the Earth's atmosphere?");
        String s4 = input.nextLine();
        
        System.out.println("Wow, 1,024 Gigabytes is a " + s3);
        System.out.println("I didn't know that the largest ever volcano was discovered on "+ s4);
        System.out.println("That's amazing that " + s1 + " is the most abundant element in the atmosphere.");
        System.out.println(s2 + " is the only planet that rotates clockwise, neat!");
     
    }
    
}
