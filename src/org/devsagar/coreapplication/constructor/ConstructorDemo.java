package org.devsagar.coreapplication.constructor;

/**
 * Created by Dell on 12/16/2018.
 */

/**
 *
 */
public class ConstructorDemo {

    public ConstructorDemo() {System.out.println("default constructor");}
    public ConstructorDemo(int a){System.out.println("1-args constructor");}
    public ConstructorDemo(int a, int b){System.out.println("2-agrs constructor");}

    public static void main(String[] args){
        ConstructorDemo cd = new ConstructorDemo();
        new ConstructorDemo(10);
        new ConstructorDemo(10,20);
    }

}
