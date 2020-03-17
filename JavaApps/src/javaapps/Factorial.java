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
public class Factorial {
    private int result;
    private int help =1;
    private int step =1;
    private int a=1;
    
    public int solution(int N,int stepN ){
        
        System.out.println("number: "+N);
        
        while(help < N){
            step++;
            help = help * step;
            System.out.println("help: "+help);
            if (N == help){
                System.out.println("Factorial number ");
            } 
            if (help> N){
                System.out.println("NOT Factorial number ");
            }
        }
        help =1;
        while(a<=stepN){
            help = help*a;
            System.out.println("step "+a+" result:"+help);
            a++;
        }
    
    return result;
    }
    
}
