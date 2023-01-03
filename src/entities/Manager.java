package entities;

import java.util.UUID;
public class Manager extends Employee {

    public Manager(String name, String dateBirth,UUID uid) {
        super(name, dateBirth);
    }
    @Override
    public long caculateSalary(){
        return getBaseSalary()*2;
    }
}
