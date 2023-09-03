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
        return groupSize;
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

    /**
     * @apiNote Добавляем сортировку по количеству человек в группе
     * @param o the object to be compared.
     */
    @Override
    public int compareTo(StudentGroup o) {
        int result = Integer.compare(this.getGroupSize(),o.getGroupSize());
        return result;
    }
}
