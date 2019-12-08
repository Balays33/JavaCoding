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
public class Nesting {
    
    private int result = 1;
    private int inputSize;
    private String[] inputS;
    private int middleN;
    private String a ="(";
    private String b =")";
           
    
    public int solution(String S){
        
        inputSize = S.length();
        System.out.println(S);
        inputS = new String[inputSize];
        StringBuilder strBuilder=new StringBuilder(S);
        //System.out.println(strBuilder.charAt(1));
        
       
        
        for (int i = 0;i<S.length();i++){
            inputS[i] = String.valueOf(strBuilder.charAt(i));
        }
        
         for (int i = 0;i<inputS.length;i++){
            System.out.print(" "+inputS[i]);
        }
        
         if (S.isEmpty()){
            System.out.print(" S is empty");
            result = 1;
        }
         if (inputSize% 2 == 0){
             middleN = inputSize / 2;
             int arS = middleN;
             System.out.print(" middleN : "+ middleN);
             
             for (int i = middleN-1;i>-1;i--){
                    System.out.println("\n step "+ i);

                    if (((inputS[i].equals(a)) && (inputS[arS].equals(b))) || ((inputS[i].equals(b)) && (inputS[arS].equals(a)))) {
                        System.out.print("Good");
                        result = 1;
                    } else {
                        result = 0;
                        break;
                    }
                    
                 arS++;   
                }
         }
         else {
             System.out.print(" S is not nested ");
             result = 0;
         }
         
         
        //S = "(()(())())",
      System.out.print("\n that, given a string S consisting of N characters, returns 1 if string S is properly nested and 0 otherwise RESULT: "+ result);   
    return result;
    }
    
    
}
