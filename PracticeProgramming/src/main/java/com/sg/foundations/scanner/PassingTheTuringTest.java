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
public class PassingTheTuringTest {
    
    public static void main(String[] args) {

        //int number;
        String name, colour, food, number;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Hello there! What's your name? ");
        name = inputReader.nextLine();
        
        System.out.println("Hi " + name + " I'm comp. What's your favourite colour?");
        colour = inputReader.nextLine();
        
        System.out.println("Huh, " + colour + "? Mine is apple red.");
        System.out.println("I really like apples, what's your favourite food " + name +  "?");
        food = inputReader.nextLine();
        
        System.out.println("Really! What about numbers?");
        number = inputReader.nextLine();
        
        System.out.println(number + " is cool, mine is 4!");
        System.out.println("well, bye");
        
        
    }

}
