package org.devsagar.coreapplication.instanceblock;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created by Dell on 12/16/2018.
 */
/**
 * Instance VARIABLE, METHOD, BLOCK memory is allocated during object creation
 * Static VARIABLE, METHOD, BLOCK memory is allocated during .class file loading
 * Local VARIABLE memory is allocted during that method called.
 */
public class InstanceBlock {

    int a =10; //instance varible
    static int b; //static variable

    /**
     * Constructor with 0 arguments
     */
    public InstanceBlock() {
        int a=1; //local variable
        System.out.println("0-args constructor");
    }

    /**
     * Instance method
     */
    public void display(){
        System.out.println("instance method called");
    }

    /**
     * static method
     */
    public static void print(){
        System.out.println("static method called");
    }

    /**
     * Syntax of Instance Block
     */
    {
        int a= 10;
        int b=20;
        int c = a+b;
        System.out.println(c);
    }

    /**
     * Syntax of static block
     */
    static {
        System.out.println("static block called");
    }

    public static void main(String[] args)
    {
        InstanceBlock i = new InstanceBlock();

    }
}
