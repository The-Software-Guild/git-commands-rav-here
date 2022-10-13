/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.methods;
import java.util.Random;
/**
 *
 * @author rachelvickerman
 */
public class BarelyControlledChaos {
    
    public static void main(String[] args) {

        String colour = colour("red","blue","green","yellow","pink"); // call color method here
        String animal = animal("cat","dog","bear","lion","monkey"); // call animal method again here
        String colourAgain = colour("red","blue","green","yellow","pink"); // call color method again here
        int weight = number(5,200); // call number method,
            // with a range between 5 - 200
        int distance = number(10,20); // call number method,
            // with a range between 10 - 20
        int number = number(10000,20000); // call number method,
            // with a range between 10000 - 20000
        int time = number(2,6); // call number method,
            // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + colour + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colourAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }

    public static int number(int a, int b){
        Random ran = new Random();
        int randomNum = ran.nextInt(a,b);
        return randomNum;
    }
    
    public static String colour(String a,String b, String c, String d, String e){
        String[] colours = new String[] {a, b, c, d, e};
        Random r = new Random();
        int rcol = r.nextInt(colours.length);
        String col = colours[rcol];
        return col;
    }
    
    public static String animal(String a,String b, String c, String d, String e){
        String[] animals = new String[] {a, b, c, d, e};
        Random r = new Random();
        int ran = r.nextInt(animals.length);
        String an = animals[ran];
        return an;
    }

}
