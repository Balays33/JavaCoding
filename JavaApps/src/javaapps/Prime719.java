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
public class Prime719 {
    
    private int result;
    private ArrayList<Integer> prime = new ArrayList<Integer>();
    private ArrayList<Integer> kerekPrim = new ArrayList<Integer>();
    private int firstN = 100;
    private int lastN = 999;
    private int num =0;
    int temp;
    private int[] listA = new int[3];
                           
    
    /*
    719 prime
    
    
    Készítsen egy olyan modult, amely egy rendszer részeként visszajáró összeget számol a lehető legkevesebb darabszámú pénzjegy és érme (magyar forint) felhasználásával. 
    A bemenő paraméterek a fizetendő és a fizetett összeg. Figyeljen, hogy a lehető legteljesebb megoldást adja!
    Készítsen egy olyan modult, amely egy üres SUDOKU táblát helyesen kitölt. SUDOKU szabályok: minden sorban, oszlopban és blokkban (3*3) a számok 1-től 9-ig csak egyszer szerepelhetnek
    
    Kerek prím keresés. Kerek prímnek nevezzük az olyan prímet, mely számjegyeinek összes "forgatásából" adódó szám is prím. Például: 719 --> 197 --> 971 --> 719 (körbeértünk), 
    tehát 719 összes forgatása: 197, 971, amik szintén prímek, tehát 719 kerek prím. Feladat: Hány kerek prím van 1 millió alatt? 
    Amit várunk: egy kész implementáció, mely kiszámolja és kiírja az 1 millió alatti kerek prímek számát
    
    */
    public int solution(){
        
        //int a = 72 % 10;
        //System.out.println("Result"+a);
    
        //check prime numbers
        for (int i = firstN; i < lastN; i++) {

            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                    //System.out.println("TEST");
                }
            }
            if (counter == 2) {
                //Appended the Prime number to the ArrayList
                prime.add(i);
               // findKerekPrim(i);
               isItKerekPrim(i);
            }
        }
           
        // print out prime numbers
        for (int j = 0; j<prime.size();j++){
            System.out.print(" "+prime.get(j));
        }
        
        
        System.out.println("Result"+result);
        return result;
    }
    
    
    public void findKerekPrim(int primePa){
        int primePA = primePa;
        temp = primePA;
        int count = 0;
        int digit;
        //counting digits in the input number
        while(primePA > 0)
        {
            primePA = primePA / 10;
            count++;
        }
        while(temp > 0)
        {
            digit = temp % 10;
            listA[count-1] = digit;
            System.out.println("Digit at place "+count+" is: "+digit);
            temp = temp / 10;
            count--;
        }
        checkPrimeN(listA);
        /*
        for (int i = 0; i<listA.length;i++){
             System.out.println(" "+listA[i]);
        }
        */
    }
    
    public void checkPrimeN(int[] listA){
        int[] listB = listA;
    
        
    
    }
    
    public void kiir(){
         // print out prime numbers
        for (int j = 0; j<kerekPrim.size();j++){
            System.out.print(" "+kerekPrim.get(j));
        }
    }
    
    public boolean checkPNumber(int number,boolean primeBoolean ){
            
            int counter = 0;
            
            for (num = number; num >= 1; num--) {
                if (number % num == 0) {
                    counter = counter + 1;
                    //System.out.println("TEST");
                }
            }
            if (counter == 2) {
                //Appended the Prime number to the ArrayList
                primeBoolean = true;
               
            } else {primeBoolean = false;}
        return primeBoolean;
    }
    
    
    public void isItKerekPrim(int num) {
        int digits = numberOfDigits(num);
        boolean primeBoolean = false; 
        int powTen = (int) Math.pow(10, digits - 1);

        for (int i = 0; i < digits - 1; i++) {
            int firstDigit = num / powTen;

            // Formula to calculate left shift 
            // from previous number 
            int left = ((num * 10) + firstDigit)
                    - (firstDigit * powTen * 10);

            //System.out.print(left + " ");
            checkPNumber(left,primeBoolean);
            
            // Update the original number 
            num = left;
        }
        if (primeBoolean) {
            result++;
            System.out.println("This is round Prime"+digits);
        }
    }
    
    private  int numberOfDigits(int n)  
{ 
    int cnt = 0; 
    while (n > 0)  
    { 
        cnt++; 
        n /= 10; 
    } 
    return cnt; 
} 
}
