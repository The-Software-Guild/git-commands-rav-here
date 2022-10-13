/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rv_mthree.assbasicprogrammingconcepts;

import java.util.Scanner;

/**
 *
 * @author rachelvickerman
 */
public class HealthyHearts {
    
    public static void main(String[] args) {
        
        String sage;
        
        int age;
        
        Scanner inputReader = new Scanner(System.in);
        System.out.println("What is your age?");
        sage = inputReader.nextLine();
        age = Integer.parseInt(sage);
        
        
        int maxHR = 220 - age;
        int l = (maxHR/100)*50;
        int h = (maxHR/100)*85;
        
        System.out.println("Your Maximum heart rate should be " + maxHR + " beats per minute.");
        System.out.println("Your target HR zone is " + l + "-" + h + " beats per minute" 
        );
        
        
    }
    
    
}
