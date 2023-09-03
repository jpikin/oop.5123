package StudentApp.Domen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable {
    private List<StudentGroup> groupList = new ArrayList<>();
    public StudentStream(List<StudentGroup> groupList){
        this.groupList = groupList;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
