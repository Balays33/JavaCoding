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
public class MaxProductOfThree {
    
    private int maxThreeN =0;
    private int temp3Number;
    
    
    public int solution(int[] A){
        
        for (int i = 0; i<A.length; i++){
            System.out.print(" "+A[i]);
        }
        
        // A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N).
        for (int p = 0; p < A.length - 2; p++) {
            for (int q = 0; q < A.length; q++) {
                for (int r = 0; r < A.length; r++) {
                    if ((p < q) && (q < r)) {
                        temp3Number = A[p] * A[q] * A[r];
                        //System.out.println(" " + temp3Number);
                        if (maxThreeN<temp3Number){
                            maxThreeN= temp3Number;
                        }
                    }

                }

            }
        }
    
        
        
    System.out.println("Max Product Of Three " + maxThreeN);
    return maxThreeN;
    }
    
}
