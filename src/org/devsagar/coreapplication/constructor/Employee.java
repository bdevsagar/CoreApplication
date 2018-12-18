package org.devsagar.coreapplication.constructor;

/**
 * Created by Dell on 12/16/2018.
 */
public class Employee {
    int id;
    String empName;

    public Employee(int id, String empName){
        this.id = id;
        this.empName = empName;
    }

    public static void main(String[] args){

     Employee E=  new Employee(1,"dev");

    }



}
