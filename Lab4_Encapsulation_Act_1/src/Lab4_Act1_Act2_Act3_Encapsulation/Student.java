/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4_Act1_Act2_Act3_Encapsulation;

import java.util.Scanner;
/**
 *
 * @author Rehman Computer
 */
public class Student {
    private String Name;
    private int[] result_array=new int[5];
    public Student(){
    
    }
    public Student(String N,int r[]){
        Name=N;
        result_array=r;
    

    }
    public void setName(String N){
        Name=N;
    }
    public String getName(){
        return Name;
    }
    public void setArray(){
        result_array=new int[5];
        System.out.println("enter the marks of five subject");
        for(int i=0;i<result_array.length;i++){
            Scanner input = new Scanner(System.in);
           result_array[i]=input.nextInt();
        }
    }
    public int[] getArray(){
        return result_array;
    }
    public int average(){
        int sum=0;
        int Avg;
        for(int i=0;i<result_array.length;i++){
            sum+=result_array[i];
        }
        Avg=sum/result_array.length;
        return Avg;
        
    }
   
    public void display(){
        System.out.println("The Average of the marks of"+" "+ Name);
    }
    
            }
        
