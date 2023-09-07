package StudentApp.Services;

import StudentApp.Domen.PersonComparator;
import StudentApp.Domen.Student;
import StudentApp.Domen.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements iPersonService<Teacher>{

    private int count;
    private List<Teacher> teachers;
    public  TeacherService(){
        this.teachers = new ArrayList<>();
    }
    @Override
    public List getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int age) {
        Teacher teach = new Teacher(name,age,"docent");
        count++;
        teachers.add(teach);
    }

    /**
     * @apiNote Сортируем список по имени
     */
    public void sortByTeachFio(){
        PersonComparator<Teacher> perComp = new PersonComparator<Teacher>();
        teachers.sort(perComp);
    }
}
