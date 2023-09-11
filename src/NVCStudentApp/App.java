package NVCStudentApp;

import NVCStudentApp.Controler.ControllerClass;
import NVCStudentApp.Controler.Interfaces.iGetModel;
import NVCStudentApp.Controler.Interfaces.iGetView;
import NVCStudentApp.Model.ModelClassHash;
import NVCStudentApp.Model.ModelClassList;
import NVCStudentApp.View.ViewClass;
import NVCStudentApp.View.ViewEng;
import NVCStudentApp.Model.Core.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) {
        iGetView view;
//        List<Student> students = new ArrayList<>();
        HashMap<Long,Student> students = new HashMap<>();
        Student s1 = new Student("Serg", 21);
        Student s2 = new Student("Mark", 21);
        Student s3 = new Student("Oleg", 21);
        Student s4 = new Student("Maks", 21);
        Student s5 = new Student("Olga", 21);
        Student s6 = new Student("Eva", 21);
        Student s7 = new Student("Margo", 21);

//        students.add(s1);
//        students.add(s2);
//        students.add(s3);
//        students.add(s4);
//        students.add(s5);
//        students.add(s6);
//        students.add(s7);
        students.put(s1.getID(), s1);
        students.put(s2.getID(), s2);
        students.put(s3.getID(), s3);
        students.put(s4.getID(), s4);
        students.put(s5.getID(), s5);
        students.put(s6.getID(), s6);
        students.put(s7.getID(), s7);

        iGetModel hashList = new ModelClassHash(students);
//        iGetModel modelList = new ModelClassList(students);
        if (ControllerClass.lang == 1) {
            view = new ViewClass();
        } else {
            view = new ViewEng();
        }

//        ControllerClass controller = new ControllerClass(modelList, view);
        ControllerClass controller = new ControllerClass(hashList, view);

//        controller.update();
        controller.run();

    }
}
