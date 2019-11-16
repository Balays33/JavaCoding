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
public class Distinct {
    
        private int distinct = 0;
        private int helpN =0 ;
        private int[] b ;
        private boolean inArrey = false;
        
        
     public int solution(int[] A){
         
         b= new int[A.length];
         
         for (int i = 0; i<A.length; i++){
             System.out.print(" "+A[i]);
         }

        // helpN = A[0];
        //2 2 1 2 3 1   A
        //1 help
        // 2 0 0 0 0 0   b
        // helpB fasle
         
         for (int i = 0; i<A.length; i++){
             if (helpN != A[i]){
                 helpN = A[i];
                 for (int  j= 0; j<b.length; j++){
                     if (helpN == b[j]){
                            inArrey = true;
                     }
                     if ((helpN != b[j]) && (inArrey == false) && (b[j] == 0)){
                             b[j] = helpN;
                            inArrey = true;
                     }
                     if ((b[j] == 0) && (inArrey == false)){
                             b[j] = helpN;
                            inArrey = true;
                     }
                     
                 }
                 inArrey = false;
             }
         }
         
         System.out.println("\n ");
          for (int i = 0; i<b.length; i++){
             System.out.print(" "+b[i]);
         }
          
         for (int i = 0; i<b.length; i++){
             if (b[i] != 0){
                   distinct++; 
             }
         }
          
         System.out.println("\n distinct: "+distinct);
     return distinct;
     }
    
}
