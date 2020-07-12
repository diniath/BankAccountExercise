/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapp;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nande
 */
public class BankAccount {
    private int number;
    public double amount;
    private String name;
    private boolean active;
    List<String> transactions = new ArrayList<String>();
    private static int accountsOpened;
   
    Scanner money = new Scanner (System.in);
    
    BankAccount (){
        accountsOpened++;
        active = true; 
        transactions.add("Transaction: Your account was created.");
    }
    
    BankAccount (String name, int number) {
        this();
        this.name=name;
        this.number=number;
    }
    
    BankAccount (int number, String name, double amount, boolean active){
        this(name, number);
        this.amount = amount;
    }
    
    public static int getAccountsOpened(){
        return accountsOpened;
    }
    
    public void  setName(String onoma){
        name = onoma;
    }
    
    public String getName (){
        return name;
    }
    
    public double getAmount (){
        return amount;
    }
    
    public void setNumber(int noumeroLogariasmou){
        number = noumeroLogariasmou;
    }
    
    public int getNumber(){
        return number;
    }
    
//    public boolean getActive(){
//        if (active = true){
//        System.out.print("active");
//        }
//        return active;
//    }

    public boolean getActive() {
        return active;
    }
    
    public void deposit(){
        System.out.println("Hello " + name + ", How much money would you like to deposit?");
//        Scanner depMoney = new Scanner (System.in);
        double moneyInc = money.nextDouble();
        amount = amount + moneyInc;
        System.out.println("Your new amount is " + amount);
        transactions.add("Transaction: You added " + moneyInc + "€ to your account.");
        
    }
    
    public void withdraw(){
        System.out.println("Hello " + name + ", How much money would you like to withdraw?");
        double moneyOut = money.nextDouble();
        if (moneyOut <= amount){
            amount = amount - moneyOut;
            System.out.println("Your new amount is " + amount);
            transactions.add("Transaction: You withdrew " + moneyOut + "€ from your account.");
            }else {
                System.out.println("Not enough money in your account :( Please run again to request different withdrawal amount!");
                transactions.add("Transaction: You tried to withdraw " + moneyOut + "€ from your account, but there was not enough balance.");
                }
    }
    
    public void printTransactions(){
//        System.out.println(transactions);
        System.out.println("*************************");
        System.out.println("Dear " + name + ", here is a list of your transactions:");
       transactions.forEach(System.out::println);
    }
    
}
