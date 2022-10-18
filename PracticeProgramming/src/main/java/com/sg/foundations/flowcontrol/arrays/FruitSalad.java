/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.arrays;

//import java.util.Arrays;
import java.util.ArrayList;

/**
 *
 * @author rachelvickerman
 */
public class FruitSalad {
    
    public static void main(String[] args) {
        
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};
        ArrayList<String> fruitSalad = new ArrayList<>();
        //String[] fruitSalad = new String[12];
        //System.out.println(Arrays.toString(fruitSalad));
        int apples = 0; 
        int oranges = 0;
        int i = 0;
        
        while(fruitSalad.size() < 12) { 

            if (fruit[i].contains("berry")) {
                fruitSalad.add(fruit[i]);
                i += 1;
            }
            else if (fruit[i].contains("Apple")) {
                if (apples < 2) {
                    fruitSalad.add(fruit[i]);
                    apples += 1; 
                    i += 1;
                }
                else {
                    i += 1;
                }
            }
            else if (fruit[i].contains("Orange")) {
                if (oranges < 2) { 
                    fruitSalad.add(fruit[i]);
                    oranges += 1;
                    i += 1;
                }
                else {
                    i += 1;
                }
            }
            else if (!fruit[i].contains("Tomato")) {
                fruitSalad.add(fruit[i]);
                i += 1;
            }
            else {
                i += 1;
            }

        } 

        System.out.println("My fruit salad contains " + fruitSalad);
    }
    
}
