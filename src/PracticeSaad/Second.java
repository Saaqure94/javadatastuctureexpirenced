//Practice here

package PracticeSaad;


import lists.classes.Employee;

import java.util.ArrayList;
import java.util.List;

import strings.*;

public class Second {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));
        employeeList.add(new Employee("Saad", "Qureshi", 7777));

//        for(Employee i:employeeList){
//            System.out.println(i.getId() + " " + i.getFirstName() + " " + i.getLastName());
//        }

         //employeeList.forEach(employee -> System.out.println(employee.getFirstName()));

//        List<String> listToReverse = new ArrayList<String>();
//        listToReverse.add("saad");
//        listToReverse.add("madam");
//        listToReverse.add("sir");

//         System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
//         System.out.println(employeeList.indexOf(new Employee("Mary", "Smith", 22)));
//         employeeList.remove(2);
//         employeeList.forEach(employee -> System.out.println(employee.getFirstName()));


    }
}
