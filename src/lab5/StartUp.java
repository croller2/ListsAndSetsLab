
package lab5;

import lab3.*;
import lab2.*;
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
        
//Lab5 – Use a Set to transform the list you created in Lab3, by removing any
//duplicates. Perform a loop over the new list with output to confirm the
//duplicates are gone. Show your work to your instructor when done
        
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Roller" , "Chris" , "123-45-6789"));
        empList.add(new Employee("Hyde" , "Steven" , "678-123-4578"));
        empList.add(new Employee("Wazowski" , "Mike" , "987-45-4321"));
        empList.add(new Employee("Roller" , "Chris" , "123-45-6789"));
        empList.add(new Employee("Roller" , "Chris" , "123-45-6789"));
        empList.add(new Employee("Roller" , "Chris" , "123-45-6789"));
        
        System.out.println("First List: ");
        for(Employee e: empList){
            System.out.println(e.toString());
        }
        System.out.println();
        
        

        Set<Employee> empSet = new LinkedHashSet<>(empList);

        empList = new ArrayList<>(empSet);
        
        
        System.out.println("Second List: ");
        for(Employee e : empListTwo){
            System.out.println(e.toString());
        }
        
     
        
        
    }
}
