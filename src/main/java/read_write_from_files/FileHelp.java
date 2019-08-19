package read_write_from_files;

public class FileHelp {
    public static void main(String[] args) {
        Help hlpobj = new Help("text.txt");
        String topic;

        System.out.println("Try the help system. " + "Enter 'stop' to end");
        do{
            topic = hlpobj.getSelection();
            if (!hlpobj.helpon(topic)) {
                System.out.println("Topic not found. \n");
            }
        }while (topic.compareTo("stop") != 0 );
    }

}


