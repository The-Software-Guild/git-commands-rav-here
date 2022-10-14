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
public class ForTimes {
    
    public static void main(String[] args) {
        // initialise scanner, ask q and store input as integer 
        Scanner reader = new Scanner(System.in);
        System.out.println("Which times table shall I recite?");
        String number = reader.nextLine();
        int table = Integer.parseInt(number);
        
        for (int i=1; i<15+1; i++) {
            int ans = i * table;
            System.out.println(i + "*" + table + "=" + ans);
        }
        
    }
    
}
