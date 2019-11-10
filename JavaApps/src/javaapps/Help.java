/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapps;

import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author barcz
 */
public class Help {
    
    private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private String name;
    Random r = new Random();
    private int helpnumber;
    private char b;
    
    private  String carC[] = {"a","b","c","d","e","f","g","h","i","j","k"};
    
    public void run(){
        helpnumber =  r.nextInt();
         int rndCharAt = r.nextInt(CHAR_LOWER.length());
        b = CHAR_LOWER.charAt(rndCharAt);
        name += b;
        System.out.println(name);
        
        name = carC[r.nextInt(carC.length)];
        System.out.println(name);
    
    }
    
}
