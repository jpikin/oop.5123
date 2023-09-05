package StudentApp.Services;

import StudentApp.Domen.Employee;
import StudentApp.Domen.PersonComparator;
import StudentApp.Domen.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements iPersonService<Student> {
    private int count;
    private List<Student> students;
    public  StudentService(){
        this.students = new ArrayList<>();
    }

    @Override
    public List getAll() {
        return students;
    }

    @Override
    public void create(String name, int age) {
        Student stud = new Student(name, age);
        count++;
        students.add(stud);
    }
    public void sortByFio(){
        PersonComparator<Student> perComp = new PersonComparator<Student>();
        students.sort(perComp);
    }
}
