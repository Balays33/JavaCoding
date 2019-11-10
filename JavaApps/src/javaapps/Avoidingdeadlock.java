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
public class Avoidingdeadlock {
    
    Object object1 = new Object();
    Object object2 = new Object();
    
    public void run(){
        System.out.println("The interviewer simply asked you to write code where a resource is accessed by multiple threads. "
                +"\n" +"You need to write code in such a way that no deadlock should occur.  "
                +"\n" + "The trick to solving this problem is acquiring resources in order and release them in reverse order, e.g. "
                +"\n" + "first acquire resource R1 and only if you have got R1 to go for R2. This way, you can avoid deadlock.\n");
        
        System.out.println("");
        
        object1.runObject();
    }
    
    
    public void r1(){
    }
    
    public void r2(){
    }
    
}
