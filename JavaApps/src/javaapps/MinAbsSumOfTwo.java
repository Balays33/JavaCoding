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
public class MinAbsSumOfTwo {
    
    private int result;
    private int minAbsSumN;
    private int AbsSumN;
    
    public int solution(int[] A){
        
        for(int i =0; i<A.length;i++){
            System.out.print(" "+A[i]);
        }
        
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                AbsSumN = Math.abs(A[i]+A[j]);
                System.out.println(" "+AbsSumN);
                if(i==0 && j==0){
                    minAbsSumN = AbsSumN;
                }
                if (AbsSumN<minAbsSumN){
                    minAbsSumN = AbsSumN;
                }
            }
        
        }
    
        result = minAbsSumN;
        System.out.println("returns the minimal abs sum of two for any pair of indices in this array"+result);
        return result;
    }
}
