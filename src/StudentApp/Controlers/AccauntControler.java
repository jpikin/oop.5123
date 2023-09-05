package StudentApp.Controlers;

import StudentApp.Domen.Person;
import StudentApp.Domen.Teacher;

import java.util.List;

public class AccauntControler {

    public static<T extends Teacher> void paySalary(T person, int salary){
        System.out.println(person.getName()+ " Выплачена зарплата "+salary+" р.");
    }
    public static <T extends Person> double averageAge(List<T> persons){
        return 0; // дописать метод
    }
}
