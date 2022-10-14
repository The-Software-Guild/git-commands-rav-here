/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.whiles;
import java.util.Random;
/**
 *
 * @author rachelvickerman
 */
public class MaybeItLovesMe {
    
    public static void main(String[] args) {
        
        Random r = new Random();
        
        int petals = r.nextInt(10);
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
           
        } 
        if (petals % 2 == 0) { 
            System.out.println("I knew it, yasss it loves me!");
        }
        else {
            System.out.println("Shame that is!");
      
            
        }
    }
    
}
