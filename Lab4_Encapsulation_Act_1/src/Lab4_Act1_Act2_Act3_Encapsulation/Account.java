/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4_Act1_Act2_Act3_Encapsulation;

/**
 *
 * @author Rehman Computer
 */
public class Account {
    private int balance;
    public Account(){
        balance=5000;
    }
    public void setBalance(int Bal){
        balance=Bal;
}
    public int getBalance(){
        return balance;
    }
    public void deposite(int D){
        balance+=D;
    }
    public void withdrawn(int out){
        balance-=out;
    }
    public void display(){
        System.out.println("-----------ACCOUNT DETAILS");
        System.out.println("Total balance is: "+ balance);
        

        
    }
}
