package StudentApp.Domen;


import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> group;
    private int groupID;
    private int groupSize;

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public StudentGroup(List<Student> group, int groupID) {
        this.groupID = groupID;
        this.group = group;
        this.groupSize = group.size();
    }

    public int getGroupSize() {
        return this.groupSize;
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

    @Override
    public int compareTo(StudentGroup o) {
//        System.out.println(. + " - " + o.getName());
        if (this.getGroupSize() == o.getGroupSize()){
            return 0;
        }
        else if (this.getGroupSize() == o.getGroupSize()) {
            return 1;
        } else {
            return -1;
        }

    }
}
