package NVCStudentApp.Controler;

import NVCStudentApp.Controler.Interfaces.iGetModel;
import NVCStudentApp.Controler.Interfaces.iGetView;
import NVCStudentApp.Model.ModelClassList;
import NVCStudentApp.View.ViewClass;
import NVCStudentApp.Model.Core.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ControllerClass {
    private iGetModel model;
    private iGetView view;
    private HashMap<Long,Student> students = new HashMap<>();
    public static int lang;

    Scanner sc = new Scanner(System.in);


    public ControllerClass(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;


    }
private boolean testDate(HashMap<Long,Student> stud){
        if(stud.size()>0) return true;
        else return false;
}
    public void update() {
        //MVP
        students = model.getStudents();
        if(testDate(students)) {
            view.printAllStudents(students);
        } else {
            System.out.println(Lang.emptyList);
        }
        //MVC
        //        view.printAllStudents(model.getStudents());
    }
    public void run(){

        /**
         * @apiNote Выбираем язык приложения.
         */
        System.out.println("Выберите язык/Choice language:");
        System.out.println("1 - RU\n2 - ENG");
        lang = sc.nextInt();
        Lang.setLang();


        Command com = Command.NONE;
        boolean getNewIteration = true;
        while(getNewIteration)
        {
            String command = view.promt(Lang.langInput);
            com = Command.valueOf(command.toUpperCase());
            switch (com){
                case EXIT:
                    getNewIteration = false;
                    System.out.println(Lang.langExit);
                    break;
                case LIST:
                    view.printAllStudents(model.getStudents());
                    break;
                case DELETE:
                    System.out.println(Lang.IdInput);
                    Long id = sc.nextLong();
                    if (model.getStudents().containsKey(id)){
                        System.out.println(model.getStudents().get(id) + " - " +Lang.delMessage);
                        model.getStudents().remove(id);
                    } else {
                        System.out.println(Lang.delError);
                    }
            }
        }
    }

}
