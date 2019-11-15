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
public class FrogJmp {
    
    private int jumpNumber;
    
    
    public int solution(int X, int Y, int D){
        System.out.println("frog currently location X: "+ X +" destination Y: "+Y+" jump distance D: "+ D);
    
        
        
        while (X<=Y){
            X = X+D;
            System.out.println(" position : "+ X);
            jumpNumber++;
        }
        System.out.println("\n Jump number  : "+ jumpNumber);
    return jumpNumber;
    }
    
}
