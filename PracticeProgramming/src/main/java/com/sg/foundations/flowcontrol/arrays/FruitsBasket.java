/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.arrays;

/**
 *
 * @author rachelvickerman
 */
public class FruitsBasket {
    public static void main(String[] args) {
        String[] fruitBasket = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple",
            "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple",
            "Orange", "Orange", "Apple", "Apple", "Apple", "Banana", "Apple", "Orange",
            "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple",
            "Apple", "Apple", "Apple", "Orange", "Orange", "PawPaw", "Apple", "Orange",
            "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Apple", "Kiwi", "Orange", "Apple", "Orange",
            "Dragonfruit", "Apple", "Orange", "Orange"};

        int numOranges = 0;
        int numApples = 0;
        int numOtherFruit = 0;
        

        for (int i=0; i < fruitBasket.length; i++){
            if (fruitBasket[i].equals( "Orange")) {
                numOranges += 1;
            }
            else if (fruitBasket[i].equals("Apple")) {
                numApples += 1;
            }
            else {
                numOtherFruit += 1;
            }
        }
        int basket = numOranges + numApples + numOtherFruit;
        System.out.println("Total no. fruit in the basket: " + basket);
        System.out.println("Number of apples: " + numApples);
        System.out.println("Number of oranges: " + numOranges);
        System.out.println("Number of other fruit: " + numOtherFruit);
        

        // Print The Results!
    }
    
}
