package Solid.Employee;


import java.util.Date;

public class Employee{
    private String name;
    private Date dateOfBirth;



    public Employee(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;


    }
    public String getEmpInfo() {
        return "name - " + name + " , date of birth - " + dateOfBirth.toString();
    }
    public String getName(){
        return this.name;
    }


}
