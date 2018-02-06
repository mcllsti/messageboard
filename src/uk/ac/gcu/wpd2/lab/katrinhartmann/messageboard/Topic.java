package uk.ac.gcu.wpd2.lab.katrinhartmann.messageboard;


import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Topic {
    private List <Message> messages;
    private String title;

    public Topic(String t) {
        messages = new ArrayList<>();
        title = t;
    }

    public void displayTopic() {
        System.out.println("Topic: " + getTitle());
        System.out.println("-----------------------");
        StringBuilder b = new StringBuilder();
        Iterator<Message> it = messages.iterator();
        while(it.hasNext()) {
            b.append(it.next().displayMessage());
        }
        System.out.println(b.toString());
    }

    public void addMessage(Message m) {
        messages.add(m);
    }

    public String getTitle(){
        return title;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        //b.append("Topic: ");
        b.append(title); b.append('\n');
        for (Message m : messages) {
            b.append(m.displayMessage());
        }
        return b.toString();
    }
}

