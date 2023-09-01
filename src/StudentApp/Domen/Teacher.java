package StudentApp.Domen;

public class Teacher extends Person {
    private String academicDegree;

    public Teacher(String name, int age, String academicDegree) {
        super(name, age);
        this.academicDegree = academicDegree;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }
}
