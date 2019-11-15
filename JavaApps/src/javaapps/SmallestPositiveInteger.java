/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapps;

import java.util.Random;

/**
 *
 * @author barcz
 */

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");


public class SmallestPositiveInteger {
    private int help;
    private int maxNumber = 1;
    private int smallNumber;
    private int resultNumber ;
    private boolean getResult = false;
    
    public int solution(int[] A) {
       
        System.out.println("Smallest Positive Integer");
        //print out the arrey list
        for (int i = 0; i < A.length; i++){
            System.out.print(" "+A[i]);
        }
        // bobble sort
        for (int i = 0; i < A.length-1; i++){
            for (int j = 0; j < A.length-1; j++){
                if (A[j]>A[j+1]){
                    help = A[j+1];
                    A[j+1] = A[j];
                    A[j] = help;
                }
            }
        }
        //print oust the sort list
        System.out.println("\n Sort Arrey");
        for (int i = 0; i < A.length; i++){
            System.out.print(" "+A[i]);
        }
        System.out.println(" ");
        maxNumber = A[A.length-1];
        System.out.println(maxNumber);
        smallNumber = maxNumber-1;
        System.out.println("\n small number"+ smallNumber);
        
        // search
        do{
        for (int i = A.length-1; i >=0 ; i--){
            if (A[i] == smallNumber) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
                smallNumber--;
                System.out.println(smallNumber);
            }
        }
        } while (smallNumber ==0);
        
        /*
        do {
            for (int i = A.length-1; i >=0 ; i--){
                if (smallNumber  == A[i]){
                    getResult = true;
                    System.out.println("TEST" + A[i]);
                }
            }
            smallNumber --;
        } while (!getResult || smallNumber !=0);
        if (smallNumber == 0) {
            resultNumber = maxNumber+1;
        } resultNumber = smallNumber;
        */
        System.out.println("\n result"+ resultNumber);
        
        return resultNumber;
    }
    public void sort(){
        int[] listN = new int[6];
        Random r = new Random();
        
        for (int i = 0; i <listN.length; i++){
            listN[i]= r.nextInt(10)+1;
        }
        for (int i = 0; i <listN.length; i++){
            System.out.print(" "+listN[i]);
        }
        System.out.println("");
        System.out.println("Sort version");
        
        for(int j = 0; j< listN.length-1;j++){
        for(int i = 0; i< listN.length-1;i++){
            
            if (listN[i+1] < listN[i]){
                    help = listN[i];
                    listN[i]=listN[i+1];
                    listN[i+1]=help;
            }
        }
        }
        
        for (int i = 0; i <listN.length; i++){
            System.out.print(" "+listN[i]);
        }
        
        System.out.println("");
        
        
        
        
    }
    
}
