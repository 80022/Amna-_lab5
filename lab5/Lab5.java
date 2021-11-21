/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
import java.util.Scanner;

/**
 *
 * @author Computer Science
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input =new Scanner(System.in);
       Staff_factory stf=new Staff_factory();
       System.out.println("enter the staff_name");
       String str=input.nextLine();
       Staff S =stf.get_staff(str);
       S.data("Ahmed", 30, 123, "Minia", 0112345);
       S.GetSalary();
       System.out.println(S.GetYears_of_work());
       
       
        
    }
    
}
