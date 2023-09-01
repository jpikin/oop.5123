package StudentApp.Domen;

public class Student extends Person implements Comparable<Student> {

    private int ID;
    private static int generalID;
    public Student(String name, int age){
        super(name, age);
        this.ID = generalID;
        generalID++;
    }
    public int getID() {
        return ID;
    }

    @Override
    public int compareTo(Student o) {
        System.out.println(super.getName() + " - " + o.getName());
        if (super.getAge() == o.getAge()){ return 0; }
        else if (super.getAge() > o.getAge()) { return 1; }
        else {return -1;}

    }
    @Override
    public String toString(){
        return super.getName()+ " " + super.getAge() + " " + ID;
    }
}

