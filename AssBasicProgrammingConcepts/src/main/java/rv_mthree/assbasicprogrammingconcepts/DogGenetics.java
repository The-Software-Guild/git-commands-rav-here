/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rv_mthree.assbasicprogrammingconcepts;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author rachelvickerman
 */
public class DogGenetics {
    
    public static void main(String[] args) {
        // ask dogs name
        System.out.println("What is your dog's name?");
        
        // initialise scanner
        Scanner inputReader = new Scanner(System.in);
        // record input
        String Name = inputReader.nextLine();
        
        // reply beginning message
        System.out.println("Well then, I have this highly reliable report on " + Name + " background right here.");
        
        // generate random values for percentages 
        Random r = new Random();
        int a = r.nextInt(100);
        int bound1 = 100-a; // calculating bounds to make sure they add to 100
        int b = r.nextInt(bound1);
        int bound2 = 100-a-b;
        int c = r.nextInt(bound2);
        int bound3 = 100-a-b-c;
        int d = r.nextInt(bound3);
        int e = 100-a-b-c-d; // finding final percentage
        
        // print results 
        System.out.println(a +"% St.Bernard");
        System.out.println(b +"% Chihauhau");
        System.out.println(c +"% Dramatic Rednosed Asian Pug");
        System.out.println(d +"% Common Cur");
        System.out.println(e +"% King Doberman");
        System.out.println("Thats quite the dog!");
        System.out.println(a+b+c+d+e +"% awesome!");
    }
    
}
