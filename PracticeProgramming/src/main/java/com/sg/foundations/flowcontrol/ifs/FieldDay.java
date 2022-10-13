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
public class FieldDay {
    
    public static void main(String[] args) {

    
        String RD = "Red Dragons";
        String DW = "Dark Wizards";
        String MC = "Moving Castles";
        String GS = "Golden Snitches";
        String NG = "Night Guards";
        String BH = "Black Holes";

        String p1 = "Baggins";
        String p2 = "Dresden";
        String p3 = "Howl";
        String p4 = "Potter";
        String p5 = "Vimes";

        String LastName;

        Scanner input = new Scanner(System.in);

        System.out.println("Hey, what's your name?");
        LastName = input.nextLine();
        System.out.println(LastName.compareTo(p1));
        
        if (LastName.compareTo(p1) < 0) {
            System.out.println("Aha! You're on the team " + RD + " Good luck in the games!");
        }
        else if (LastName.compareTo(p1) > 0 && LastName.compareTo(p2) < 0) {
            System.out.println("Aha! You're on the team " + DW + " Good luck in the games!");
        }
        else if (LastName.compareTo(p2) > 0 && LastName.compareTo(p3) < 0) {
            System.out.println("Aha! You're on the team " + MC + " Good luck in the games!");
        }
        else if (LastName.compareTo(p3) > 0 && LastName.compareTo(p4) < 0) {
            System.out.println("Aha! You're on the team " + GS + " Good luck in the games!");
        }
        else if (LastName.compareTo(p4) > 0 && LastName.compareTo(p5) < 0) {
            System.out.println("Aha! You're on the team " + NG + " Good luck in the games!");
        }
        else {
            System.out.println("Aha! You're on the team " + BH + " Good luck in the games!");
        }
    }
}
