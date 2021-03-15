/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp20_bse_036_lab4_assignment;

/**
 *
 * @author Rehman Computer
 */
public class HotDogs_Runner {
    public static void main(String[] args){
      
       HotDogStand stand1 = new HotDogStand();
       HotDogStand stand2 = new HotDogStand();
       HotDogStand stand3 = new HotDogStand();
        stand1.SetSoldHotDogs(20);
        stand1.justSold();
        stand1.justSold();
        stand1.justSold();
        stand1.setId(1001);
        stand1.display();
        
        
       stand2.SetSoldHotDogs(10);
        stand2.justSold();
        stand2.justSold();
        stand2.justSold();
        stand2.justSold();
        stand2.justSold();
        stand2.justSold();
        stand2.setId(1002);
        stand2.display();
       
        
      stand3.SetSoldHotDogs(8);
        stand3.justSold();
        stand3.justSold();
        stand3.setId(1003);
        stand3.display();
       
    
    }
}
       