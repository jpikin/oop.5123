package StudentApp;

import StudentApp.Controlers.AccauntControler;
import StudentApp.Domen.*;
import StudentApp.Services.TeacherService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Сергей", 23);
        Student s3 = new Student("Олег", 22);
        Student s4 = new Student("Игорь", 23);
        Student s5 = new Student("Даша", 23);
        Student s6 = new Student("Лена", 23);
        Student s7 = new Student("Петя", 21);
        Student s8 = new Student("Лёня", 23);
        Student s9 = new Student("Варя", 22);
        Student s10 = new Student("Гена", 22);
        Student s11 = new Student("Роберт", 21);
        Student s12 = new Student("Афоня", 21);
        Student s13 = new Student("Зорро", 27);

        Teacher t1 = new Teacher("Галина", 35, "Docent");
        Teacher t2 = new Teacher("Mariya", 32, "Docent");



        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(s4);
        listStud1.add(s5);
        listStud1.add(s6);
        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s7);
        listStud2.add(s8);
        listStud2.add(s9);
        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(s10);
        listStud3.add(s11);
        listStud3.add(s12);
        listStud3.add(s13);

        StudentGroup g5123 = new StudentGroup(listStud1, 5123);
        StudentGroup g5124 = new StudentGroup(listStud2, 5124);
        StudentGroup g5125 = new StudentGroup(listStud3, 5125);
        List<StudentGroup> studentGroups = new ArrayList<>();
        studentGroups.add(g5123);
        studentGroups.add(g5124);
        studentGroups.add(g5125);


        StudentStream studentStream = new StudentStream(studentGroups, 1);
        System.out.println(studentStream+"\n\n----- Поток до сортировки-----\n");
        printStudentStream(studentGroups);
        Collections.sort(studentStream.getGroupList());
        System.out.println("\n----- Поток после сортировки-----\n");
        printStudentStream(studentGroups);

        AccauntControler controller = new AccauntControler(); //без статики нужно создать экземпляр класса
        controller.paySalary(t1,50000);                 //и потом вызывать методы

        AccauntControler.paySalary(t1,50000); // при статическом методе не нужно создавать экземпляр класса

        System.out.println("Средний возраст группы: " + AccauntControler.averageAge(listStud1));
    }

    /**
     * @apiNote Выводим в консоль поток студентов
     * @param studentGroups Список студеческих групп
     */
    private static void printStudentStream(List<StudentGroup> studentGroups) {
        for (StudentGroup groupNumber: studentGroups) {
            System.out.println(groupNumber+":");
            for (Student student : groupNumber) {
                System.out.println(student);
            }
        }

    }
}
