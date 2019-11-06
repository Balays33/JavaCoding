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
public class JavaApps {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int menuNumber;
        Fibonacci fibonacci = new Fibonacci();
        Primenumber primenumber = new Primenumber();
        Palindrome palindrome = new Palindrome();
        Armstrong armstrong = new Armstrong();
        
        do {
            System.out.println("Please choose which program would you like to run :");
            System.out.println("1: Fibonacci series");    
            System.out.println("2: A prime number");
            System.out.println("3: Palindrome");
            System.out.println("4: Integer Palindrome");
            System.out.println("5: Armstrong number");
            System.out.println("0: EXIT");
                Scanner input =  new Scanner(System.in);
                if (input.hasNextInt()) {
                    menuNumber = input.nextInt();
                    
                    switch (menuNumber) {
                        case 1:
                            fibonacci.runF();
                            break;
                        case 2:
                            primenumber.run();
                            break;
                        case 3:
                            palindrome.run();
                            break;
                        case 4:
                            palindrome.run();
                            break;
                        case 5:
                            armstrong.run();
                            break;
                        default:
                            System.exit(0);
                    }
                     
                     
                } else {
                    break;
                }
                
        } while (menuNumber!=0);
        
       
                
    }
    
}
