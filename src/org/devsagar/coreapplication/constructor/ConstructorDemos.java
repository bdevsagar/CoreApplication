package org.devsagar.coreapplication.constructor;

/**
 * Created by Dell on 12/16/2018.
 */
public class ConstructorDemos {
    int id;
    String fname,lname;

    public ConstructorDemos(int id,String fname,String lname){
        this.id=id;
        this.fname = fname;
        this.lname =lname;
    }

    public void display(){
        System.out.println(id);
        System.out.println(fname);
        System.out.println(lname);

    }
    public static void main (String[] args){
        new ConstructorDemos(1,"Devsagar", "sahani").display();

    }
}
