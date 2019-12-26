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
public class CountNonDivisible {
    
    private int[] result;
    private int help;
    
     public int[] solution(int[] A){
         
         result = new int[A.length];
         
         for (int i = 0;i<A.length;i++){
             System.out.print(" "+A[i]);
         }
         System.out.println(" ");
        
             for (int j =0; j<A.length;j++){
                 help=0;
                 for (int z =0; z<A.length;z++){
                     //System.out.println(" "+A[j]%A[z]);
                     if ((A[j]%A[z]!=0) && A[j]!=A[z]){
                         help++;
                         System.out.print(" "+A[z]);
                     }
                 }
                 result[j]=help;
                 System.out.println(" ");
             }
         
     System.out.println(" ");    
     for (int i = 0;i<result.length;i++){
             System.out.print(" "+result[i]);
         }
     return result;
     }
    
}
