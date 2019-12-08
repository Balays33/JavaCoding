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
public class Dominator {
    
    private int result =0;
    private int dominator;
    private int helpDomi;
    private int occurs, occursHelp;
    private int halfOfArrey;
    private int indexposition;
    
    public int solution(int[] A){
        
        for (int i =0; i<A.length;i++){
            System.out.print(" "+A[i]);
        }
        
        halfOfArrey = A.length/2;
        //dominator = A[0];
        //occurs=1;
        for (int i =0; i<A.length;i++){
            helpDomi = A[i];
            //dominator = A[i];
            for (int j =0; j<A.length;j++){
            //System.out.print(" "+A[i]);
            if (helpDomi == A[j]){
               occursHelp++; 
            }
            }
            System.out.println(" dominator Helper"+helpDomi+" occurs"+occursHelp);
            if (occursHelp >= occurs){
                dominator = helpDomi;
                occurs = occursHelp;
                indexposition = i;
            }
            occursHelp =0;
            
        }
        
        if (occurs >= halfOfArrey){
            result = dominator;
            
        } else {
            System.out.println("−1 if array A does not have a dominator");
            result = -1;
            indexposition = -1;
        }
        
        
    
    System.out.print(" dominator number"+result+" index position"+indexposition);   
    return result;
    }
    
}
