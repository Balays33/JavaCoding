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
public class PermCheck {
    
    private int permutationIndex;
    private int smallNumber;
    private int includeNumber;
    
    public int solution(int[] A){
        
        for(int i = 0; i<A.length; i++){
            System.out.print(" "+A[i]);
        }
        
        // find the smallest integer number
        smallNumber = A[0];
        for(int i = 1; i<A.length-1; i++){
            for(int j = i+1; j<A.length; j++){
                if (smallNumber > A[i]){
                        smallNumber = A[i];
                }
            }
        }
        System.out.print(" smallest number:"+smallNumber);
        
        includeNumber = smallNumber;
        for(int i = 0; i<A.length; i++){
           if (includeNumber == A[i]){
                permutationIndex =1
           }
            
        }
        
        
        System.out.print("\n The goal is to check whether array A is a permutation 1- yes 0 -no : "+permutationIndex);
        
        return permutationIndex;
    }
    
}
