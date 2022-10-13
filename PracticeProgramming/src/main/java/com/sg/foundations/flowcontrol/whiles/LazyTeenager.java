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
public class LazyTeenager {
    
    
     public static void main(String[] args) {
        
        Random r = new Random();
        double rV = r.nextDouble();
        int count = 0;
        double chance = 0.0;
         do {
            count +=1;
            chance += 0.1;
            
            System.out.println("TIDY YOUR ROOM! x"+ count);
             
             
        }
        
        while (chance != rV && count < 7);
        System.out.println("FINE! I'm doing it.");
        
    }
    
   
    
}
