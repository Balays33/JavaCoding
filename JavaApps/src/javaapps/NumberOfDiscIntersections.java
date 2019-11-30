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
public class NumberOfDiscIntersections {
    
    private int intersect;
    private int result=0;
    private int rightN;
    private int leftN;
    private int rightN2;
    private int leftN2;
    
    public int solution(int[] A){
    
            for (int i = 0; i<A.length; i++){
                System.out.print(" "+ A[i]);
            }
            
            System.out.println(" ");
            /*
            for (int i = 0; i<A.length; i++){
                rightN = i+A[i];
                leftN = i-A[i];
                System.out.print(" rightN: "+ rightN + " leftN: "+ leftN);
            }
        
            */
            for (int i = 0; i<A.length-1; i++){
                for (int j =i+1; j<A.length; j++){
                    rightN = i+A[i];
                    leftN = i-A[i];
                    System.out.print(" rightN: "+ rightN + " leftN: "+ leftN);
                    rightN2 = j+A[j];
                    leftN2 = j-A[j];
                    System.out.print(" rightN2: "+ rightN2 + " leftN2: "+ leftN2);
                    System.out.println(" ");
                    if ((leftN2 <= rightN) && (leftN2 >= leftN) || (rightN2<= rightN) && (rightN2>= leftN)){
                        System.out.println("Yes");
                        if ((leftN2 == leftN) || (leftN2 == rightN) || (rightN2 == leftN) || (rightN2 == rightN)){
                            result++;
                        } else {result+=2;}
                        System.out.println("\n Result : "+result);
                    }
                }
                
            }
            
        if (intersect > 10000000) {
            result = -1;
        }
    System.out.println("\n Result : "+result);
    return result;
    }
    
}
