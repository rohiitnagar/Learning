package Generics;

import Generics.Model.Developer;
import Generics.Model.Employee;

public class Covarience {
    public static void main(String[] args) {
        Employee[] employees = {new Employee(), new Employee()};
        printArray(employees);

        Developer[] developer = {new Developer(), new Developer()};
        printArray(developer);

    }

    public static void printArray(Employee[] employees){
        for(Employee employee : employees){
            System.out.println(employee);
        }
    }
}
