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
public class Marks {
    private int Marks1;
    private int Marks2;
    private int Marks3;
    
public Marks(){
    Marks1=70;
    Marks2=50;
    Marks3=90;
}
public Marks(int m1,int m2,int m3){
    Marks1=m1;
    Marks2=m2;
    Marks3=m3;
    
}
public void M1Set(int m1){
    Marks1=m1;
}
public int getM1(){
    return Marks1;
}


public void M2Set(int m2){
    Marks2=m2;
}
public int getM2(){
    return Marks2;
}


public void M3Set(int m3){
    Marks3=m3;
}
public int getM3(){
    return Marks3;}


public void display(){
System.out.println("Marks1= "+ Marks1+" "+
                   "Marks2= "+ Marks2+" "+
                   "Marks3= "+ Marks3 );
}
}
