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
public class MinPerimeterRectangle {
    
    private int perimeter;
    private int perimeterHelp;
    private int help;
    private int A,B;
    
    public int solution(int N){
        
        System.out.println("\n area: "+N);
        perimeter = 2*(N);
        //The area of a rectangle whose sides are of length A and B is A * B, and the perimeter is 2 * (A + B).
        
        for (int i = 1; i<N+1;i++){
            for (int j = 1; j<N+1;j++){
                help = i*j;
                if (help == N){
                    perimeterHelp = 2*(i+j);
                    System.out.println("\n  "+perimeterHelp);
                    if (perimeter > perimeterHelp){
                        perimeter= perimeterHelp;
                        A=i;
                        B=j;
                    }
                }
            }
        
        }
        
        System.out.println("\n A parameter: "+A+" B parameter: "+B);
        System.out.println("\n perimeter: "+perimeter);
        return perimeter;
    }
    
}
