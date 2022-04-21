package com.company;

import java.util.Objects;

public class Employee {
    private int empNumber;
    private String name;
    private double salary;
    private String department;

    public Employee(int empNumber, String name, double salary, String department) {
        this.empNumber = empNumber;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }


    public int getEmpNumber() {
        return empNumber;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
    // neue methode soll überprufen ob zwei mitarbeiter im gleichen department arbeiten
    // true zurückliefern falls ja, sonst false

    public boolean compareDepartment(Employee e) {

        if (this.department.equals(e.department)) {
            return true;
        } else {
            return false;
        }
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNumber=" + empNumber +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empNumber == employee.empNumber && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empNumber, department);
    }
}

