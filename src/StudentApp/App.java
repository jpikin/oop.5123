package StudentApp;

import StudentApp.Domen.Student;
import StudentApp.Domen.StudentGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Сергей", 23);
        Student s3 = new Student("Олег", 22);
        Student s4 = new Student("Игорь",  23);
        Student s5 = new Student("Даша",  23);
        Student s6 = new Student("Лена",  23);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        StudentGroup g5123 = new StudentGroup(listStud, 5123);
        System.out.println(g5123);
        for (Student s: g5123){
            System.out.println(s);
        }
        Collections.sort(g5123.getGroup());
        for (Student s: g5123){
            System.out.println(s);
        }
    }
}
