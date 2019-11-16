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
    
    private int permutationIndex =0;
    private int smallNumber;
    private int includeNumber;
    private int runLoopNumber =0;
    private boolean foundTheMissingN = false;
    
    public int solution(int[] A){
        
        //runLoopNumber 
        
        for(int i = 0; i<A.length; i++){
            System.out.print(" "+A[i]);
        }
        
        // find the smallest integer number
        smallNumber = A[0];
         for(int i = 1; i<A.length; i++){
             if (smallNumber >= A[i]){
                        smallNumber = A[i];
                }
         }
         
        System.out.print(" smallest number:"+smallNumber);
        
        includeNumber = smallNumber;
        do {
        for(int i = 0; i<A.length; i++){
           if (includeNumber == A[i]){
                permutationIndex =1;
                 //System.out.print(" I found the number"+ A[i]);
           } 
           
           
            
        }
        if (permutationIndex == 0){
                foundTheMissingN = true;
                System.out.println("I do Not found the number:" +includeNumber);
        } 
        runLoopNumber++;
        if (runLoopNumber < A.length){
            permutationIndex = 0;
        }
        System.out.print(" runLoopNumber:"+runLoopNumber);
        includeNumber++;
        
        } while ( (foundTheMissingN != true) && (runLoopNumber < A.length));
        
        System.out.print("\n The goal is to check whether array A is a permutation 1- yes 0 -no : "+permutationIndex);
        
        return permutationIndex;
    }
    
}
