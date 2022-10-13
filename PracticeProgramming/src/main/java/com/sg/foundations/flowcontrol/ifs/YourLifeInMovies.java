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
public class YourLifeInMovies {
    
    public static void main(String[] args) {
        
        
        String stringborn;
        int born;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Hey, what's your birthyear?");
        stringborn = input.nextLine();
        born = Integer.parseInt(stringborn);
        
        if (born < 2005) {
            System.out.println("Pixar's 'Up' came out over a decade ago");
        }
        else if (born < 1995) {
            System.out.println("the first Harry Potter came out over 15 years ago");
        }
        else if (born < 1985) {
            System.out.println("Space Jam came out not last decade, but the one before THAT");
        }
        else if (born == 1980) {
            System.out.println("Pixar's 'Up' came out over a decade ago, he first Harry Potter came out over 15 years ago AND Space Jam came out not last decade, but the one before THAT");
        }
        else if (born < 1965) {
            System.out.println( "the MASH TV series has been around for almost half a century!");
        }
    }
 
}
