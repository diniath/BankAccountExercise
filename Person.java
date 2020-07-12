/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapp;

/**
 *
 * @author nande
 */
public class Person {

    private String name;
    private int age;
    private BankAccount account;

    
    Person(){
        System.out.println("New person, " + getName() + ", created.");
    }
    
    Person (String name){
        this.name = name;
    }
    
    Person (String name, int age){
        this.name = name;
        this.age = age;
    }
    
    Person (String name, int age, BankAccount account){
        this(name, age);
        this.account = account;
    }
    
    
    public void setName(String onoma) {
        onoma = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge(){
        return age;
    }

}
