/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaBasicsFinalExercises;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *
 * @author rachelvickerman
 */
public class Fact2 {
    
    public static void main(String[] args) {
        
        // initialise varibales
        String stNum;
        int Num;
        
        // ask question, initialise scanner 
        System.out.println("Give me a number bigger than 1, any number!");
        Scanner Reader = new Scanner(System.in);
        
        // take reader input and convert it to an integer
        stNum = Reader.nextLine();
        Num = Integer.parseInt(stNum);
        
        // create an array for factors list
        int[] Factors = new int[Num+1];
        
        // for every number from 1 up to the chosen number
        // check if it divides the chosen number 
        for (int i=1; i<Num+1; i++) {
            if (Num % i == 0) {
                Factors[i] = i;   // if it does add it to the factors the array  
            }
        }
        
        int countZeros = 0;

        for (int i = 0; i < Factors.length; i++) { // count nulls in array
            if (Factors[i] != 0) {
            } else {
                countZeros += 1;
            }
        }
        // creating new array with new length (length of first array - counted nulls)
        int[] newFactors = new int[Factors.length - countZeros];

        for (int i = 0, j = 0; i < Factors.length; i++) {

            if (Factors[i] != 0) {
                newFactors[j] = Factors[i];
                j += 1 ;
            }
        }
        // find the number of factors for the chosen number
        int F = newFactors.length;
        
        // print number of factors and what they are
        System.out.println("The " + F + " factors of " + Num + " are:");
        System.out.println(Arrays.toString(newFactors));
     
        // if the number of factors is 2, the number is a prime
        if (F == 2) {
            System.out.println("This number is a Prime!");  
        }
        // if not it is not prime
        else {
            System.out.println("This number is Not Prime.");
        } 
        
        // for the number of factors not the number itself
        for (int j=0; j<F-1; j++) {
            Num -= newFactors[j];  // take each factor away from the chosen number
        }
        // if the chosen number minus all its factors (besides itself) equals zero - its perfect
        if (Num == 0) {
            System.out.println("This number is Perfect!");
        }
        // if not it is not perfect
        else {
            System.out.println("This number is Not Perfect!");   
        }
    }    

    
}
