package NVCStudentApp.Model;

import NVCStudentApp.Controler.Interfaces.iGetModel;
import NVCStudentApp.Model.Core.Student;

import java.util.HashMap;
import java.util.List;

public class ModelClassHash implements iGetModel {

    private HashMap<Long,Student> students;
    public ModelClassHash(HashMap<Long,Student> students){
        this.students = students;
    }

    @Override
    public HashMap<Long,Student> getStudents() {
        return students;
    }
}
