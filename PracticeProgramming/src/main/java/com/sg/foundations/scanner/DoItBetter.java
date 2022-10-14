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
public class DoItBetter {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("how many miles can you run?");
        String sMiles = input.nextLine();
        int Miles = Integer.parseInt(sMiles);
        System.out.println("Ha, I can run " + (Miles+1)+ " miles.");
        
        System.out.println("how many hotdogs can you eat?");
        String sHD = input.nextLine();
        int HD = Integer.parseInt(sHD);   
        System.out.println("Ha, I can eat " + (HD+1)+ " hotdogs.");
        
        System.out.println("how many languages can you speak?");
        String sLan = input.nextLine();
        int Lan = Integer.parseInt(sLan);
        System.out.println("Ha, I can speak " + (Lan+1)+ " languages.");
        
        
    }
    
}
