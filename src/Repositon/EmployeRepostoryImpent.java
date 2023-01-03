package Repositon;

import entities.Director;
import entities.Employee;
import entities.Manager;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class EmployeRepostoryImpent implements EmployeRepostory {

    @Override
    public void addEmployee(Employee e) {
        employeeList.add(e);
    }

    @Override
    public void RemoveEmployeee(Employee e) {
        employeeList.remove(e);
        System.out.println("da xoa");
        System.out.println("--------------------------");
    }

    @Override
    public List<Employee> getEmployeeList() {
        return employeeList;
    }
    @Override
    public void promote(Employee e,int option){
        switch (option){
            case 1:
                Director d= new Director(e.getName(),e.getDateBirth(),e.getMaNV());
                d.setPosition("Director");
                employeeList.set(employeeList.indexOf(e),d);
                System.out.println("Da luu");
                return;
            case 2:
                Manager m= new Manager(e.getName(),e.getDateBirth(),e.getMaNV());
                m.setPosition("Manager");
                employeeList.set(employeeList.indexOf(e),m);
                System.out.println("Da luu");
                return;
            default:
                System.out.println("Khong co lua chon nay");
        }
    }
}
