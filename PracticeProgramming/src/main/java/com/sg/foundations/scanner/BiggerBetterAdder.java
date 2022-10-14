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
public class BiggerBetterAdder {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Give me a number!");
        String sa = input.nextLine();
        int a = Integer.parseInt(sa);
        System.out.println("Give me a another number!");
        String sb = input.nextLine();
        int b = Integer.parseInt(sb);
        System.out.println("and another number!");
        String sc = input.nextLine();
        int c = Integer.parseInt(sc);

        int sum1 = a+b+c;

        
        System.out.println(a + " + " + b + " + " + c + " = " + sum1);
        
    }
    
}
