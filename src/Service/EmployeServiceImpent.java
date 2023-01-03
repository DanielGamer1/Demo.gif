package Service;

import Repositon.EmployeRepostory;
import Repositon.EmployeRepostoryImpent;
import entities.Director;
import entities.Employee;
import entities.Manager;

import java.util.Scanner;
import java.util.UUID;

public class EmployeServiceImpent implements EmployeService {
    private EmployeRepostory employeRepostory = new EmployeRepostoryImpent();
    private Scanner scan = new Scanner(System.in);;

    @Override
    public void addEmployee(String name, String dateBirth) {
        Employee employee = new Employee(name,dateBirth);
        employeRepostory.addEmployee(employee);
    }

    @Override
    public void removeEmployee(UUID uid) {
        for(Employee e:employeRepostory.getEmployeeList()){
            if(e.getMaNV().equals(uid)){
                System.out.println("Ban co chac muon xoa Y/N");
                String comfirmation = scan.nextLine();
                if(comfirmation.equals("y") || comfirmation.equals("Y")){
                    employeRepostory.RemoveEmployeee(e);
                    return;
                }
                return;
            }
        }
        System.out.println("Khong co nhan vien nay");
        System.out.println("--------------------------");
    }

    @Override
    public void printLstEmployee() {
        for(Employee e:employeRepostory.getEmployeeList()){
            System.out.printf("MANV:%s\n", e.getMaNV().toString());
            System.out.printf("Tên:%s\n",e.getName());
            System.out.printf("Năm sinh %s\n",e.getDateBirth());
            System.out.printf("Position %s\n",e.getPosition());
            System.out.println("---------------------------------");
        }
    }
    @Override
    public void changeEmployee(UUID uid) {
        for(Employee e:employeRepostory.getEmployeeList()){
            if(e.getMaNV().equals(uid)){
                System.out.println("Nhap ten nhan vien");
                e.setName(scan.nextLine());
                System.out.println("Nhap nam sinh");
                e.setDateBirth(scan.nextLine());
                System.out.println("da luu");
                System.out.println("----------------------------");
                return;
            }
            return;
        }
        System.out.println("Khong co nhan vien nay");
        System.out.println("----------------------------------");
    }
    @Override
    public void promote(UUID uid){
        for(Employee e:employeRepostory.getEmployeeList()){
            if(e.getMaNV().equals(uid)){
                System.out.println("1.Director , 2.Manager");
                int option=Integer.parseInt(scan.nextLine());
                employeRepostory.promote(e,option);
            }
        }
    }
    @Override
    public void caculateSalary(UUID uid){
        for(Employee e:employeRepostory.getEmployeeList()){
            if(e.getMaNV().equals(uid)){
                System.out.printf("Name %s\n",e.getName());
                System.out.printf("Salary %d\n",e.caculateSalary());
            }
            else {
                System.out.println("Nhan vien khong ton tai");
            }
        }
    }
}
