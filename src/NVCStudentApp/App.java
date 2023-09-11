package NVCStudentApp;

import NVCStudentApp.Controler.ControllerClass;
import NVCStudentApp.Controler.Interfaces.iGetModel;
import NVCStudentApp.Controler.Interfaces.iGetView;
import NVCStudentApp.Model.ModelClassList;
import NVCStudentApp.View.ViewClass;
import NVCStudentApp.View.ViewEng;
import NVCStudentApp.Model.Core.Student;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        iGetView view;
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


        iGetModel modelList = new ModelClassList(students);
        if (ControllerClass.lang == 1) {
            view = new ViewClass();
        } else {
            view = new ViewEng();
        }

        ControllerClass controller = new ControllerClass(modelList, view);

//        controller.update();
        controller.run();

    }
}
