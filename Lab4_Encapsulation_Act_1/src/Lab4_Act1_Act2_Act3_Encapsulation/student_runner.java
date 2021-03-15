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
public class student_runner {
    public static void main(String[] args) {
        Student S1= new Student();
        S1.setName("Student 1");
        S1.setArray();
        S1.average();
        S1.display();
        System.out.println("Average is  "+S1.average());
        
        Student S2= new Student();
        S2.setName("Student 2");
        S2.setArray();
        S2.average();
        
        S2.display();
        System.out.println("Average is  "+S2.average());
        //checking higher average
        if(S1.average()>S2.average()){
            System.out.println("Student 1 higher average");
        }
        else{
             System.out.println("Student 2 higher average");
            
        }
    }
}