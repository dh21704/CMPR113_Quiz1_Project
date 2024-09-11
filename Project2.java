/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz1.project;

import java.util.Scanner;

/**
 *
 * @author danielhernandez
 */
class Employee
{
    String name, address, city, state, zip;
    
    Employee(String name, String address, String city, String state, String zip)
    {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    
    public String toString()
    {
        return "\nName: " + name + 
                "\nAddress: " + address + 
                "\nCity: " + city + 
                "\nState: " + state + 
                "\nZip: " + zip;
    }
    
    
    
   
}

class ProductionWorker extends Employee
{
    
    int shift;
    double hourlyPay;
    
    ProductionWorker(String name, String address, String city, String state, String zip, int shift, double hourlyPay)
    {
        super(name, address, city, state, zip);
        
        this.shift = shift;
        this.hourlyPay = hourlyPay;
    }
    
    public String toString()
    {
        String shiftString = " ";
        if (shift == 1)
        {
            shiftString = "Day";
        }
        else
        {
            shiftString = "Night";
        }
        
        return "\nName: " + name + 
                "\nAddress: " + address + 
                "\nCity: " + city + 
                "\nState: " + state + 
                "\nZip: " + zip + 
                "\nShift: " + shiftString + 
                "\nHourly Pay: " + hourlyPay;
        
    }
}


public class Project2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String name, address, city, state, zip;
        int shift;
        double pay;
     

        
        System.out.print("Enter the name of the employee: ");
        name = scan.nextLine();
        
        System.out.print("Enter the address of the employee: ");
        address = scan.nextLine();
        
        System.out.print("Enter the city of the employee: ");
        city = scan.nextLine();
        
        System.out.print("Enter the state of the employee: ");
        state = scan.nextLine();
        
        System.out.print("Enter the zip of the employee: ");
        zip = scan.nextLine();
        
        Employee emp1 = new Employee(name, address, city, state, zip);
        
        System.out.print("\n\n" + name + " info\n-----------------------");
        System.out.print(emp1);
        
        System.out.print("\n\nEnter the name of the 2nd employee: ");
        name = scan.nextLine();
        
        System.out.print("Enter the address of the 2nd employee: ");
        address = scan.nextLine();
        
        System.out.print("Enter the city of the 2nd employee: ");
        city = scan.nextLine();
        
        System.out.print("Enter the state of the 2nd employee: ");
        state = scan.nextLine();
        
        System.out.print("Enter the zip of the 2nd employee: ");
        zip = scan.nextLine();
        
        System.out.println("Enter the shift of the 2nd employee: ");
        shift = scan.nextInt();
        
        System.out.println("Enter the hourly pay of the 2nd employee: ");
        pay = scan.nextDouble();
        
        ProductionWorker pW = new ProductionWorker(name, address, city, state, zip, shift, pay);
        
        System.out.print("\n\n" + name + " info\n-----------------------");
        System.out.print(pW);
        
        
    }
}
