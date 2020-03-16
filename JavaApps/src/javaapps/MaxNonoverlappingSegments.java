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
public class MaxNonoverlappingSegments {
    
    private int result =0;
    private boolean isItin= false;
    
    public int solution(int[] A, int[] B){
        
        /*
        for(int i=0;i<A.length;i++){
             System.out.print(" "+A[i]);
        }
        System.out.println("\n");
        for(int i=0;i<B.length;i++){
            System.out.print(" "+B[i]);
        }
        */
        
        for (int i=0;i<A.length;i++){
            System.out.println("A"+i+": "+A[i]+" B"+i+": "+B[i]);
        }
        /*
            A[0] = 1    B[0] = 5
            A[1] = 3    B[1] = 6
            A[2] = 7    B[2] = 8
            A[3] = 9    B[3] = 9
            A[4] = 9    B[4] = 10       
            Two segments I and J, such that I ≠ J, are overlapping if they share at least one common point. In other words, A[I] ≤ A[J] ≤ B[I] or A[J] ≤ A[I] ≤ B[J].
        */
        /*
        for(int I=0;I<A.length-1;I++){
            int J =I+1;
            if(((A[I] <= A[J])&& (A[J]<= B[I])) || ((A[J] <= A[I]) && (A[I] <= B[J]))){
                System.out.println("overlap");
            } else {
                System.out.println("A"+I+": "+A[I]+" B"+I+": "+B[I]);
                System.out.println("A"+J+": "+A[J]+" B"+J+": "+B[J]);
                result++;
            }
        }
        */
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (i!=j){
                if (((A[i] <= A[j]) && (A[j] <= B[i])) || ((A[j] <= A[i]) && (A[i] <= B[j]))) {
                    System.out.println("overlap");
                } else {
                    for(int x = j; x < A.length-1; x++){
                        for(int y = x+1; y < A.length; y++){
                                if (((A[i] <= A[j]) && (A[j] <= B[i])) || ((A[j] <= A[i]) && (A[i] <= B[j]))) {
                                    
                                    } else {result++;}
                        
                    }
                    }
                   // System.out.println("A" + i + ": " + A[i] + " B" + i + ": " + B[i]);
                   // System.out.println("A" + j + ": " + A[j] + " B" + j + ": " + B[j]);
                   // result++;
                }
            }
            }
        }
        
        /*
        for(int i=0;i<A.length-1;i++){
            for(int j=i+1;j<A.length;j++){
                overlap(A[i],B[i],A[j],B[j]);
            }
        }
        */
        
        megoldas(A,B);
    //System.out.println("\n result :" +result);
    return result;
    }
    
    private void overlap(int Ai,int Bi,int Aj,int Bj){
        isItin =false;
        System.out.println(" "+Ai+" "+Bi+" "+Aj+" "+Bj);
        for(int i =Ai;i<Bi;i++){               
            if (i==Aj){
                System.out.println(" YES ");
                isItin =true;
                break;
            }
        }
    
    }
    
    private int megoldas(int A[],int B[]){
        int N = A.length;
        if (N <= 1) {
            return N;
        }
        
        int cnt = 1;
        int prev_end = B[0];
        
        int curr;
        for (curr = 1; curr < N; curr++) {
            if (A[curr] > prev_end) {
                cnt++;
                prev_end = B[curr];
            }
        }
        System.out.println("\n cnt :" +cnt);
        return cnt;
    }
}
