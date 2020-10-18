/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instance.initializer.block;

/**
 *
 * @author Ahsan Qadeer
 */
public class InstanceInitializerBlock2 {

   int x=10;
    
    InstanceInitializerBlock2()
    {
        System.out.println("Constructor and value is:"+x);
        x=x+10;
    }
    
    //Instance Initializer Block
    {
        System.out.println("Instance Initializer Block and value is:"+x);
        x=x+10;
    }
    
    // Instance Initializer Block (there can be as many instance initializer block,
    // compiler combines them into one in sequence vise in which they are written
    {
        System.out.println("Instance Initializer Block 2 and value is:"+x);
    }
    public static void main(String[] args) {
        
        //  InstanceInitializerBlock run every time when instance of a class is created
        // i-e object is created
        InstanceInitializerBlock2 ob1=new InstanceInitializerBlock2();
        InstanceInitializerBlock2 ob2=new InstanceInitializerBlock2();
        
       
        
    }
}
