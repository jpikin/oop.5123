package NVCStudentApp.Controler;

import NVCStudentApp.Controler.ControllerClass;

public class Lang {
    public static String langStud;
    public static String langAge;
    public static String langStudList;
    public static String langInput;
    public static String langExit;
    public static String emptyList;
    public static int flo;

    /**
     * @apiNote Определяем какой язык устанавливается в приложении исходя
     * из выбора пользователя.
     */
    public static void setLang() {
        flo = ControllerClass.lang;


        if (flo == 1) {

            langStud = "Студент";
            langAge = "возраст";
            langStudList = "Список студентов";
            langInput = "Введите команду";
            langExit = "Выход из программы";
            emptyList = "Список студентов пуст";

        } else {
            langStud = "Student";
            langAge = "age";
            langStudList = "Students list";
            langInput = "Enter command: ";
            langExit = "EXIT.";
            emptyList = "empty list";
        }
    }
}