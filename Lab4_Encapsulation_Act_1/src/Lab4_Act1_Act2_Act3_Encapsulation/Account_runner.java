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
public class Account_runner {
     public static void main(String[] args) {
         Account A1=new Account();
         Account A2=new Account();
         A1.setBalance(10000);
         A1.deposite(3000);
         A1.withdrawn(3000);
         A1.display();
}
}
