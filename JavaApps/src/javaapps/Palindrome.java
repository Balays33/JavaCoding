/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapps;

import java.util.Scanner;

/**
 
 * @author barcz
 */


public class Palindrome{
    
       public void run(){
                    String original, reverse = ""; // Objects of String class  
                    Scanner in = new Scanner(System.in);   
                    System.out.println("Enter a string/number to check if it is a palindrome");  
                    original = in.nextLine();   
                    int length = original.length();   
                    for ( int i = length - 1; i >= 0; i-- )  
                       reverse = reverse + original.charAt(i);  
                    if (original.equals(reverse))  
                       System.out.println("Entered string/number is a palindrome.");  
                    else  
                       System.out.println("Entered string/number isn't a palindrome.");  
                  }

}
/*
public class Palindrome {
    private String userInputString;
    private char[] chars;
    private char[] reverseChars;
    private String reverseString;
    private boolean b = false;
   
    
    public void run(){
        System.out.println(" This simple Java program  check if a given String is palindrome or not.");
        System.out.println("Please give a string :");
        Scanner input = new Scanner(System.in);
        userInputString =  input.nextLine();
        chars = userInputString.toCharArray();
        int le = chars.length;
        
        for (int i = chars.length-1; i >= 0 ; i--){
            
          reverseString += chars[i];
        //System.out.print(chars[i]);
       
        }
        System.out.println();
        //System.out.println(reverseString);
        check(userInputString,reverseString);
    }
    
    private void check(String userInputString,String reverseString){
        
        char[] userinputCC = userInputString.toCharArray();
        char[] reverseCC = reverseString.toCharArray();
        System.out.println(userinputCC);
        System.out.println(reverseCC);
        System.out.println(userinputCC.length);
        System.out.println(reverseCC.length);
        for (int i = 0 ; i <userInputString.length(); i++){
            if (userinputCC.equals(reverseCC)) {
                System.out.println("Hello");
            } 
            } 
        }

    }
   */ 

