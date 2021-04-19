/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapps;



/**
 *
 * @author barcz
 */
public class Help {
    
     private int result;
    
       
    
   
    
    public int solution(int N) {
        // write your code in Java SE 8
        /*
        System.out.println(N);
        int digit = 5;
        int help =0;
        int templ =N;
        
        int length = 0;
        long temp = 1;
        while (temp <= N) {
            length++;
            temp *= 10;
        }
        System.out.println("\n length"+ length);
        
        int[] arreyDigit = new int [length+1];
        
        
        String number = String.valueOf(N);
        
        char[] digits1 = number.toCharArray();
        
        //System.out.println("\n"+digits1[2] );
        
        int numberH = Integer.parseInt(new String(digits1));
        System.out.println("\n"+numberH );
        
        for(int i=0;i<arreyDigit.length;i++){
            
            //arreyDigit[i] = Integer.parseInt(new String(digits1.)); 
            
            //Integer.parseInt(String.valueOf(digits1[i]));
            //Character.getNumericValue(c)
             //arreyDigit[i] = 5*(int) Math.pow(10, i);
            //Put 5 in 1s place:      2685 == (2 * 10 * 10 * 10) + (6 * 10 * 10) + (8 * 10) + 5
            //Put 5 in 10s place:    2658 == (2 * 10 * 10 * 10) + (6 * 10 * 10) + (5 * 10) + 8
            //Put 5 in 100s place:  2568 == (2 * 10 * 10 * 10) + (5 * 10 * 10) + (6 * 10) + 8
            //Put 5 in 100s place:  5268 == (5 * 10 * 10 * 10) + (2 * 10 * 10) + (6 * 10) + 8
            
            
            
        }
        for(int i=0;i<arreyDigit.length;i++){
            System.out.println("\n"+arreyDigit[i] );
        }
        while(templ>0){
            help = templ%10;
            System.out.println("digital place"+length+" "+help );
            templ = templ/10;
            length--;
            
        }
        */
        
       
        System.out.println("\n"+ result);
        return result;
    }
    
    
}
