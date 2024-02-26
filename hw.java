import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Studygroup {
    private String name;

    public Studygroup(String name){

        this.name = name;
    }

    public String getname(){
        
        return name;
    }
}

class Stream implements Iterable<Studygroup>{

    private List<Studygroup> groups;

    public Stream(){
        groups = new ArrayList<>();
    }
    public void addGroup(Studygroup group) {
        groups.add(group);
    }
    @Override

    public Iterator<Studygroup> iterator(){

        return groups.iterator();
    }
}
class StreamComparator {

    public int compare(Stream stream1, Stream stream2) {

        int countGroup1 = stream1.count();
        int countGroup2 = stream2.count();

        return Integer.compare(countGroup1, countGroup2);

    }
}

class Streamservice {

    public void sortStream(List<Stream> streams) {

        streams.sort(new StreamComparator());
    }
}

class Controller {

    private Streamservice streamservice;

    public Controller(Streamservice streamservice) {

        this.streamservice = streamservice;

    }
    public void sortStream(List<Stream> streams){

        streamservice.sortStream(streams);
    }
}