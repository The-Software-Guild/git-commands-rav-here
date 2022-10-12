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
public class BirthStones {
    
    public static void main(String[] args) {

        int Input;
        String InputNumber;
    
        Scanner myScanner = new Scanner(System.in);
        // receiving and storing inputs 
        System.out.println("What month's birthstone do you want to know?");
        InputNumber = myScanner.nextLine();
        Input = Integer.parseInt(InputNumber);
        
        if(Input == 1) {
            System.out.println("January's birthstone is Garnet");
        }
        else if(Input == 2) {
            System.out.println("February's birthstone is Amethyst");
        }
        else if(Input == 3) {
            System.out.println("March's birthstone is Aquamarine");
        }
        else if(Input == 4) {
            System.out.println("April's birthstone is Diamond");
        }
        else if(Input == 5) {
            System.out.println("May's birthstone is Emerald");
        }
        else if(Input == 6) {
            System.out.println("June's birthstone is Pearl");
        }
        else if(Input == 7) {
            System.out.println("July's birthstone is Ruby");
        }
        else if(Input == 8) {
            System.out.println("August's birthstone is Peridot");
        }
        else if(Input == 9) {
            System.out.println("September's birthstone is Sapphire");
        }
        else if(Input == 10) {
            System.out.println("October's birthstone is Opal");
        }
        else if(Input == 11) {
            System.out.println("November's birthstone is Topaz");
        }
        else {
            System.out.println("December's birthstone is Turquoise");
        }
    } 
  
    
}
