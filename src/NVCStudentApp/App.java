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

        Student s1 = new Student("Serg", 20);
        Student s2 = new Student("Mark", 21);
        Student s3 = new Student("Oleg", 22);
        Student s4 = new Student("Maks", 19);
        Student s5 = new Student("Olga", 20);
        Student s6 = new Student("Eva", 21);
        Student s7 = new Student("Margo", 23);
        Student s8 = new Student("Kirill", 22);

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(s1);
        studentsList.add(s2);
        studentsList.add(s3);
        studentsList.add(s4);
//        students.add(s5);
//        students.add(s6);
//        students.add(s7);

        HashMap<Long,Student> studentsMap = new HashMap<>();
//        students.put(s1.getID(), s1);
//        students.put(s2.getID(), s2);
//        students.put(s3.getID(), s3);
//        students.put(s4.getID(), s4);
        studentsMap.put(s5.getID(), s5);
        studentsMap.put(s6.getID(), s6);
        studentsMap.put(s7.getID(), s7);
        studentsMap.put(s8.getID(), s8);


        iGetModel hashList = new ModelClassHash(studentsMap);
//        iGetModel modelList = new ModelClassList(studentsList);
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
