package Solid;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class App {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");

        Employee employee1 = new Employee("Oleg", ft.parse("1999-10-28"), 50000);
        System.out.println(Salary.calculateNetSalary(employee1.getBaseSalary()));
        System.out.println(employee1.getEmpInfo());

        Vehicle car1 = new Car(250);
        System.out.println(car1.getType());
    }
}
