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
public class Help {
    
    private String result;
    private char swap1,swap2,add,join;
    
    public String solution(String S, String T) {
        // write your code in Java SE 8
        
         System.out.println("\n"+ S);
         System.out.println("\n"+ T);
        
         if (S.equals(T)){
             System.out.println("\n YES");
             result = "NOTHING";
         } else {
             System.out.println("\n NO");
             
             if (S.length() == T.length()){
                 for (int i = 0;i<S.length();i++){
                     swap1 = S.charAt(i);
                     swap2 = T.charAt(i);
                     if (swap1 != swap2){
                         break;
                     }
                     
                 }
                 result = "SWAP"+" "+swap1+" "+swap2;
             } 
             if (S.length()< T.length()){
                 if ((S.length()+1)== T.length()){
                 add= T.charAt(T.length()-1);
                 
                 result = "ADD"+" "+add;
                 }else {
                 result = "IMPOSSIBLE";
                }
             }
             if (S.length()> T.length()){
                 for (int i = 0;i<S.length();i++){
                     join = S.charAt(i);
                     if (S.charAt(i) != T.charAt(i)){
                         break;
                     }     
                 }
                 
                 result = "JOIN"+" "+join;
             } 
             
             /*
                for (int i= 0; i<S.length();i++){
                    System.out.print(" "+S.charAt(i));
            }
            */
         }
        
        System.out.println("\n"+ result);
        return result;
    }
    
}
