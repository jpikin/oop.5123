package NVCStudentApp.Controler;

import NVCStudentApp.Controler.ControllerClass;

public class Lang {
    public static String langStud;
    public static String langAge;
    public static String langStudList;
    public static String langInput;
    public static String langExit;
    public static String emptyList;
    public static String IdInput;
    public static String delError;
    public static String delMessage;
    public static int setLanguage;

    /**
     * @apiNote Определяем какой язык устанавливается в приложении исходя
     * из выбора пользователя.
     */
    public static void setLang() {
        setLanguage = ControllerClass.lang;


        if (setLanguage == 1) {

            langStud = "Студент";
            langAge = "возраст";
            langStudList = "Список студентов";
            langInput = "Введите команду";
            langExit = "Выход из программы";
            emptyList = "Список студентов пуст";
            IdInput = "Введите ID Студента";
            delError = "Студента с таким ID нет";
            delMessage = "удален из списка";

        } else {
            langStud = "Student";
            langAge = "age";
            langStudList = "Students list";
            langInput = "Enter command: ";
            langExit = "EXIT.";
            emptyList = "empty list";
            IdInput = "input student ID";
            delError = "There is no student with this ID";
            delMessage = "deleted from list";
        }
    }
}