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
public class CyclicRotation {
    
    private int[] originalnArrey;
    private int[] cyclicRotationArrey;
    private int rotationNumber;
    
    public int[] solution(int[] A, int K){
    
        originalnArrey = A;
        rotationNumber = K;
        cyclicRotationArrey = new int[A.length];
        
        //sizeOfArrey = A.length;
        for (int i = 0; i<A.length; i++){
            System.out.print(" "+A[i]);
        }
        do {
            cyclicRotationArrey[0] = originalnArrey[originalnArrey.length - 1];
            for (int i = 0; i < originalnArrey.length - 1; i++) {
                cyclicRotationArrey[i + 1] = originalnArrey[i];
            }
            for (int i = 0; i < originalnArrey.length; i++) {
                originalnArrey[i] = cyclicRotationArrey[i];
            }

            System.out.println("\n");
            for (int i = 0; i < originalnArrey.length; i++) {
                System.out.print(" " + originalnArrey[i]);
            }
            rotationNumber--;
        } while (rotationNumber > 0);
        
        
        
        
        //System.out.println(" "+cyclicRotationArrey[0]);
    return cyclicRotationArrey;
    }
    
}
