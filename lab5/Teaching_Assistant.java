/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author Computer Science
 */
public abstract class Teaching_Assistant implements Staff {
     String Name;
    int Age;
    int ID;
    String Address;
    int phone;
    public void data(String name , int age,int id,String address,int phone)
    {
        Name=name;
        Age=age;
        ID=id;
        Address=address;
        this.phone=phone;
    }
    public void GetSalary()
    {
       System.out.println("the salary of  Teaching_Assistantis: 2000 ");
    }
    public int GetYears_of_work()
    {
        return 10;
    }
    public void Print_data()
    {
         System.out.println("Doctor_Name : " + Name);
         System.out.println("Doctor_ID : " + ID);
         System.out.println("Doctor_Age : " + Age);
         System.out.println("Doctor_Address : " + Address);
         System.out.println("Doctor_phone : " + phone);
    
}
    
    
}
