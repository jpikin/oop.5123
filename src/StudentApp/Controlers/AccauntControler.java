package StudentApp.Controlers;

import StudentApp.Domen.Person;
import StudentApp.Domen.Teacher;

import java.util.List;

public class AccauntControler {

    public static<T extends Teacher> void paySalary(T person, int salary){
        System.out.println(person.getName()+ " Выплачена зарплата "+salary+" р.");
    }

    /**
     * @apiNote Считаем средний возраст группы
     * @param persons Список персон(Учителя/студенты/рабочие)
     * @return Возвращаем средний возраст
     * @param <T> принимает любой из дочерних классов класса Person
     */
    public static <T extends Person> double averageAge(List<T> persons){
        int sumAge = 0;
        for (int i = 0; i < persons.size(); i++){
            sumAge += persons.get(i).getAge();
        }
        return sumAge/persons.size();
    }
}
