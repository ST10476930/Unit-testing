/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package group_2.automated_testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author anele
 */
public class EmployeeTest {
    //constructor
    public EmployeeTest() {
    }
   //example Test method
    
     @Test
    public void testCheckEmployeeID_Pass() {
        //create a instance of employee
        Employee e = new Employee("ST10111", 5, 73.92);
        
        //create a variable to the condition been tested 
        boolean condition = e.checkEmployeeID();
        
        Assertions.assertTrue(condition);
        
    }
    
    
    
    
    
    
    
    
    
    @Test
    public void testCheckEmployeeID_Fail() {
        //create a instance of employee
        Employee e = new Employee("123", 5, 73.92);
        
        //create a variable to the condition been tested 
        boolean condition = e.checkEmployeeID();
        
        Assertions.assertFalse(condition);
        
    }

    @Test
    public void testCalculateNetSalary() {
    }
    //create a Assert Equals to the CalculateNetSalary
   //create a Instance of Employee
    Employee e = new Employee("ST10111", 7, 20.99);
    
    //create a expected --> what the method is expected to return 
    double expected = 140;
    
    double actual = e.calculateNetSalary();
    
    Assertions.assertEquals(expected, actual);
    
}
