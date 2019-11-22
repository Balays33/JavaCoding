/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapps;

import static java.lang.Math.random;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author barcz
 */
public class Help {
    /*
    private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private String name;
    Random r = new Random();
    private int helpnumber;
    private char b;
    
    private  String carC[] = {"a","b","c","d","e","f","g","h","i","j","k"};
    
    public void run(){
        helpnumber =  r.nextInt();
         int rndCharAt = r.nextInt(CHAR_LOWER.length());
        b = CHAR_LOWER.charAt(rndCharAt);
        name += b;
        System.out.println(name);
        
        name = carC[r.nextInt(carC.length)];
        System.out.println(name);
    
    }
    */
    /*
            private String[] result;
            private String[] resultHelp;
            
            private String[] secondT;
            private String end ="";
            private int lenOfD=0;
            private String a = "a";
            private String b = "b";
            private String c = "c";
            private int lenA, lenB, lenC;
            
            private boolean pickupB = false;
            private int pickupC;
    public String solution(int A, int B, int C) {
        //
        lenOfD = A+B+C;
        lenA = A;
        lenB = B;
        lenC = C;
        int counterA=0;
        int counterB=2;
        int counterC=2;
        
        //System.out.println(lenA);
        Random r = new Random();
        result = new String[lenOfD];
        String abc = "abc";
        pickupC = r.nextInt(abc.length())+1;
        //System.out.println(lenOfD);
        
        
        
        
        for (int i = 0; i < lenOfD; i++) {
            
            
            do {
                pickupC = r.nextInt(abc.length())+1;
                //System.out.println(pickupC);
                
                switch (pickupC) {
                    case 1:
                        // code block
                        if (lenA>0){
                        result[i] = "a";
                        lenA--;
                        pickupB =true;
                        
                        }
                        break;
                    case 2:
                        // code block
                        if (lenB>0 ){
                        result[i] = "b";
                        lenB--;
                        pickupB =true;
                        
                        } //else System.out.println("lenB" + lenB);
                        break;
                    case 3:
                        // code block
                        if (lenC>0 ){
                        result[i] = "c";
                        lenC--;
                        pickupB =true;
                        
                        } //else System.out.println("lenC" + lenC);
                        break;
                    default:
                    // code block
                        System.out.println("Error");
                }
            
            }while (pickupB == false);
            pickupB = false;
           // System.out.println(result[i]);

        }
        /*
        int counter = 0;
        String[] helpArrey = new String[result.length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < helpArrey.length; j++) {
                switch (counter){
                    case 0:
                        helpArrey[j] = result[i];
                        counter=1;
                        System.out.println(helpArrey[j]);
                        break;
                    case 1:
                        if (helpArrey[j-1] == result[i]){
                            helpArrey[j] = result[i];
                            counter=2;
                            System.out.println(helpArrey[j]);
                        }
                        break;
                    case 2:
                        if (helpArrey[j-1] != result[i]){
                            helpArrey[j] = result[i];
                            counter=1;
                            i--;
                        } else{ 
                            i++;
                            
                        }   
                        break;
                    default:
                    // code block
                        System.out.println("Error");
                
                        
                }
                
            }
        }
        
        for(int i=0;i<helpArrey.length;i++)
            end+=helpArrey[i]+" ";
        System.out.println(end);
        for(int i=0;i<result.length;i++)
            end+=result[i]+" ";
       */
        /*
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
        
        resultHelp = new String[result.length];
        int counter = 0;
        for(int i=0;i<result.length;i++){
            for(int j=0;j<resultHelp.length;i++){
                if ((A>B) && (A>C)){
                      // A is largest
                     resultHelp[j] = result[i];
                     A--;
                     counter++;
                  }
                  if ((B>A) && (B>C)){
                      // B is largest
                      
                  }
                  if ((C>B) && (C>A)){
                      // C is largest
                      
                  }  
            }
        }
        
        */
        
        /*
        for(int i=0;i<result.length;i++)
            end+=result[i]+" ";
        System.out.println(end);
        
        
        
        int[] arrey = new int[3];
        
        arrey[0] = A;
        arrey[1] = B;
        arrey[2] = C;
        int helpP =0;
        int position=0;
        int x=0;
        
        secondT= new String[A+B+C];
        //System.out.println(arrey[0]);
        
        for (int i = 0; i<arrey.length; i++){
            if (helpP < arrey[i] ){
                helpP = arrey[i];
                position = i;
            }
        }
        
            switch (position) {
                    case 0:
                        // code block
                        
                        secondT[x] = "a";
                        secondT[x+1] = "a";
                        break;
                    case 1:
                        // code block
                        secondT[x] = "b";
                        secondT[x+1] = "b";
                        break;
                    case 2:
                        // code block
                        secondT[x] = "c";
                        secondT[x+1] = "c";
                        break;
                    default:
                    // code block
                        System.out.println("Error");
                } 
            System.out.println(secondT[x+2]);
            arrey[position] -=2;
            helpP =0;
        
        System.out.println(position);
        
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
        */
        
        /*
        Arrays.sort(result);
        for(int i=0;i<result.length;i++)
            end+=result[i]+" ";
        System.out.println(end);
        */
      /*  
        List<String> strList = Arrays.asList(result);
        Collections.shuffle(strList);
                //Collections.shuffle(strList, r);
                        //Collections.rotate(strList, 1);
                        Collections.swap(strList, 1, 2);
                        
        for(int i=0;i<strList.size();i++)
            end+=strList.get(i)+" ";
        System.out.println(end);
        return a;
    }
    */
    int end;
    int number =5;
    String S = "hashed array to store count of digits";
    
    public int solution(int A) {
    
       // hashed array to store count of digits 
        int count[] = new int[10]; 
          
        // Converting given number to string 
        String str = Integer.toString(A); 
          
        // Updating the count array 
        for(int i=0; i < str.length(); i++) {
            //count[str.charAt(i)]
                    count[i]= str.charAt(i);
        }
        // result is to store the final number 
        int result = 0, multiplier = 1; 
          
        for(int i=0; i < str.length(); i++) 
            System.out.println(count[i]); 
        
        
        
        // Traversing the count array 
        // to calculate the maximum number 
        //
        
        for (int i = 0; i <= 9; i++) 
        { 
            while (count[i] > 0) 
            { 
                result = result + (i * multiplier); 
                count[i]--; 
                multiplier = multiplier * 10; 
            } 
        } 
       
        System.out.println(count[0]);
       System.out.println(result);
        // return the result 
        return result; 
    }
}
