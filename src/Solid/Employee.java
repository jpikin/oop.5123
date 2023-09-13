package Solid;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee{
    private String name;
    private Date dateOfBirth;
    private int baseSalary;

    public Employee(String name, Date dateOfBirth, int baseSalary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.baseSalary = baseSalary;
    }

    public String getEmpInfo() {
        return "name - " + name + " , date of birth - " + dateOfBirth.toString();
    }

    public int getBaseSalary() {
        return baseSalary;
    }
}
