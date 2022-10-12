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
public class MiniMadLibs {
    
    public static void main(String[] args) {
        
        String noun1, adjective1, noun2, number, adjective2, pluralnoun1, pluralnoun2, verbpresent, verbpast; 
        
        Scanner inputReader = new Scanner(System.in);

        System.out.println("lets play madlips, I need a noun");
        noun1 = inputReader.nextLine();
        
        System.out.println("Now an adjective");
        adjective1 = inputReader.nextLine();
        
        System.out.println("Noun please");
        noun2 = inputReader.nextLine();
        
        System.out.println("Number please");
        number = inputReader.nextLine();
        
        System.out.println("Adjective please");
        adjective2 = inputReader.nextLine();
        
        System.out.println("plural noun please");
        pluralnoun1 = inputReader.nextLine();
        
        System.out.println("another plural noun please");
        pluralnoun2 = inputReader.nextLine();
        
        System.out.println("present tense verb please");
        verbpresent = inputReader.nextLine();
        
        System.out.println("past tense of the same verb please");
        verbpast = inputReader.nextLine();
        
        
        System.out.println(noun1 + " the " + adjective1 + " frontier. "
                + "These are the voyages of the starship " + noun2 + "." 
                        + " Its " + number + " year mission: to explore strange " 
                + adjective2 + " " + pluralnoun1 + " , to seek out " + adjective2 
                + " " + pluralnoun1 + " " + adjective2 + " " + pluralnoun2 
                + " , to boldly " + verbpresent + " where no one has " 
                +  verbpast + " before.");
    }
    
}
