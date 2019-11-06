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
public class Armstrong {
    
    private int inputNumber;
    private int x =  0;
    private int y = 0;
    private int help = 0;
    int ss = 1;
    int number = 371, originalNumber, remainder, result = 0;
    
    public void run(){
        System.out.println(" Armstrong number (solution) A number is called an Armstrong number if it is equal to the cube of its every digit. "
                + "\nFor example, 153 is an Armstrong number because of 153= 1+ 125+27, which is equal to 1^3+5^3+3^3. "
                + "\nYou need to write a program to check if the given number is Armstrong number or not.");
        System.out.println("Please give me a number:");
        Scanner input = new Scanner(System.in);
        inputNumber = input.nextInt();
        
        /*
        int helpnumber = inputNumber;
        while(helpnumber >= 0){
            
        } 
        */
        
       
        /*
        do {
        x = inputNumber%(10*ss);
        System.out.println(x);
        y = inputNumber/(10*ss);
        System.out.println(y);
        help = x * x * x;
        System.out.println(help);
        ss*=10;
        } while (y>0);
        */
        
        System.out.println("Your number : "+inputNumber);
        originalNumber = inputNumber;
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if(result == inputNumber)
            System.out.println(inputNumber + " is an Armstrong number.");
        else
            System.out.println(inputNumber + " is not an Armstrong number.");
        
    }
    
    
    
}
