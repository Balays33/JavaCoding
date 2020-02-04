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
public class NailingPlanks {
    
    private int result;
    private int[] helpA =new int[2];
    private int[] helpB =new int[2];
    
    public int solution(int[] A, int[] B, int[] C){
        
        for (int i =0;i<A.length;i++){
            System.out.print("\n A : "+A[i]+" B : "+B[i]);
        }
        for (int i =0;i<C.length;i++){
            System.out.print("\n C : "+C[i]);
        }
        //int[] nailingPlanksA = {1,4,5,8};
        //int[] nailingPlanksB = {4,5,9,10};
        for (int i =0;i<A.length-1;i++){
            helpA[0] = A[i];
            for (int j =0;j<B.length;j++){
                helpA[1] = B[i];
            
            }
        }
        
        
    
    System.out.println("result :"+ result);
    return result;
    }
    
}
