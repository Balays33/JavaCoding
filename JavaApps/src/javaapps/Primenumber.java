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
public class Primenumber {
    private int inputNumber;
    private int testNumber;
    private int divNumber;
    
    public void run(){
        testNumber=0;
        System.out.println("Write a Java program to check if a given number is prime or not. "
                +"\n" +"Remember, a prime number is a number which is not divisible by any other number, "
                +"\n" + "e.g. 3, 5, 7, 11, 13, 17, etc. Be prepared for cross, e.g. checking till the square root of a number, etc.\n");
        
        System.out.println("");
        System.out.println(" Please give a number :");
        Scanner input = new Scanner(System.in);
        inputNumber = input.nextInt();
        //divNumber = inputNumber % 2;
        //System.out.println(divNumber);
        
        
        for(int i = 1 ; i < inputNumber ; i++){
            divNumber = inputNumber % i;
           // System.out.println(divNumber);
            if (divNumber == 0){
                testNumber++;
            }
        }
        System.out.println("test number:"+testNumber);
        if (testNumber < 3){
            System.out.println("This is prime number");
        } else System.out.println("This is NOT prime number");
        
        
    }
    
}
