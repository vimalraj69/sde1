package com.selfpractice;

public class Employee1 {
    private int id;
    private String name;
    private int age;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id >0) {
            this.id = id;
        } else {
            System.out.println("Invalid ID");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name!= null) {
            this.name = name;
        } else {
            System.out.println("Invalid name");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age> 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary>= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary.");
        }
    }

    public void raiseSalary(double percent) {
        if (percent > 0) {
            this.salary += this.salary * (percent / 100);
        } else {
            System.out.println("Invalid percentage.");
        }
    }

    public void displayInfo() {
        System.out.println("ID: " +id);
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Salary: " +salary);
    }

    public static void main(String[] args) {
        Employee1 emp = new Employee1();
        emp.setId(1);
        emp.setName("vimal");
        emp.setAge(22);
        emp.setSalary(100000);

        emp.displayInfo();

        
    }
}

