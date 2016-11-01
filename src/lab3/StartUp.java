/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import lab2.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chris
 */
public class StartUp {
    public static void main(String[] args) {
        
    // 1. ) Create a list of 4 Employee objects, making sure that at least one is
    //a duplicate (based on your rules for equality)
        
        List employeeList = new ArrayList();
        employeeList.add(new Employee("Roller" , "Chris" , "123-45-6789"));
        employeeList.add(new Employee("Hyde" , "Steven" , "678-123-4578"));
        employeeList.add(new Employee("Wazowski" , "Mike" , "987-45-4321"));
        employeeList.add(new Employee("Roller" , "Chris" , "123-45-6789"));
        
        
    //2.) Retrieve one object from the list. Output its toString() value to the
    //console.
        
        System.out.println("Part Two: ");
        Employee emp = (Employee) employeeList.get(0);
        System.out.println(emp.toString());
        System.out.println();
        
    //3.)Loop over each item in the list, retrieve and item and output its
    //toString() value to the console. Do both an old style for-loop and a
    //new style for-loop.
        
        System.out.println("Part 3: ");
        System.out.println("Employee List:");
        for(int i=0; i < employeeList.size(); i++) {
            emp = (Employee)employeeList.get(i);
            System.out.println(emp.toString());
        }
        System.out.println();
        
        for(Object e : employeeList){
            emp = (Employee)e;
            System.out.println(emp.toString());
        }
        
        System.out.println();
        
    //4.) Remove an item from the list. Perform a loop with output to
    //confirm it’s gone. Output the size of the list after removal.
        
        System.out.println("Part 4:");
        employeeList.remove(1);
        System.out.println("Employee List Removed:");
        for(int i=0; i < employeeList.size(); i++) {
            emp = (Employee)employeeList.get(i);
            System.out.println(emp.toString());
        }
        
        System.out.println("Size = " + employeeList.size());
        System.out.println();
        
    // 5.) Insert a new Employee object into the list. Perform a loop with
    //output to confirm it’s there. Output the size of the list after
    //insertion
    
        System.out.println("Part 5: ");   
        employeeList.add(2, new Employee("Rogers" , "Steve" , "345-76-8256"));
        for(int i=0; i < employeeList.size(); i++) {
            emp = (Employee)employeeList.get(i);
            System.out.println(emp.toString());
        }
        System.out.println("Size = " + employeeList.size());
        System.out.println();
        
        
    //6.) Replace an item in the list with a new Employee item. Perform a
    //loop with output to confirm it’s there.
    
        System.out.println("Part 6: ");
        employeeList.set(2, new Employee("Replacement" , "Employee", "145-54-9635"));
        for(int i=0; i < employeeList.size(); i++) {
            emp = (Employee)employeeList.get(i);
            System.out.println(emp.toString());
        }
        
        
        
    // Lab3 – Repeat the steps in lab2, except this time you may use generics. Do
    // not delete or modify your code in lab2, add to the code for this lab. Show your
    // instructor your work after completing it.
    
    // 1. ) Create a list of 4 Employee objects, making sure that at least one is
    //a duplicate (based on your rules for equality)
        
        List<Employee> empListTwo = new ArrayList<>();
        empListTwo.add(new Employee("Roller" , "Chris" , "123-45-6789"));
        empListTwo.add(new Employee("Hyde" , "Steven" , "678-123-4578"));
        empListTwo.add(new Employee("Wazowski" , "Mike" , "987-45-4321"));
        empListTwo.add(new Employee("Roller" , "Chris" , "123-45-6789"));
    
    //2.) Retrieve one object from the list. Output its toString() value to the
    //console.
        
        System.out.println("Part Two: ");
        Employee empTwo =  empListTwo.get(0);
        System.out.println(empTwo.toString());
        System.out.println();
    
    //3.)Loop over each item in the list, retrieve and item and output its
    //toString() value to the console. Do both an old style for-loop and a
    //new style for-loop.
        
        System.out.println("Part 3: ");
        System.out.println("Employee List:");
        for(int i=0; i < empListTwo.size(); i++) {
            emp = empListTwo.get(i);
            System.out.println(emp.toString());
        }
        System.out.println();
        
        for(Employee e : empListTwo){
            System.out.println(e.toString());
        }
        System.out.println();
        
        
        
    //4.) Remove an item from the list. Perform a loop with output to
    //confirm it’s gone. Output the size of the list after removal.
        
        System.out.println("Part 4:");
        empListTwo.remove(1);
        System.out.println("Employee List Removed:");
        for(Employee e : empListTwo){
            System.out.println(e.toString());
        }
        
        System.out.println("Size = " + empListTwo.size());
        System.out.println();
        
    // 5.) Insert a new Employee object into the list. Perform a loop with
    //output to confirm it’s there. Output the size of the list after
    //insertion
    
        System.out.println("Part 5: ");   
        empListTwo.add(2, new Employee("Rogers" , "Steve" , "345-76-8256"));
        for(Employee e : empListTwo){
            System.out.println(e.toString());
        }
        System.out.println("Size = " + employeeList.size());
        System.out.println();
                
                
    //6.) Replace an item in the list with a new Employee item. Perform a
    //loop with output to confirm it’s there.
    
        System.out.println("Part 6: ");
        empListTwo.set(2, new Employee("Replacement" , "Employee", "145-54-9635"));
        for(Employee e : empListTwo){
            System.out.println(e.toString());
        }
    } 
}
