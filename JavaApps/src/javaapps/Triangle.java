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
public class Triangle {
    
    
    int temp;
    boolean is_sorted;
    private int returnN =0;
    
    public int solution(int[] A){
        
        //A[P] + A[Q] > A[R],
        //A[Q] + A[R] > A[P],
        //A[R] + A[P] > A[Q].
        //triangular if 0 ≤ P < Q < R < N
        //A[0] = 10    A[1] = 2    A[2] = 5  A[3] = 1     A[4] = 8    A[5] = 20
        
        for (int i = 0; i<A.length;i++){
            System.out.print(" "+A[i]);
            }
        
        //booble sort
        for (int i =0; i<A.length-1; i++){
             is_sorted = true;
            for (int j =1; j<(A.length-i); j++){
                 if (A[j - 1] > A[j]) {
                    temp = A[j - 1];
                    A[j - 1] = A[j];
                    A[j] = temp;
                    is_sorted = false;
                }
            }
        }
        System.out.println(" ");
         for (int i = 0; i<A.length;i++){
            System.out.print(" "+A[i]);
            }
         
         // triangular loop
         for (int i =0; i<A.length-2; i++){
             for (int  j=i+1; j<A.length-1; j++){
                 for (int k =j+1; k<A.length; k++){
                     
                     if ((A[i]< A[j]+A[k]) && (A[j]< A[i]+A[k]) && (A[k]< A[j]+A[i])){
                         System.out.print("\n YES");
                         returnN =1;
                         System.out.print("triangular numbers: "+A[i]+" "+A[j]+" "+A[k]);
                     }
                     
                 }

             }
             
         }
         
   
        
    System.out.println("\n triangular triplet : "+returnN);
    return returnN;
    }
    
}
