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
public class MaxProfit {
    
    private int result;
    private int tempProfit;
    private int soldDay;
    private int buyDay;
    
    public int solution(int[] A){
        
        for (int i = 0; i <A.length;i++){
            System.out.println(" "+A[i]);
        }
        System.out.println("\n ");
        
        for (int i = A.length-1; i > 0;i--){
            for (int j=A.length-2;j>-1;j--){
                tempProfit = A[i]-A[j];
                if (tempProfit > result){
                    result = tempProfit;
                    soldDay = A[i];
                    buyDay = A[j];
                    
                }
            }
        }
    
        
        if (result < 0){
            result = 0;
             System.out.println("\n The function should return 0 if it was impossible to gain any profit.");
             
        } else {
            System.out.println("\n profit:"+result+" buyDay: "+buyDay+" soldDay: "+soldDay);
        }
        //System.out.println("\n profit:"+result+" buyDay: "+buyDay+" soldDay: "+soldDay);
    return result;
    }
    
}
