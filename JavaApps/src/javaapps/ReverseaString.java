/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapps;

import java.util.Scanner;

/**
 *
 * @author barcz
 */
public class ReverseaString {
    private String result;
    
    public String solution(){
        
        System.out.println("Please give a String");
        Scanner text = new Scanner(System.in);
        //StringBuffer b = text.nextLine();
        String a = text.nextLine();
        StringBuffer s=new StringBuffer(a);
        System.out.println("your text "+s.reverse());
    
    return result;
    }
    
}
