package Repositon;

import entities.Employee;
import java.util.LinkedList;
import java.util.List;

public interface DepartmentRepostory {
    List<Employee> lstSaleEmployee=new LinkedList<>();
    List<Employee> lstHrEmployee=new LinkedList<>();
    List<Employee> lstDevEmployee=new LinkedList<>();


    void addEmployeeToDepartment(int option,Employee e);

    List<Employee> printListEmployee(int i);
}
