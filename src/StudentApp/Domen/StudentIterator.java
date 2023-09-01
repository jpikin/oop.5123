package StudentApp.Domen;

import java.util.Iterator;
import java.util.List;

public class StudentIterator implements Iterator<Student> {
    private int counter;
    private List<Student> group;

    public StudentIterator(List<Student> group){
        this.group = group;
    }

    @Override
    public boolean hasNext() {
        return counter < group.size();
    }

    @Override
    public Student next() {
        counter++;
        return group.get(counter-1);
    }


}
