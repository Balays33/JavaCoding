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
public class MaxSliceSum {
    
    private int result;
    private int helpN;
    private float slide;
    private int remainder;
    
    public int solution(int[] A){
        
        for (int i = 0;i<A.length;i++){
            System.out.println(" "+A[i]);
        }
        
        slide = A.length/2;
        remainder =  A.length%2;
        System.out.println(" slide: "+slide+"maradek"+remainder);
        //System.out.println(A.length/2);
        /*
         for (int i = 0;i<(slide+remainder);i++){
             System.out.println("test");
              for (int j = 0;j<A.length;j++){
                  helpN = A[j]+A[j+1];
                  if (helpN > result){
                      result = helpN;
                  }
              
              }
         }
         */
        
        for (int i = 0;i<(slide+remainder);i++){
            
                helpN = A[i]+A[i+1];
                  if (helpN > result){
                      result = helpN;
                  }
                helpN = A[A.length-1-i]+A[A.length-2-i];
                  if (helpN > result){
                      result = helpN;
                  }  
             
        
        
        }
    System.out.println("result:"+result);    
    return result;
    }
    
}
