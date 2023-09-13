package Solid.Employee;

public class Salary {
    private int baseSalary;
    public Salary(int baseSalary){
        this.baseSalary = baseSalary;
    }
    public static int calculateNetSalary(int baseSalary) {
        int tax = (int) (baseSalary * 0.25);//calculate in otherway
        return baseSalary - tax;
    }
    public int getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(int baseSalary){
        this.baseSalary = baseSalary;
    }
}
