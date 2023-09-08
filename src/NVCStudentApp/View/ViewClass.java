package NVCStudentApp.View;

import NVCStudentApp.Controler.Interfaces.iGetView;
import StudentApp.Domen.Student;

import java.util.List;
import java.util.Scanner;

public class ViewClass implements iGetView {
    public void printAllStudents(List<Student> students){
        System.out.println("Список студентов");
        for (Student s: students)
        {
            System.out.println(s);
        }
        System.out.println("---------------------");
    }
    public String promt(String message){
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }
}
