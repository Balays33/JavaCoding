/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapps;

import java.util.ArrayList;
import java.util.Collections;  

/**
 *
 * @author barcz
 */
public class CountSemiprimes {
    
    private int[] result;
    private int osztas;
    private ArrayList<Integer> prime = new ArrayList<Integer>();
    private ArrayList<Integer> semiprime = new ArrayList<Integer>();
    private int help;
    
     public int[] solution(int N, int[] P, int[] Q){
         
         
         result = new int[P.length];
         System.out.println("\n N:"+N);
         
         for (int i = 0;i<P.length;i++){
             System.out.print(" "+P[i]);
         }
         System.out.println("\n N:");
         for (int i = 0;i<Q.length;i++){
             System.out.print(" "+Q[i]);
         }
         
         // prime number
         //System.out.println("\n prime:" +2%2);
         
         System.out.println("\n prime number:");
         for (int i = 2;i<100;i++){
             osztas = 0;
             for (int j = 1;j<i+1;j++){
                 //System.out.print(" "+i%j);
             if (i%j==0){
                 osztas++;
                 //System.out.print(" "+osztas);
             }
             }
             if(osztas ==2 ){
                 System.out.print(" "+i);
                 prime.add(i);
                 
             }
         }
         // ArrayList prime create
         System.out.println("\n prime number:");
         for (int i = 0; i<prime.size();i++){
             System.out.print(" "+prime.get(i));
         }
         //Arraylist semiprime
        System.out.println("\n semiprime number:");
        for(int i =0;i<prime.size();i++){
            for (int j = 0;j<i+1;j++){
                semiprime.add(prime.get(i)*prime.get(j));
                System.out.print(" "+prime.get(i)*prime.get(j));
            }
        }
        
        //SORT Arraylist semiprime
        System.out.println("\n SORT semiprime number:");
        Collections.sort(semiprime);
        for (int i=0;i<semiprime.size();i++){
            System.out.print(" "+semiprime.get(i));
        }
        
        for (int i =0;i<result.length;i++){
            help=0;
            for (int j = P[i];j<Q[i]+1;j++){
              for (int x =0;x<semiprime.size();x++){
                  if (semiprime.get(x).equals(j)){
                      help++;
                  }
              }  
            }
            result[i]=help;
        } 
     
        System.out.println("\n ");
        for (int i =0;i<result.length;i++){
            System.out.print(" "+result[i]);
        }
     return result;    
     }
    
}
