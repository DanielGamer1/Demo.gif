package entities;

import java.util.UUID;

public class Director extends Employee {

    public Director(String name, String dateBirth,UUID uid) {
        super(name, dateBirth);
    }
    @Override
    public long caculateSalary(){
        return getBaseSalary()*3;
    }
}
