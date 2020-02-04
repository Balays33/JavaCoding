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
public class MinMaxDivision {
    
    private int result;
    private int help;
    private int lower,mid,high;
    private int a;
    private ArrayList<Integer> kList = new ArrayList<>();
    private int[] kArray;
    
    
    
    public int solution(int K, int M, int[] A){
        
        
        kArray = new int[K];
        
        
        System.out.println("\n maxium value:"+M);
        System.out.println("\n block size:"+K);
        
        for (int i=0;i<A.length;i++){
            System.out.print(" "+A[i]);
        }
        //Linear search
        
        for (int i=0;i<A.length;i++){
            if (A[i]<=M){
                
            } else {
                System.out.print("\n The element of the array is  greater than M (5) < value:"+A[i]+" position :"+i);
                System.out.print("\n ERROR Please fix it.");
            }
        }
        
        
        
        /*
        for (int i=0;i<A.length-2;i++){
            for (int j=1;j<A.length-1;j++){
                for (int z=2;i<A.length;z++){
                }
            }
        }
        */
        
        // bubble sort java
        /*
        for (int i = 0; i < A.length-1; i++) {
            for (int j = i+1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    help = A[i];
                    A[i] = A[j];
                    A[j] = help;
                }

            }
        }
        */
        // print out the array
        /*
        System.out.println(" ");
        for (int i=0;i<A.length;i++){
            System.out.print(" "+A[i]);
        }
        */
        //Binary search algorithm
        /*
        Boolean isFound = false;
        while (isFound = false){
        
            lower = A[0];
            mid = A[A.length/2];
            high = A[A.length];
            if (mid == M){
                System.out.print("\n ERROR Please fix it.");
                break;
            } else if (mid > M){
                
            
        }
        }
        */
        
        
        
        
        
    return result;
    }
    
}
