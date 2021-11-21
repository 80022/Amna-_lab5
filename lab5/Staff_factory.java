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
public class Staff_factory {
      public Staff get_staff (String staff_name)
    {
        if(staff_name.equalsIgnoreCase("Doctor"))
        {
            return new Doctor() ;
        }
        else if(staff_name.equalsIgnoreCase("Teaching_Assistant"))
        {
            return new Teaching_Assistant();
        }
        return null;
    }
        
    

    }

