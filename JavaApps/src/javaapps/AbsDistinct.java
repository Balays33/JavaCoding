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
public class AbsDistinct {
    
    //Compute number of distinct absolute values of sorted array elements.
    
    private int result;
    private int help;
    private int[] A;
    private ArrayList<Integer> mylist = new ArrayList<Integer>();
     
    
    
     public int solution(int[] A){
         
         this.A = A;
         
         kiir();
         
         sortArray(A);
                 
         kiir();
         
         absoluteArray(A);
         
         kiir();
         
         sortArray(A);
         
         kiir();
         
         creatArrayList(A);
         System.out.println("\n");
         for (int i =0;i<mylist.size();i++){
             System.out.print(" "+mylist.get(i));
         }
         
         result = mylist.size();
         System.out.println("\nabsolute distinct count of array A : "+result);
     return result;
     }
    
     private void kiir(){
         System.out.println("\n");
         for (int i = 0 ; i<A.length; i++){
             System.out.print(" "+A[i]);
         }
     }
     
     private void absoluteArray(int[] A){
     
         for (int i=0;i<A.length;i++){
             if(A[i]<0){
                 A[i] = A[i]*-1;
             }
         }
     
     }
     
      private void sortArray(int[] A){
          for (int x = 0; x < A.length; x++) {
             for (int i = 0; i < A.length - 1; i++) {
                 for (int j = i+1; j < A.length; j++) {
                     if (A[i] > A[j]) {
                         help = A[j];
                         A[j] = A[i];
                         A[i] = help;
                     }
                     //kiir();
                 }
             }
         }
     }
      
      
      private void creatArrayList(int[] A){
      
          for (int i=0;i<A.length;i++){
              if (!mylist.contains(A[i])){
                  mylist.add(A[i]);
              }
          }
      
      }
}
