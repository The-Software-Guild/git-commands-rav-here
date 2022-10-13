/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rv_mthree.assbasicprogrammingconcepts;

import java.util.Random;

/**
 *
 * @author rachelvickerman
 */
public class SummativeSums {
    
    public static void main(String[] args) {
        
        // define arrays 
        int[] array1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] array2 = { 999, -60, -77, 14, 160, 301 };
        int[] array3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
140, 150, 160, 170, 180, 190, 200, -99 }; 
        
        // find their sum using number method
        int sum1 = number(array1);
        int sum2 = number(array2);
        int sum3 = number(array3);
        
        
        // print results 
        System.out.println("The sum of array 1 is = " + sum1);
        System.out.println("The sum of array 2 is = " + sum2);
        System.out.println("The sum of array 3 is = " + sum3);
        
        
    }
    // define method 
    public static int number(int[] array){
        // initialise sum
        int sum = 0; 
        // start loop to add each element of the array to the sum
        for (int i=0; i < array.length; i++) {
            sum += array[i];
        }
        // return final sum
        return sum;
    
    }
}
