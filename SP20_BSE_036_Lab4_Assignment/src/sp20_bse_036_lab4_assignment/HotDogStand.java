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
public class HotDogStand {
    private int Id;
    private int HotDogSold;

    public HotDogStand(){
    }
    public HotDogStand(int ID_number,int Sold){
        Id=ID_number;
        HotDogSold=Sold;
      
    }
    public void setId(int Id_number){
        Id=Id_number;
    }
    public int getId(){
        return Id;
    }
    public void SetSoldHotDogs(int Sold){
         HotDogSold=Sold;
         
    }
    public int getSold(){
    return HotDogSold;
}
    public void justSold(){
        HotDogSold++;
               
}
    
    public void display(){
        System.out.println("-------------HotDogs Stand-------------");
        System.out.println(" stand Id number:  "+ Id);
        System.out.println("Soldout Hotdogs :  "+ HotDogSold);
        
        
    }
    
    
}
