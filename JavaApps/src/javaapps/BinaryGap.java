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
public class BinaryGap {
    
    private int binaryNumber;
    private String binaryString;
    private int[] a;
    private int arreyLength;
    private int binaryGap = 0;
    private int nullSzamlalo = 0;
    
    public int solution(int N){
    
        System.out.println("Binary is " + Integer.toBinaryString(N));
        //binaryNumber = Integer.parseInt((Integer.toBinaryString(N)));
        //System.out.println(binaryNumber);
        binaryString = Integer.toBinaryString(N);
        System.out.println(binaryString);
        //System.out.println(binaryString.charAt(0));
        
        binaryNumber =Character.getNumericValue(binaryString.charAt(1));  
        
        arreyLength = binaryString.length();
        a = new int[arreyLength];
        
        for (int i = 0; i< arreyLength; i++){
            a[i] = Character.getNumericValue(binaryString.charAt(i));
        }
        // print out the arrey
        /*
        for (int i = 0; i< a.length; i++){
            System.out.println(a[i]);
        }
       */
        for (int i = 0; i< a.length; i++){
            
            if (a[i] == 0)  {
                nullSzamlalo++;
               
            }
            if ((a[i] == 1) && (nullSzamlalo >= binaryGap)){
                    binaryGap = nullSzamlalo;
                    nullSzamlalo=0;
                }
                
        }
        
        System.out.println(binaryGap);
        return binaryGap;
    }
    
}
