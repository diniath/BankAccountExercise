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
public class BankApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BankAccount acc1 = new BankAccount();
        BankAccount acc2= new BankAccount("Albus Dumbledore", 22222);
        BankAccount acc3 = new BankAccount(33333, "Naruto Uzumaki", 200.0, true);
        
        acc1.setName("John Doe");
//      acc2.setName("Dumbledore, Albus");
//      acc3.setName("Uzumaki, Naruto");
        acc1.amount = 150.0;
        acc1.setNumber(11111);
        acc2.amount = 400.0;
        
        acc2.deposit();
        acc2.deposit();
        acc2.withdraw();
        acc2.withdraw();
        acc2.printTransactions();
        
        System.out.println("*************************");
        acc3.deposit();
        acc3.deposit();
        acc3.withdraw();
        acc3.printTransactions();
        
        System.out.println("*************************");
        System.out.println("In our bank we have " + BankAccount.getAccountsOpened() + " account(s) opened");
        
        System.out.print("Account 1 holder's name is " + acc1.getName() + ".");
        System.out.print("The allocated account number is " + acc1.getNumber());
        
        if (acc1.getActive() == true){
            String x = "active";
            System.out.println(", its status is " + x + " and currently has " + acc1.getAmount() + "€.");
        }
        
        
//        System.out.println(", its status is " + acc1.getActive() + " and currently has " + acc1.amount + ".");
        System.out.print("Account 2 holder's name is " + acc2.getName() + ".");
        System.out.print("The allocated account number is " + acc2.getNumber());
        if (acc1.getActive() == true){
            String x = "active";
            System.out.println(", its status is " + x + " and currently has " + acc2.getAmount() + "€.");
        }
        
        System.out.print("Account 3 holder's name is " + acc3.getName() + ".");
        System.out.print("The allocated account number is " + acc3.getNumber());
        if (acc1.getActive() == true){
            String x = "active";
            System.out.println(", its status is " + x + " and currently has " + acc3.getAmount() + "€.");
        }
        System.out.println("************ Second exercise *************");
        
        BankAccount acc4 = new BankAccount();
        Person p1 = new Person ("Bary", 30, acc4);
        acc4.amount = 1000.0;
        System.out.println(p1.getName() + " has $" + acc4.getAmount() + " in his account.");
        
        BankAccount acc5 = new BankAccount();
        Person p2 = new Person ("Lary", 40, acc5);
        acc5.amount = 2000.0;
        System.out.println(p2.getName() + " has $" + acc5.getAmount() + " in his account.");
        
        BankAccount acc6 = acc4;
        Person p3 = new Person ("Mary", 30, acc6);
        System.out.println(p3.getName() + " has $" + acc6.getAmount() + " in her account.");
    
    
    
    }
    
    
   
}
