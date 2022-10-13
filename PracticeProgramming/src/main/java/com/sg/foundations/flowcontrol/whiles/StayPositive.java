/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.whiles;

/**
 *
 * @author rachelvickerman
 */
public class StayPositive {
    
    public static void main(String[] args) {
        int start = 10;
        System.out.println("Counting down...");
        while (start >= 0) {
            System.out.println(start);
            start = start-1;
        }
        System.out.println("Blast off!");
    }
}
