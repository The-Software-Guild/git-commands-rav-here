/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaBasicsFinalExercises;
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;
/**
 *
 * @author rachelvickerman
 */
public class InterestCalculator {
    
    // decimal places/rounding setup
    private static final DecimalFormat df = new DecimalFormat("0.00");

    
    public static void main(String[] args) {
        
        // initialise scanner
        Scanner input = new Scanner(System.in);
        
        // ask and store input for principal 
        System.out.println("What's the initial principal amount, how much do you want to invest? ");
        String stPA = input.nextLine();
        double PA = Integer.parseInt(stPA);
        
        // ask and store input for interest rate
        System.out.println("Please provide the value of annual interest rate. ");
        String stIR = input.nextLine();
        double IR = Integer.parseInt(stIR);
        
        // ask and store input for years
        System.out.println("How many years will the money stay in the fund? ");
        String stY = input.nextLine();
        int Y = Integer.parseInt(stY);
        
        for (int i=1; i<Y+1; i++) {
            System.out.println("Year " + i);
            System.out.println("Began with £" + df.format(PA));
            
            // calculate interest earned 
            double E = 0;
            for (int j=1; j<4+1; j++) { // for each quarter
                double k = 2.5; // define fixed quarterly rate
                double newPA = PA * (1+(k/100)); // find new amount at quarter end
                E += newPA - PA; // calculate earnings for that quarter and add to E
                PA = newPA; // redefine principal
        }
            // set decimal places and print total earned in year i
            df.setRoundingMode(RoundingMode.UP);
            System.out.println("Earned £"+ df.format(E));
            
            // print principal total end of year i
            System.out.println("Ended £" + df.format(PA));
        }
        
    }
    
}
