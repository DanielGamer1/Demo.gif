package entities;

import java.util.UUID;

public class Employee {
    private String name;
    private String dateBirth;
    private UUID maNV = UUID.randomUUID();
    private static String companyName ="Nestech";
    private String position="Employee";
    private long baseSalary=500;

    public Employee(String name,String dateBirth){
        this.name = name;
        this.dateBirth = dateBirth;
    }
    public String getName(){
        return this.name;
    }
    public String getDateBirth(){
        return this.dateBirth;
    }
    public UUID getMaNV(){
        return this.maNV;
    }
    public String setName(String name){
        if(!name.equals("")){
            this.name =name;
            return this.name;
        }
        return this.name = this.getName();
    }
    public String setDateBirth(String dateBirth){
        if(!dateBirth.equals("")){
            this.dateBirth = dateBirth;
            return this.dateBirth;
        }
        return  this.dateBirth = this.getDateBirth();
    }
    public UUID setMaNV(UUID maNV) {
       return this.maNV = maNV;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setBaseSalary(long baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getPosition() {
        return position;
    }

    public long getBaseSalary() {
        return baseSalary;
    }
    public long caculateSalary() {
        return  getBaseSalary();
    }
}
