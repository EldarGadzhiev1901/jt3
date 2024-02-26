public static void Main(String[] args) {

    Studygroup group1 = new Studygroup("Group1");
    Studygroup group2 = new Studygroup("Group2");
    Studygroup group3 = new Studygroup("Group3");

    Stream stream1 = new Stream();
    stream1.addGroup(group1); 
    stream1.addGroup(group2);  
    Stream stream2 = new Stream();
    stream2.addGroup(group3);  

    Streamservice streamservice = new Streamservice();
    Controller controller = new Controller(streamservice);
    List<Stream> streams = new ArrayList<>();
    streams.add(stream1);
    streams.add(stream2);
    controller.sortStream(streams);

    for(Stream stream : streams) {

        System.out.println("Stream");
        for(Studygroup group : stream){
            System.out.println("-" + group.getname());
        }
    }
}