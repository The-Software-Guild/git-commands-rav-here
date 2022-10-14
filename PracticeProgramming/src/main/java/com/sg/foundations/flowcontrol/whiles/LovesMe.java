/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.whiles;

/**
 *
 * @author rachelvickerman
 */
public class LovesMe {
    
    public static void main(String[] args) {
        
        int petals = 34;
        int i = 0;
        
        while (i < petals) {
            
            if (i%2 == 0) {
                System.out.println("It loves me");
                i += 1;
                    
            }
            else {
                System.out.println("It love me NOT");
                i += 1;
            }
            
        System.out.println("I knew it, yasss it loves me!");
            
        } 
    }
    
}
