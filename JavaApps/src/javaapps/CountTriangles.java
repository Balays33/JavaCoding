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
public class CountTriangles {
    
    private int result =0;
    private boolean triangle;
    private ArrayList<Integer> list = new ArrayList<Integer>();
    
    public int solution(int[] A){
        
        for (int i=0;i<A.length;i++){
            System.out.print(" "+A[i]);
        }
        
        for(int i=0;i<A.length-2;i++){
            for(int j=i+1;j<A.length-1;j++){
                for(int x=j+1;x<A.length;x++){
                    triangle = false;
                    if ((A[i]< A[j]+A[x]) && (A[j]< A[i]+A[x]) && (A[x]< A[j]+A[i])){
                        triangle = true;
                        System.out.println(" "+A[i]+" "+A[j]+" "+A[x]);
                    }
                   
                    if(triangle){
                        //list.add((A[i]*100)+(A[j]*10)+A[x]);
                        result++;
                    }
                    
                }
            }
        }
    
        //kiir(list);
        
    System.out.println("\n  returns the number of triangular triplets in this array "+result);
    return result;
    }
    
    private void kiir(ArrayList<Integer> list){
    
        for(int i=0;i<list.size();i++){
            System.out.println("\n "+list.get(i));
        }
    }
    
}
