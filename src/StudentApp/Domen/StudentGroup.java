package StudentApp.Domen;


import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{
    private List<Student> group;
    private int groupID;

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }
    public StudentGroup(List<Student> group, int groupID){
        this.groupID = groupID;
        this.group = group;
    }
    @Override
    public String toString(){
        return "StudentGroup = "+ groupID;

    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(group);
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }
}
