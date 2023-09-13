package Solid;

public class Salary {

    public static int calculateNetSalary(int baseSalary) {
        int tax = (int) (baseSalary * 0.25);//calculate in otherway
        return baseSalary - tax;
    }
}
