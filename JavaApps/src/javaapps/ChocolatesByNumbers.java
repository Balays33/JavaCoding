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
public class ChocolatesByNumbers {
    
    private int result =1;
    private int[] chocolateC;
    private boolean circle = true;
    private int step=0;
    
    public int solution(int N, int M){
        
        System.out.println("\n N: "+N+" M: "+M);
        
        chocolateC = new int[N];
        for (int i = 0;i<chocolateC.length;i++){
            chocolateC[i]=1;
        }
        kiir();
       
         chocolateC[0] =0;
         while (circle){
             if (step+M > N){
                 step = (step+M)-N;
             } else if (step+M == N){
                 step = 0;
             
             } else     {
                  ;
             }
             if (chocolateC[step] == 1){
                 chocolateC[step] = 0;
                 result++;
                 kiir();
             } else {
                 circle = false;
             }
             
         }
        
        System.out.println("\n result "+result);
        return result;
    }
    
    private void kiir(){
        System.out.print("\n ");
        for (int i = 0;i<chocolateC.length;i++){
            System.out.print(" "+chocolateC[i]);
        }
    
    }
}
