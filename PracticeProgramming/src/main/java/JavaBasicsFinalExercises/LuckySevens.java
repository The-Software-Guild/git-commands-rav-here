/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaBasicsFinalExercises;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author rachelvickerman
 */
public class LuckySevens {
    
    public static void main(String[] args) {
        
        // initialise variables
        String stBet;
        int Bet;
        
        // initialise scanner and random
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        
        // ask for input
        System.out.println("How many pounds do you have to bet?");
        // store and convert input to integer
        stBet = input.nextLine();
        Bet = Integer.parseInt(stBet);
        
        int rolls = 0;
        int[] maxAmount = new int[2];
        
        
        while (Bet > 0) {
            
            int dice1 = r.nextInt(6)+1;
            int dice2 = r.nextInt(6)+1;
            
            int sum = dice1 + dice2;
            
            if (sum == 7) {
                Bet += 4;
            } 
            else {
                Bet -= 1;
            }
            
            rolls += 1;
            
            if (maxAmount[0] < Bet) {
                maxAmount[0] = Bet;
                maxAmount[1] = rolls;
            }
   
        }
        
        System.out.println("You are broke after " + rolls + " rolls");
        System.out.println("You should have quit after " + maxAmount[1] + " rolls when you had £" + maxAmount[0]);    
    }
    
}
