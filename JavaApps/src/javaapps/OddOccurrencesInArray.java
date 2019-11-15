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
public class OddOccurrencesInArray {
    
   
    private int unpaired;
    
     public int solution(int[] oia){
         
         int[] getArrey = oia;
         
         for (int i = 0; i<getArrey.length; i++){
             System.out.print(" "+getArrey[i]);
         }
         
         for (int i = 0; i<getArrey.length-1; i++){
             for (int j = i+1; j<getArrey.length; j++){
                  if (getArrey[i] == getArrey[j] ){
                        getArrey[i] = 0;
                        getArrey[j] = 0;
                     } 
                 
             }
         }
         
         for (int i = 0; i<getArrey.length-1; i++){
             if (getArrey[i] != 0){
                 unpaired = getArrey[i];
             }
         }
         
         System.out.println("\n");
         for (int i = 0; i<getArrey.length; i++){
             System.out.print(" "+getArrey[i]);
         }
         
         System.out.println("\n unpaired number: "+unpaired);
         return unpaired;
     }
    
}
