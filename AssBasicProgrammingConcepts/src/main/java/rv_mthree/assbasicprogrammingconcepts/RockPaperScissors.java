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
public class RockPaperScissors {
    
    public static void main(String[] args) {
        // ask player how many rounds
        System.out.println("Let's play Rock, Paper, Scissors!");
        // initialise scanner
        Scanner inputReader = new Scanner(System.in);
        
        do {
            System.out.println("How many rounds do you want to play?");
            
            // get user input
            String stRounds = inputReader.nextLine();
            // convert input to integer
            int Rounds = Integer.parseInt(stRounds);

            // start game
            System.out.println("Let's go!");
        
        
            int Ties = 0;
            int userWin = 0;
            int compWin = 0;

            // for loop for game
            for (int i=1; i<Rounds+1; i++) {
                // get players choice
                System.out.println("Choose a number: 1.Rock, 2.Paper, or 3.Scissors?");
                String choice = inputReader.nextLine();
                int userChoice = Integer.parseInt(choice);

                // load random computer choice for game
                Random r = new Random();
                int comChoice = r.nextInt(3)+1;
                System.out.println("I've chosen " + comChoice);
                // determine variable to aid results calculation
                int R = comChoice - userChoice;

                // result of tie
                if (R == 0) {
                    System.out.println("Round " + i + " Tie.");
                    Ties += 1;
                }
                // result of rock vs paper
                else if (R == 1) {
                    System.out.println("Round " + i + " the computer wins.");
                    compWin += 1;
                }
                else {
                    System.out.println("Round " + i + " you win.");
                    userWin += 1;
                }

            }
            System.out.println("Game over! and the results are...");
            System.out.println("Ties: " + Ties + ", User wins: " + userWin + ", Computer wins: " + compWin);
            System.out.println("So the winner is...");
            // determine winner 
            if (compWin > userWin) {
                System.out.println("The computer, haha!");
            }

            else if (compWin < userWin) {
                System.out.println("You! Lucky...");
            }
            else { 
                System.out.println("No one!");
            }
            // play again?
            System.out.println("That was fun! Want to play again?");
            
        }    
        while ((inputReader.nextLine()).equals("Yes"));
    
// goodbye message
    System.out.println("Thanks for playing!");

    }
}
