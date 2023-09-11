package NVCStudentApp.Model;

import NVCStudentApp.Controler.Interfaces.iGetModel;
import NVCStudentApp.Model.Core.Student;

import java.util.List;

public class ModelClassList implements iGetModel {
    private List<Student> students;
    public ModelClassList(List<Student> students){
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }
}
