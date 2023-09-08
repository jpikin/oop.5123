package NVCStudentApp.Controler.Interfaces;

import StudentApp.Domen.Student;

import java.util.List;

public interface iGetView {
    void printAllStudents(List<Student> students);
    String promt(String message);
}
