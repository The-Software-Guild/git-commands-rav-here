/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.fors;

/**
 *
 * @author rachelvickerman
 */
public class DifferentKettleOfFish {
    
    public static void main(String[] args) {

        int fish = 1;
        
        for (int i=1; i<10; i++) { 
        //while(fish < 10){
            if(fish == 3){
                System.out.println("RED fish!");
            }else if(fish == 4){
                System.out.println("BLUE fish!");
            } else{
                System.out.println(fish + " fish!");
            }

            fish++;
        }

    }
    
}
