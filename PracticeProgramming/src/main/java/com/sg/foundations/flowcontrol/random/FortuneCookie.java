/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.random;
import java.util.Random;
/**
 *
 * @author rachelvickerman
 */
public class FortuneCookie {
    
    public static void main(String[] args) {
        
        Random r = new Random();
        
        String a = "Those aren't the droids you're looking for.";
        String b = "Never go in against a Sicilian when death is on the line!";
        String c = "Goonies never say die.";
        String d = "With great power, there must also come — great responsibility." ;
        String e = "You are a leaf on the wind, watch how you soar.";
        String f = "Do absolutely nothing, and it will be everything that you thought it could be." ;
        
        String[] fortunes = {a,b,c,d,e,f};
        int cookie = r.nextInt(5)+1;
        
        System.out.println(fortunes[cookie]);
        
    }
}
