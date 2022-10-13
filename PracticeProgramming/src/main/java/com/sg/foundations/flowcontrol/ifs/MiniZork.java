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
public class MiniZork {
    
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field, with one single large tree, west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, the tree or open the mailbox? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } 
                else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you're alive. Possibly a wise choice.");
                }
            } 
            else if (action.equals("stick your hand in")) { 
                System.out.println("Turns out, sticking things in unknown places isn't a good idea.");
                System.out.println("You've been eaten by a grue.");
            }
        } 
        else if (action.equals("go to the house")) { 
            
            System.out.println("You go up to the house door.");
            System.out.println("it's boarded pretty good but there's a hammer lying on the porch.");
            System.out.print("Break in or try round back? ");
            action = userInput.nextLine();

            if (action.equals("Break in")) {
                System.out.println("You pick up the hammer.");
                System.out.println("The door falls quickly, you can see the original door now.");
                System.out.print("Run away or go inside? ");
                action = userInput.nextLine();

                if (action.equals("go inside")) {
                    System.out.println("Turns out, breaking and entering is a good idea.");
                    System.out.println("You are safe.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("A grue hears you, and eats you.");
                }
            } 
            else if (action.equals("try round back")) { 
                System.out.println("Turns out to be a good idea.");
                System.out.println("You've gained entry to the house and are safe.");
            }
        }
        
        else {
            System.out.println("You approach the tree.");
            System.out.println("It's really tall but is climable.");
            System.out.print("Climb or try elsewhere? ");
            action = userInput.nextLine();

            if (action.equals("Climb")) {
                System.out.println("You begin to scale the tree.");
                System.out.println("It's really tall, very very tall.");
                System.out.print("Kepp climbing?");
                action = userInput.nextLine();

                if (action.equals("yes")) {
                    System.out.println("Turns out, hanging out in trees is a good idea.");
                    System.out.println("You're safe.");
                }
                else if (action.equals("no")) {
                    System.out.println("You jump down and a grue has been waiting for you.");
                    System.out.println("You have been eaten.");
                }   
            }

        } 
    }
}
