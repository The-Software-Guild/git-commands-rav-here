/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package rv_mthree.windowmaster;
import java.util.Scanner;  // Import the Scanner class


/**
 *
 * @author rachelvickerman
 */
public class WindowMaster {

    public static void main(String[] args) {
        // declaring variables 
        float height;
        float width;
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        // declare variables to hold input 
        String stringHeight;
        String stringWidth;
        
        // getting input 
        // initialise scanner 
        Scanner myScanner = new Scanner(System.in);
        // receiving and storing inputs 
        System.out.println("Enter the window height:");
        stringHeight = myScanner.nextLine();
        System.out.println("Enter window width:");
        stringWidth = myScanner.nextLine();
        
        // converting the inputs from string to float type
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        
        // calculate window area (as standard)
        areaOfWindow = height * width;
        
        // calculate window perimeter (as standard)
        perimeterOfWindow = 2 * (height+width);
        
        // calculate the window cost (where 3.5f is the unit cost of window area)
        cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));
        
        // display results
        System.out.println("window height = " + stringHeight);
        System.out.println("window width = " + stringWidth);
        System.out.println("window area = " +areaOfWindow);
        System.out.println("window perimeter = " + perimeterOfWindow);
        System.out.println("total cost = " + cost);
        
        
        
    }
}
