package StudentApp.Controlers;

import StudentApp.Domen.Person;
import StudentApp.Domen.Teacher;

public class AccauntControler {

    public <T extends Teacher> void paySalary(T person, int salary){
        System.out.println(person.getName()+ " Выплачена зарплата "+salary+" р.");
    }

}
