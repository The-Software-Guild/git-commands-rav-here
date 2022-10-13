/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.fors;

/**
 *
 * @author rachelvickerman
 */
public class ForbyFor {
    
    public static void main(String[] args) {

        for (int i = 0; i < 1; i++) {
            System.out.print("|");

            for (int j = 0; j < 1; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print("*");
                }

                System.out.print("|");
            }
            for (int j = 1; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print("$");
                }

                System.out.print("|");
            }
            for (int j = 2; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print("*");
                }

                System.out.print("|");
            }
            System.out.println("");
        }
        for (int i = 1; i < 2; i++) {
            System.out.print("|");
            
            for (int j = 0; j < 1; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print("@");
                }

                System.out.print("|");
            }
            for (int j = 1; j < 2; j++) {
                for (int k = 0; k < 1; k++) {
                    System.out.print("$");
                }
                for (int k = 1; k < 2; k++) {
                    System.out.print("%");
                }
                for (int k = 2; k < 3; k++) {
                    System.out.print("$");
                }

                
                System.out.print("|");
            }
            for (int j = 2; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print("@");
                }

                System.out.print("|");
            }
            System.out.println("");
        
            
        }
        for (int i = 2; i < 3; i++) {
            System.out.print("|");

            for (int j = 0; j < 1; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print("*");
                }

                System.out.print("|");
            }
            for (int j = 1; j < 2; j++) {
                for (int k = 0; k < 1; k++) {
                    System.out.print("$");
                }
                for (int k = 1; k < 2; k++) {
                    System.out.print("%");
                }
                for (int k = 2; k < 3; k++) {
                    System.out.print("$");
                }

                
                System.out.print("|");
            }
            for (int j = 2; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print("*");
                }

                System.out.print("|");
            }
            System.out.println("");
        }
        
    }

    
}
