package NVCStudentApp.Controler;

import NVCStudentApp.Controler.Interfaces.iGetModel;
import NVCStudentApp.Controler.Interfaces.iGetView;
import NVCStudentApp.Model.ModelClassList;
import NVCStudentApp.View.ViewClass;
import StudentApp.Domen.Student;

import java.util.ArrayList;
import java.util.List;

public class ControllerClass {
    private iGetModel model;
    private iGetView view;
    private List<Student> students = new ArrayList<>();


    public ControllerClass(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;


    }
private boolean testDate(List<Student> stud){
        if(stud.size()>0) return true;
        else return false;
}
    public void update() {
        //MVP
        students = model.getStudents();
        if(testDate(students)) {
            view.printAllStudents(students);
        } else {
            System.out.println("Список студентов пуст");
        }
        //MVC
        //        view.printAllStudents(model.getStudents());
    }
    public void run(){
        Command com = Command.NONE;
        boolean getNewIteration = true;
        while(getNewIteration)
        {
            String command = view.promt("Введите команду");
            com = Command.valueOf(command.toUpperCase());
            switch (com){
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Выход из программы");
                    break;
                case LIST:
                    view.printAllStudents(model.getStudents());
                    break;
            }
        }
    }

}
