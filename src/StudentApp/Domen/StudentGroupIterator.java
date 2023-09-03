package StudentApp.Domen;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<StudentGroup>{
    private int counter;
    private List<StudentGroup> studentList;

    public StudentGroupIterator(List<StudentGroup> studentList){
        this.studentList = studentList;
    }

    @Override
    public boolean hasNext() {
        return counter < studentList.size();
    }

    @Override
    public StudentGroup next() {
        counter++;
        return studentList.get(counter-1);
    }


}
