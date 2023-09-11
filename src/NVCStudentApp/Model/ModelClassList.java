package NVCStudentApp.Model;

import NVCStudentApp.Controler.Interfaces.iGetModel;
import NVCStudentApp.Model.Core.Student;

import java.util.HashMap;
import java.util.List;

public class ModelClassList implements iGetModel {
    private HashMap<Long,Student> students;
    public ModelClassList(HashMap<Long,Student> students){
        this.students = students;
    }

    public HashMap<Long,Student> getStudents() {
        return students;
    }
}