package NVCStudentApp.Controler.Interfaces;

import NVCStudentApp.Model.Core.Student;

import java.util.HashMap;
import java.util.List;

public interface iGetModel {
    HashMap<Long,Student> getStudents();
}
