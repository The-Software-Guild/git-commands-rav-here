/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.arrays;

import java.util.Arrays;

/**
 *
 * @author rachelvickerman
 */
public class FruitSalad {
    
    public static void main(String[] args) {
        
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

        String[] fruitSalad = new String[12];
        //System.out.println(Arrays.toString(fruitSalad));
        int apples = 0; 
        int oranges = 0;
        
        for (int i=0; i < fruitSalad.length; i++) {
            
            do { 
                if (fruit[i].contains("berry")) {
                    fruitSalad[i] = fruit[i];
                }
                else if (fruit[i].contains("Apple")) {
                    if (apples < 2) {
                        fruitSalad[i] = fruit[i];
                        apples += 1;  
                    }  
                }
                else if (fruit[i].contains("Orange")) {
                    if (oranges < 2) { 
                        fruitSalad[i] = fruit[i];
                        oranges += 1;
                    }      
                }
                else if (!fruit[i].contains("Tomato")) {
                    fruitSalad[i] = fruit[i];
                }
                //System.out.println(Arrays.toString(fruitSalad));
           
            } while (fruitSalad.length < 12);
        
        }
        System.out.println("My fruit salad contains " + Arrays.toString(fruitSalad));
    }
    
}
