package Controler;

import entities.*;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;
public class DepartmentController {
    Scanner scan;
    SaleDepartment saleDepartment;
    HumanResourceDepartmant humanResourceDepartmant;
    DevTeamDepartment devTeamDepartment;
    public DepartmentController(Scanner scan){
        this.scan=scan;
        saleDepartment = new SaleDepartment();
        humanResourceDepartmant = new HumanResourceDepartmant();
        devTeamDepartment = new DevTeamDepartment();
    }
    public void addEmployee(List<Employee> employeeList){
        System.out.println("Nhap ma nhan vien moi");
        UUID uid = UUID.fromString(scan.nextLine());
        System.out.println("Ban muon them nhan vien vao phong ban nao");
        System.out.println("1.sale,2.HR,3.Dev");
        int option = Integer.parseInt(scan.nextLine());
        switch (option){
            case 1:
                for(Employee e: employeeList){
                    if(e.getMaNV().equals(uid)){
                        saleDepartment.addEmployeeToDepartment(e);
                        System.out.println("Da them");
                        return;
                    }
                }
                System.out.println("Khong co nhan vien nay");
                break;
            case 2:
                for(Employee e:employeeList){
                    if(e.getMaNV().equals(uid)){
                        humanResourceDepartmant.addEmployeeToDepartment(e);
                        System.out.println("Da them");
                        return;
                    }
                }
                System.out.println("Khong co nhan vien nay");
                break;
            case 3:
                for(Employee e:employeeList){
                    if(e.getMaNV().equals(uid)){
                        devTeamDepartment.addEmployeeToDepartment(e);
                        System.out.println("Da them");
                        return;
                    }
                }
                System.out.println("Khong co nhan vien nay");
                break;
            default:
                System.out.println("Khong co phong ban nay");
        }
    }
    public void printEmployeeList(){
        System.out.println("Chon phong ban");
        System.out.println("1.Sale,2.HR,3.Dev");
        int option=Integer.parseInt(scan.nextLine());
        switch (option){
            case 1:
                saleDepartment.printLstEmployee();
                break;
            case 2:
                humanResourceDepartmant.printLstEmployee();
                break;
            case 3:
                devTeamDepartment.printLstEmployee();
                break;
            default:
                System.out.println("Khong co lua chon nay");
        }
    }
}
