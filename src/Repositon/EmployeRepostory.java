package Repositon;

import entities.Employee;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public interface EmployeRepostory {
    List<Employee> employeeList = new LinkedList<>();
    public void addEmployee(Employee e);
    public void RemoveEmployeee(Employee e);
    List<Employee> getEmployeeList();
    public void promote(Employee e,int option);
}
