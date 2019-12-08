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
public class Fish {
    
    private int result=1;
    private int startN;
    
    public int solution(int[] A, int[] B){
        
        for (int i=0;i<A.length;i++){
            System.out.print(" "+A[i]);
        }
        System.out.println("\n ");
        
         for (int i=0;i<B.length;i++){
            System.out.print(" "+B[i]);
        }
        
         for (int i = 0;i<A.length-1;i++){
             for (int j = i+1;j<A.length;j++){
                if ((B[i] != B[j]) && (B[i] != 0 ) && (A[j] != 0)){
                    if (A[j] > A[i]){
                        A[i]=0;
                    } else {
                        A[j]=0;
                    }
                    
                }
                
             }
         
         }
         
        /* 
         for (int i=0;i<A.length-1;i++){
             for(int j=i+1;j<B.length-1;j++){
                 if (B[j]!=B[j+1]){
                     if (A[j] < A[j+1]){
                         A[j] =0;
                     } else {
                         A[j+1] = 0;
                     }
                 }
             }
        }
        */
         System.out.println("\n ");
        for (int i=0;i<A.length;i++){
            System.out.print(" "+A[i]);
        }
    
    return result;
    }
}
