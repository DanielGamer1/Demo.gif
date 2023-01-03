package Repositon;

import entities.DevTeamDepartment;
import entities.Employee;
import entities.HumanResourceDepartmant;
import entities.SaleDepartment;

import java.util.List;

public class DepartmentRepostoryImpent implements DepartmentRepostory {

    @Override
    public void addEmployeeToDepartment(int option,Employee e){
        switch (option){
            case 1:
                lstSaleEmployee.add(e);
                break;
            case 2:
                lstHrEmployee.add(e);
                break;
            case 3:
                lstDevEmployee.add(e);
            default:
                break;
        }
    }
    @Override
    public List<Employee> printListEmployee(int i){
        switch (i){
            case 1:
                return lstSaleEmployee;
            case 2:
                return lstHrEmployee;
            case 3:
                return lstDevEmployee;
            default:
                return null;
        }
    }
}
