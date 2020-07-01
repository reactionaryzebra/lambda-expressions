package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        new Thread(()-> {
            System.out.println("Printing from the Runnable");
            System.out.println("line 2");
            System.out.println("line 3");
        }).start();

        Employee justin = new Employee("Justin Reznik", 30);
        Employee sasha = new Employee("Sasha Fierece", 36);
        Employee marcus = new Employee("Marcus Pierson", 22);

        List<Employee> employees = new ArrayList<>();
        employees.add(justin);
        employees.add(sasha);
        employees.add(marcus);

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return employee1.getName().compareToIgnoreCase(employee2.getName());
//            }
//        });

        Collections.sort(employees, (employee1, employee2) ->
                employee1.getName().compareToIgnoreCase(employee2.getName()));

        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }

    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}