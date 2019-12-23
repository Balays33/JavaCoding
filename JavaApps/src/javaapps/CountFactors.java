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
public class CountFactors {
    
        private int result =0;
    private ArrayList<Integer> values = new ArrayList<>();
    private int help;
    
            
    
    public int solution(int N){
        
        System.out.println("\n got number : "+N);
        
        //help = N % 7;
        //System.out.println("\n test : "+help);
        
        
        for (int i =1; i<=N;i++){
            help = N % i;
            if (help == 0){
                values.add(i);
                result++;
            }
        }
        
        
        for (int i =0; i<values.size();i++){
            System.out.print(" "+values.get(i));
        }
        
        System.out.println("\n factor : "+result);
        return result;
    }
    
}
