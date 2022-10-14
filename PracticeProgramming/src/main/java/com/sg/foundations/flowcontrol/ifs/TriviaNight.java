/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author rachelvickerman
 */
public class TriviaNight {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("IT'S TRIVIA NIGHT! Are you ready?");
        System.out.println("First question: What is the Lowest Level Programming Language?");
        System.out.println("1. Source code      2. Assembly     3.C sharp    4.Machine Code");
        String a1 = input.nextLine();
        System.out.println("Your answer: " + a1);
        
        System.out.println("Second question: Website Security CAPTCHA Forms Are Descended From the Work of?");
        System.out.println("1. Grace Hopper      2. Alan Turing     3.Charles Babbage    4.Larry Page");
        String a2 = input.nextLine();
        System.out.println("Your answer: " + a2);
        
        System.out.println("Third question: Which of These Sci-Fi Ships Was Once Slated for a Full-Size Replica in Las Vegas?");
        System.out.println("1. Serenity      2. The Battlestar Galactica     3.The USS Enterprise    4.The Millennium Falcon");
        String a3 = input.nextLine();
        System.out.println("Your answer: " + a3);
        
        int correct = 0;
        int wrong = 0;
        
        if (a1.equals("Assembly")) {
            correct += 1;
        } 
        else {
            wrong += 1;
        }
        
        if (a2.equals("Alan Turing")) {
            correct += 1;
        } 
        else {
            wrong += 1;
        }
        
        if (a3.equals("The USS Eneterprise")) {
            correct += 1;
        } 
        else {
            wrong += 1;
        }
        
        System.out.println("Nice job - you got " + correct + " correct!");
    }
}
