package NVCStudentApp.Controler.Interfaces;

import NVCStudentApp.Model.Core.Student;

import java.util.HashMap;
import java.util.List;

public interface iGetView {
    void printAllStudents(HashMap<Long,Student> students);
    String promt(String message);
}
