/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author chris
 */
public class StartUp {
    public static void main(String[] args) {

    //Lab4 – Repeat the steps in lab3, but use a Set and and LinkedHashSet or
    //HashSet implementation instead of the list. You won’t be able to use the get()
    //method to retrieve and item, because a Set does not have that method. Is there
    //anything else that you can’t do? Show your work to your instructor when
    //done.
    
    // 1. ) Create a set of 4 Employee objects, making sure that at least one is
    //a duplicate (based on your rules for equality)
        
        Set<Employee> empLinkedHashSet = new LinkedHashSet<>();
        empLinkedHashSet.add(new Employee("Roller" , "Chris" , "123-45-6789"));
        empLinkedHashSet.add(new Employee("Hyde" , "Steven" , "678-123-4578"));
        empLinkedHashSet.add(new Employee("Wazowski" , "Mike" , "987-45-4321"));
        empLinkedHashSet.add(new Employee("Roller" , "Chris" , "123-45-6789"));
    
    //2.) Retrieve one object from the set. Output its toString() value to the
    //console.
    
    // ---Can't Do
    
    //3.)Loop over each item in the list, retrieve and item and output its
    //toString() value to the console. Do both an old style for-loop and a
    //new style for-loop.
        
    
    // Can't Do old style
        System.out.println("Part 3: ");
        System.out.println("Employee List:");
        for(Employee e : empLinkedHashSet){
            System.out.println(e.toString());
        }
        System.out.println();
        
        
        
    //4.) Remove an item from the list. Perform a loop with output to
    //confirm it’s gone. Output the size of the list after removal.
        
        System.out.println("Part 4:");
        

        Employee removeEmp = new Employee("Wazowski" , "Mike" , "987-45-4321");
        empLinkedHashSet.remove(removeEmp);
        System.out.println("Employee List Removed:");
        for(Employee e : empLinkedHashSet){
            System.out.println(e.toString());
        }
        
        System.out.println("Size = " + empLinkedHashSet.size());
        System.out.println();
        
    // 5.) Insert a new Employee object into the list. Perform a loop with
    //output to confirm it’s there. Output the size of the list after
    //insertion
    
        System.out.println("Part 5: ");   
        empLinkedHashSet.add(new Employee("Rogers" , "Steve" , "345-76-8256"));
        for(Employee e : empLinkedHashSet){
            System.out.println(e.toString());
        }
        System.out.println("Size = " + empLinkedHashSet.size());
        System.out.println();
                
    } 
}
