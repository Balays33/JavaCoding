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
        Avoidingdeadlock avoidingdeadlock = new Avoidingdeadlock();
        SmallestPositiveInteger  smallestpositiveinteger = new SmallestPositiveInteger();
        BinaryGap binaryGap = new BinaryGap();
        OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
        CyclicRotation cyclicRotation =  new CyclicRotation();
        Help help = new Help();
        
        
        
        
        
        do {
            System.out.println("\n Please choose which program would you like to run :");
            System.out.println("666: Help test menu");
            System.out.println("1: Fibonacci series");    
            System.out.println("2: A prime number");
            System.out.println("3: Palindrome");
            System.out.println("4: Integer Palindrome");
            System.out.println("5: Armstrong number");
            System.out.println("6: Avoiding deadlock");
            System.out.println("51: Smallest Positive Integer");
            System.out.println("52: BinaryGap");
            System.out.println("53: OddOccurrencesInArray");
            System.out.println("54: CyclicRotation");
            
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
                        case 6:
                            avoidingdeadlock.run();
                            break;
                        case 51:
                            int[] A = new int[]{1, 3, 6, 4, 1, 2};
                            //int[] B = new int[]{1, 2, 3};
                            //int[] C = new int[]{-1, -3};
                            //int[] D = new int[]{-1, -3, 2, 4, 1, 2,5,7,8,11,14,13};
                            smallestpositiveinteger.solution(A);
                            //smallestpositiveinteger.solution(B);
                            //smallestpositiveinteger.solution(C);
                            //smallestpositiveinteger.solution(D);
                            //smallestpositiveinteger.sort();
                            break;
                        case 52:
                            System.out.println("Please give a integer number:");
                            Scanner s = new Scanner(System.in);
                            int number = s.nextInt();
                            binaryGap.solution(number);
                            break;
                        case 53:
                            int[] oia = new int[]{9, 3, 9, 3, 9, 7, 9};
                            //int[] oia = new int[]{3, 4, 4, 7, 9, 7, 9};
                            oddOccurrencesInArray.solution(oia);;
                            break;
                        case 54:
                            int[] cr1 = new int[]{3, 8, 9, 7, 6};
                            int  k = 3;
                            //int[] cr1 = new int[]{1, 2, 3, 4};
                            //int  k = 4;
                            cyclicRotation.solution(cr1,k);;
                            break;
                        case 666:
                            help.run();
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
