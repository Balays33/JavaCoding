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
public class PassingCars {
    
    public int solution(int[] A) {
        int countOfZeros = 0, count = 0;

        for (int i = 0; i < A.length; i++){
            if (A[i] == 0) countOfZeros++;                    
            if (A[i] == 1) count += countOfZeros;    
            if (count > 1000000000) return -1;
        }
        System.out.println("\n count:" + count);
        return count;
}
    
}
