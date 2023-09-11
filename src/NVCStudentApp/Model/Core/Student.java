package NVCStudentApp.Model.Core;

import NVCStudentApp.Controler.ControllerClass;
import NVCStudentApp.Controler.Lang;
import NVCStudentApp.Model.Core.Person;

public class Student extends Person {

//    private int ID;
    private Long ID;
    private static Long generalID = 0L;

    public Student(String name, int age) {
        super(name, age);
        this.ID = generalID++;
//        generalID++;
    }

    public Long getID() {
        return ID;
    }


    @Override
    public String toString() {
        return Lang.langStud + " " + super.getName() + ", " + Lang.langAge + ": " + super.getAge() + ", ID = " + ID;
    }
}
