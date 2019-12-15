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
public class MaxProfitS {
    
    private int result =0;
    private int buy;
    private int sell;
    private int helpBuy;
    private int helpSell;
    private int profitMAX;
    private int profit;
    
    private int[] smallN;
    
    public int solution(int[] prices,int k){
        
        //Sample input [5,11,3,50,60,90],2 Sample output: 93 (Buy.5,Sell: 11; Buy. 3, Sell: 90)
        // smallN [-,-,-]
        
        smallN = new int[k];
        
        
        
        if  (prices.length/2 < k ){
             System.out.println("\n  Error you want to buy and sell more time that your k value ");
             System.out.println("\n  "+prices.length/2);
             System.out.println("\n  "+k);
             System.exit(0);   
        } else {
        
                for (int i=0;i<prices.length;i++){
                    System.out.print(" "+prices[i]);
                }
                System.out.println("\n buying stock "+k);


        }
        
        
        
        /*
        try {
            //  Block of code to try
            System.out.println("\n length "+smallN[]);
            }
        catch(Exception e) {
            //  Block of code to handle errors
            System.out.println("\n ERROR ");
        } 
        */
        //System.out.println("\n  test"+prices[prices.length-2]);
        
        for (int i=0;i<smallN.length;i++){
            
            if (i==0){
                smallN[i] = prices[i];
            } else {
                smallN[i] = prices[i*2];
            }
            System.out.println("\n arrey "+smallN[i]);
        
        }
        
        
        
        
        for (int i=0;i<prices.length-1;i++){
             for (int j=i+1;j<prices.length;j++){
                helpBuy = prices[i];
                helpSell = prices[j];
                profit = helpSell-helpBuy;
                if (profitMAX < profit ){
                    profitMAX= profit;
                    buy = helpBuy;
                    sell = helpSell;
                }
                 
             }
        }
    
        
    System.out.println("\n Buy: "+buy+" Sell: "+ sell+" poofitMAX: "+profitMAX);
       
    return result;
    }
    
}
