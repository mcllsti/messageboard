package uk.ac.gcu.wpd2.lab.katrinhartmann.messageboard;

public class Main {
    //MessageBoard mb;
    //MessageBoardMenu menu;

    public Main(String t){
        //mb = new MessageBoard(t);
        //menu = new MessageBoardMenu(mb);
    }
    public Main() {}

    public void start()
    {
        MessageBoard mb = new MessageBoard("Message Board 1");
        MessageBoardMenu mbm = new MessageBoardMenu(mb);
        mbm.displayMessageBoardMenu();
    }

    public static void main(String[] args) {
        try {
            //Main main = new Main("Message Board 1");
            Main main = new Main();
            main.start();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
