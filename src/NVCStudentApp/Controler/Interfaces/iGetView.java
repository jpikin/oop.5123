package NVCStudentApp.Controler.Interfaces;

import NVCStudentApp.Model.Core.Student;

import java.util.List;

public interface iGetView {
    void printAllStudents(List<Student> students);
    String promt(String message);
}
