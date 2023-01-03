package Controler;

import Service.EmployeService;
import Service.EmployeServiceImpent;
import entities.Director;
import entities.Employee;
import entities.Manager;

import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.UUID;

public class EmployeeControl {
    private EmployeService employeService = new EmployeServiceImpent();
    private Scanner scan;
    public EmployeeControl(Scanner scan){
        this.scan = scan;
    }
    public void printLstEmployee(){
        employeService.printLstEmployee();
    }
    public void addNewEmployee(){
        System.out.println("Nhap ten nhan vien");
        String name = scan.nextLine();
        System.out.println("Nhap nam sinh");
        String dateBirth = scan.nextLine();
        employeService.addEmployee(name,dateBirth);
    }
    public void deleteEmployee(){
        System.out.println("Nhap ma nhan vien muon xoa");
        UUID uid= UUID.fromString(scan.nextLine());
        employeService.removeEmployee(uid);
    }
    public void changeEmployee() {
        System.out.println("nhap MANV muon thay doi");
        UUID uid=UUID.fromString(scan.nextLine());
        employeService.changeEmployee(uid);
    }
    public void promote(){
        System.out.println("Nhap ma nhan vien");
        UUID uid =UUID.fromString(scan.nextLine());
        employeService.promote(uid);
    }
    public void caculateSalary(){
        System.out.println("nhap ma nhan vien");
        UUID uid = UUID.fromString(scan.nextLine());
        employeService.caculateSalary(uid);
    }
}
