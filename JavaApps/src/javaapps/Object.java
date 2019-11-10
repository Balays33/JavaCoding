/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapps;

import java.util.Random;

/**
 *
 * @author barcz
 */
public class Object {
    
    private String namecode;
    private int age;
    private String color;
    Random r = new Random();
    
    
    public void runObject(){
        createObject();
        printObject();
    }
    
    private void createObject(){
        age = r.nextInt(60)+1;
        for(int i = 0; i<5; i++){
            namecode += r.toString();
        }
    }
    
    private void printObject(){
        System.out.println(namecode.toString());
        System.out.println(age);
        
    }
    
}
