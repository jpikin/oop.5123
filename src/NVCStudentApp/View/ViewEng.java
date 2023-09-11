package NVCStudentApp.View;

import NVCStudentApp.Controler.Interfaces.iGetView;
import NVCStudentApp.Model.Core.Student;

import java.util.List;
import java.util.Scanner;

public class ViewEng implements iGetView {
    public void printAllStudents(List<Student> students){
        System.out.println("-----Student list-----");
        for (Student s: students)
        {
            System.out.println(s);
        }
        System.out.println("-----------------------");
    }
    public String promt(String message){
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }


}
