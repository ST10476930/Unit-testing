/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_2.automated_testing;

/**
 *
 * @author anele
 */
public class Employee {
    
    //create Instance Variables
    private String employeeID;
    private int hoursWorked;
    private double hourlyRate;
    
    //create a constructor
    public Employee(String empID, int hoursWorked, double hourlyRate) {
        this.employeeID = empID;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        
    }
    
    //create a Method to verify employee ID
    public boolean checkEmployeeID() {
        return employeeID.contains("ST") && employeeID.length() >= 5;
    }
    
}
