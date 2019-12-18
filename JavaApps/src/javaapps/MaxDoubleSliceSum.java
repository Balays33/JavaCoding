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
public class MaxDoubleSliceSum {
    
    private int result;
    private int helpN;
    private int  X,Y,Z; // X < Y < Z
    
    public int solution(int[] A){
        
        for (int i =0; i<A.length;i++){
            System.out.print(" "+A[i]);
        }
        
        // x     y       z
        // 3,2,6,-1,4,5,-1,2
        
        for (int x =0; x<A.length-2;x++){
             for (int y =x+1; y<A.length-1;y++){
                  for (int z =y+1; z<A.length;z++){
                      
                      //helpN = A[x]+A[y]+A[z];
                      //System.out.println(" "+helpN+" "+A[x]+" "+A[y]+" "+A[z]);
                      for (int i =x+1; i<y;i++){
                          helpN += A[i];
                      }
                      for (int j =y+1; j<z;j++){
                          helpN += A[j];
                      }
                      if (result<helpN){
                          result = helpN;
                          X=A[x];
                          Y=A[y];
                          Z=A[z];
                      }
                      helpN=0;
        }
        }
        }
    System.out.println("\n X: "+X+" Y: "+Y+" Z: "+Z);   
    System.out.println("\n :result :"+result);
    return result;
    }
    
}
