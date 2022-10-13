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
public class TraditionalFizzBuzz {
    
    public static void main(String[] args) {
        String stringnumber;
        
        System.out.println("Pick a number! for fizzing and buzzing purposes.");
        Scanner inputReader = new Scanner(System.in);
        stringnumber = inputReader.nextLine();
        int number = Integer.parseInt(stringnumber);
        
        int fizz = 0;
        int buzz = 0; 
        int fizzbuzz = 0;
        
        for (int i=1; i < number; i++) {
            
            if (i%3==0){
                System.out.println("fizz");
                fizz +=1;
            }
            else if (i%5==0){
                System.out.println("buzz");
                buzz +=1;
            }
            else if (i%3==0 && i%5==0){
                System.out.println("fizzbuzz");
                fizzbuzz +=1;
            }
            else if (fizz+buzz+fizzbuzz == number){
                break;
            }
            else {
                System.out.println(i);   
            }
            
        }

    }
}
