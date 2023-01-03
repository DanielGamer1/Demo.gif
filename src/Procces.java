import Controler.DepartmentController;
import Controler.EmployeeControl;

import java.util.Scanner;

public class Procces {
    public static void printMenu(){
        System.out.println("---------MENU----------");
        System.out.println("0.stop chương trình");
        System.out.println("1.Thêm nhân viên");
        System.out.println("2.Xóa nhân viên");
        System.out.println("3.Sửa thông tin nhân viên");
        System.out.println("4.In ra danh sách nhân viên");
        System.out.println("5.Thêm nhân viên vào 1 phòng ban");
        System.out.println("6.In ra ds nhân sự 1 phòng ban");
        System.out.println("7.Thăng chức cho 1 nhân viên");
        System.out.println("8.Tính tiền lương");
        System.out.println("--------------------------");
    }
    public static void handleRequest(){
        Scanner scanner=new Scanner(System.in);

        EmployeeControl employeeController=new EmployeeControl(scanner);
        DepartmentController departmentController=new DepartmentController(scanner);

        while (true){
            printMenu();
            System.out.println("enter option");
            int option=Integer.parseInt(scanner.nextLine());;
            switch (option){
                case 0:
                    System.out.println("bạn chọn dừng chương trình");
                    return;
                case 1:
                    System.out.println("bạn chọn thêm nhân viên");
                    employeeController.addNewEmployee();
                    break;
                case 2:
                    System.out.println("bạn chọn xóa 1 nhân viên");
                    employeeController.deleteEmployee();
                    break;
                case 3:
                    System.out.println("Bạn đã chọn sửa thông tin nhân viên");
                    employeeController.changeEmployee();
                case 4:
                    System.out.println("bạn chọn in ra danh sách nhân viên");
                    employeeController.printLstEmployee();
                    break;
                case 5:
                    System.out.println("Bạn đã chọn thêm nhân viên vào 1 phòng ban");
                    //departmentController.addEmployee(employeeController.getEmployeeList());
                    break;
                case 6:
                    System.out.println("Bạn đã chọn in ra danh sách nhn viên của 1 phòng ban");
                    departmentController.printEmployeeList();
                    break;
                case 7:
                    System.out.println("Bạn đã chọn thăng chức cho nhân viên");
                    employeeController.promote();
                    break;
                case 8:
                    System.out.println("Bạn đã chọn tính tiền lương cho nhân viên");
                    employeeController.caculateSalary();
                    break;
                default:
                    System.out.println("chon sai");
            }
        }
    }
}
