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
public class TieRopes {
    
    private int result=0;
    private int help=1;
    private int tie;
    
    public int solution(int K, int[] A){
        
        System.out.println("\n consider K = "+K);
        
        for(int i=0;i<A.length;i++){
            System.out.println(" A["+i+"] : "+A[i]);
        }
        for(int i=0;i<A.length-1;i++){
            tie = A[i];
            help=1;
            for(int j=i+1;i<A.length;j++){
                if(tie<K){
                    tie = tie+A[j];
                    help++;
                } else {
                    System.out.println("\n tie :"+tie);
                    if(help>result){
                        result = help;
                    }
                    break;
                }
            }
        }
        
    
    System.out.println("\n result :"+result);
    return result;
    }
    
}
