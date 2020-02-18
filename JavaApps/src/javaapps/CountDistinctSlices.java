/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapps;

import java.util.ArrayList;

/**
 *
 * @author barcz
 */
public class CountDistinctSlices {
    
    private int result;
    private ArrayList<Integer> arrayE = new ArrayList<Integer>();// Create an ArrayList object
    private int helpN =0;
    boolean copyN = true;
    int iPOld=-1;
   
    
    public int solution(int M, int[] A){
        System.out.println("All integers in array A are less than or equal to M :"+M);
        for (int i = 0; i<A.length;i++){
            System.out.println("A :"+A[i]);
        }
        for (int i = 0; i<A.length;i++){
            if (A[i]>M){
            System.out.println(" ERROR All integers in array A should be less than or equal to M");
            System.out.println("The element is :"+A[i]);
            }
        }
        
        for (int i = 0; i<A.length;i++){
            copyN = true;
            for (int j = i; j<A.length;j++){
                if (j>0 && A[j] == A[j-1]){
                    copyN =false;
                }
                
                    checkArray(A[i], A[j], i,copyN);
                
            }
        }
        
        System.out.println("\n");
        printArrayE();
    return result;
    }
    
    private void checkArray(int N,int M, int i,boolean copyN ){
        int fNumber = N*10;
        int sNumber = M;
        int ipozition = i;
        int togetherN = fNumber + sNumber;
        //boolean copyN = true;
        /*
        for (int i = 0; i<arrayE.size();i++){
            if (arrayE.get(i) == togetherN ){
                copyN = false;
            }
        }
        if (copyN){
            arrayE.add(togetherN);
        }pai
        */

        if (sNumber != helpN && copyN ){
            arrayE.add(togetherN);
            
            }
        
        helpN = sNumber;
        iPOld = ipozition;
        
    }
    
    private void printArrayE(){
        for (int i = 0; i<arrayE.size();i++){
            System.out.print(" "+arrayE.get(i));
        }
    }
    
}
