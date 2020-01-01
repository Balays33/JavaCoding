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
public class CommonPrimeDivisors {
    
    private int result =0;
    //private int[] primeN = new int[100];
    private ArrayList<Integer> primeN = new ArrayList<Integer>();
    private ArrayList<Integer> pHelpA = new ArrayList<Integer>();
    private ArrayList<Integer> pHelpB = new ArrayList<Integer>();
    private int primeH;
    
    public int solution(int[] A, int[] B){
    
        for (int i = 0;i<A.length;i++){
            System.out.print(" "+A[i]);
        }
        System.out.println("\n ");
        for (int j = 0;j<B.length;j++){
            System.out.print(" "+B[j]);
        }
        
        
        
        // prime number
       
            for (int j = 2;j<100;j++){
                primeH=0;
                for (int x = 2;x<j+1;x++){
                    if ( (j%x) == 0 ){
                        primeH++;
                    }
                }
                //System.out.print(" "+primeH);
                if (primeH ==1 ){
                    primeN.add(j);
                }
            }        
        
        System.out.println("\n ");
        for(int i = 0;i<primeN.size();i++){
            System.out.print(" "+primeN.get(i));
        }
        
        // CommonPrimeDivisors
        for (int i = 0;i<A.length;i++){
            for (int j =0;j<primeN.size();j++){
                if( (A[i] % primeN.get(j)) == 0){
                    pHelpA.add(j);
                    //System.out.println("\n "+primeN.get(j));
                }
                if( (B[i] % primeN.get(j)) == 0){
                    pHelpB.add(j);
                    //System.out.println("\n "+primeN.get(j));
                }
            }
            if ( pHelpA.equals(pHelpB)){
                result++;
                System.out.print(" YES");
            }
        }
    System.out.println("\n Result  two numbers have the same prime divisors. "+result);    
    return result;
    }
    
}
