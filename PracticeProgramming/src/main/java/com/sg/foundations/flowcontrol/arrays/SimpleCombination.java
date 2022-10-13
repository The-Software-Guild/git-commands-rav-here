/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.arrays;

/**
 *
 * @author rachelvickerman
 */
public class SimpleCombination {
    
    public static void main(String[] args) {
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 35, 45, 47, 49}; // 12 numbers
        int[] secondHalf = {51, 54, 68, 71, 75, 78, 82, 84, 85, 89, 91, 100}; // also 12!

        int[] wholeNumbers = new int[24];


        int[] newArray = new int[firstHalf.length + secondHalf.length];
        for (int i=0; i < firstHalf.length; i++) {
            
            newArray[i] = firstHalf[i];
            System.out.print(newArray[i]);
        }
        for (int j=12; j < secondHalf.length; j++) {
            
            newArray[j] = secondHalf[j];
            System.out.print(newArray[j]);
        }
      

    }
    
}
