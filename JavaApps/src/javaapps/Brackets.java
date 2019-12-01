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
public class Brackets {
    
    private int nest=1;
    private String ch;
    private char chNull = 'x';
    private String[] characterA = {"(","{","["};
    private String[] characterB = {")","}","]"};
    private String[] myS;
    private boolean found ;
    
    public int solution(String S){
    
        myS= new String[S.length()];
        myS = S.split("");
        for (int i = 0; i < myS.length; i++) {
            System.out.print(" "+ myS[i]);
        }
        
        
        /*
        StringBuilder myString = new StringBuilder(S);
        myString.setCharAt(4, 'x');
        System.out.println(myString);
        for (int i = 0; i < myString.length(); i++) {
            System.out.print(" " + myString.charAt(i));
        }
        */
        System.out.print("\n ------------");
        for (int i=0; i<myS.length-1; i++){
            found = false;
            if (myS[i] == "0"){
                System.out.println("NULL");
                continue;
            } else {
            for (int x =0 ; x< characterA.length; x++){
                if (myS[i].equals(characterA[x])){
                    ch = characterB[x];
                    System.out.print("\n "+ ch);
                }
                if (myS[i].equals(characterB[x])){
                    ch = characterA[x];
                    System.out.print("\n "+ ch);
                }
            }
            
            for (int j =i+1 ; j< myS.length; j++){
                if (myS[j].equals(ch)){
                //if ( ch == myS[j]){
                    System.out.print("\n Found"+myS[j]+"  "+j);
                    myS[i] = "0";
                    myS[j] = "0";
                    nest =1;
                    found = true;
                    break;
                } 
            }
            if (found == false){
                System.out.print("\n NOT Found"+ch+" position: "+i);
                nest = 0;
                break;
            }
            }
        }
        
        
        // For example, given S = "{[()()]}", the function hould return 1 and given S = "([)()]",  given S = "()()]",
      
        /*
        for (int i =0 ; i < myString.length()-1; i++){
            if (myString.charAt(i) == 'x'){
                i++;
            }
            for (int j =i+1 ; j< myString.length(); j++){
                if (S.charAt(i) == S.charAt(j)){
                    System.out.print("\n  yes");
                    myString.setCharAt(i, chNull);
                    myString.setCharAt(j, chNull);
                }
            }
        }
        
        for (int i =0 ; i < myString.length(); i++){
           if (myString.charAt(i) != 'x'){
               nest = 0;
               break;
               
           } 
        }
        System.out.println("\n "+myString);
        */
        System.out.print("\n "+nest);
    return nest;
    }
    
}
