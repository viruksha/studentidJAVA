package com.internshala.javaapp;

import java.util.Scanner;

public class StudentID {
    public static void main (String[] args){
        String Yourgroup = "Group";
        Scanner s =  new Scanner(System.in);
        System.out.println("Enter your Name :");
        String name=s.nextLine();
        System.out.println("Enter your Age : ");
        int age =s.nextInt();
        System.out.println("Enter your Blood Group :");
        Scanner Bloodgroup = new Scanner(System.in);
        String urBloodgroup = Bloodgroup.nextLine();

        if(  age >= 20)
        {
            Yourgroup = "RED";
        }
        else if ( age>=15 && age<20)
        {
            Yourgroup = "BLUE";
        }

        else if ( age>=10 && age<15)
        {
            Yourgroup = "YELLOW";
        }


        System.out.println();

        System.out.println("----------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Blood group: " + urBloodgroup);
        System.out.println("----------------------");
        System.out.println("Your group is " + Yourgroup);
        System.out.println("----------------------");




    }
}
