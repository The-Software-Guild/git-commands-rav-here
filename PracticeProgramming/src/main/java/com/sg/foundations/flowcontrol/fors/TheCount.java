/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.fors;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author rachelvickerman
 */
public class TheCount {
    
    public static void main(String[] args) {
        
        System.out.println("*** I LOVE THE COUNT! LET ME SHARE MY COUNTING WITH YOU! ***");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Start at: ");
        String stStart = input.nextLine();
        int start = Integer.parseInt(stStart);
        
        System.out.println("End at: ");
        String stEnd = input.nextLine();
        int end = Integer.parseInt(stEnd);
        
        System.out.println("Count by: ");
        String stC = input.nextLine();
        int count = Integer.parseInt(stC);
        
        ArrayList<Integer> seq = new ArrayList<Integer>();
        
        for (int i=start; i < end+1; i+=count) {
            int step = i;
            if (step > end) {
                break;
            }
            else {
                seq.add(step);
            }
                    
        }
        System.out.println(seq);

        
    }
    
    
    
}
