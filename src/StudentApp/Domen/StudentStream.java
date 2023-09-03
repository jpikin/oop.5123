package StudentApp.Domen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup>  {
    private int streamID;

    private List<StudentGroup> groupList;

    public StudentStream(List<StudentGroup> groupList, int streamID){
        this.groupList = groupList;
        this.streamID = streamID;

    }

    public int getStreamID() {
        return streamID;
    }

    public void setStreamID(int streamID) {
        this.streamID = streamID;
    }

    @Override
    public String toString(){
        return "Поток номер "+ this.streamID;
    }
    @Override
    public Iterator<StudentGroup> iterator() {
        return (Iterator<StudentGroup>) new StudentGroupIterator(groupList);
    }
}
