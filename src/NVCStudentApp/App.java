package NVCStudentApp;

import NVCStudentApp.Controler.ControllerClass;
import NVCStudentApp.Controler.Interfaces.iGetModel;
import NVCStudentApp.Controler.Interfaces.iGetView;
import NVCStudentApp.Model.ModelClassList;
import NVCStudentApp.View.ViewClass;
import StudentApp.Domen.Student;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student s1 = new Student("Serg", 21);
        Student s2 = new Student("Mark", 21);
        Student s3 = new Student("Oleg", 21);
        Student s4 = new Student("Maks", 21);
        Student s5 = new Student("Olga", 21);
        Student s6 = new Student("Eva", 21);
        Student s7 = new Student("Margo", 21);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);

//        ModelClassList modelList = new ModelClassList(students);
//        ViewClass view = new ViewClass();

        iGetModel modelList = new ModelClassList(students);
        iGetView view = new ViewClass();

        ControllerClass controller = new ControllerClass(modelList,view);

//        controller.update();
        controller.run();
//        view.printAllStudents(students);
    }
}
