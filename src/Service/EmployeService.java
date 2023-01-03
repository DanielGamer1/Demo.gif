package Service;

import entities.Employee;

import java.util.Scanner;
import java.util.UUID;
public interface EmployeService {
    public void addEmployee(String name,String dateBirth);
    public void removeEmployee(UUID uid);
    public void printLstEmployee();
    public void changeEmployee(UUID uid);
    public void promote(UUID uid);
    public void caculateSalary(UUID uid);
}
