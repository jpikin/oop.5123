package NVCStudentApp.Model.Core;

import NVCStudentApp.Model.Core.Person;

public class Student extends Person {

    private int ID;
    private static int generalID;
    public Student(String name, int age){
        super(name, age);
        this.ID = generalID;
        generalID++;
    }
    public int getID() {
        return ID;
    }





    @Override
    public String toString(){
        return "Студент " +super.getName()+ ", возраст " + super.getAge() + ", ID = " + ID;
    }
}
