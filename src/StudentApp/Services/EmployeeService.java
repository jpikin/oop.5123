package StudentApp.Services;

import StudentApp.Domen.Employee;
import StudentApp.Domen.PersonComparator;
import StudentApp.Domen.Student;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements iPersonService<Employee>{
    private int count;
    private List<Employee> employees;
    public  EmployeeService(){
        this.employees = new ArrayList<>();
    }
    @Override
    public List getAll() {
        return employees;
    }

    @Override
    public void create(String name, int age) {
        Employee epls = new Employee(name, age, "basic");
        count++;
        employees.add(epls);
    }
    public void sortByFio(){
        PersonComparator<Employee> perComp = new PersonComparator<Employee>();
        employees.sort(perComp);
    }
}
