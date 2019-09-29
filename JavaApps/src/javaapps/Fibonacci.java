/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapps;

import java.util.Scanner;

/**
 *
 * @author barcz
 */
public class Fibonacci {
    
    private int lnumber;
    private int fnumber = 1;
    private int nextnumber;
    private int addnumber = 1;
    private int exitloop=0;
    public void runF(){
        System.out.println("Fibonacci series, e.g. 1 1 2 3 5 8 13 ... . up to a given number");
        do {
        Scanner getnumber = new Scanner(System.in);
        System.out.println("Please give the last number max 50 :");
        
                lnumber = getnumber.nextInt();
                exitloop = 1;
                
       
        }while((lnumber >50));
        System.out.println("your number:"+lnumber);
        System.out.println("");
        for (int i= 0 ; i<(lnumber-2); i++){
            if (i == 0) {
                System.out.print("1 "+fnumber);
                        }
            nextnumber = fnumber + addnumber;
            System.out.print(" "+nextnumber);
            addnumber = fnumber;
            fnumber = nextnumber;
        }
        
    }
    
}
