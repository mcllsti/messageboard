package uk.ac.gcu.wpd2.lab.katrinhartmann.messageboard;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class MessageBoard {
    private final String mBTitle;
    private List <Topic> topics ;

    public MessageBoard(String name){
        mBTitle = name;
        topics = new ArrayList <Topic>();
    }

    public void addTopic(Topic tp){
        topics.add(tp);
    }

    public Topic getTopic (int n){
        return topics.get(n);
    }

    public void displayMessageBoard() {
        System.out.println(mBTitle);
        System.out.println("-----------");
        Iterator<Topic> it = topics.iterator();
        while(it.hasNext()) {
            Topic t = it.next();
            System.out.print(topics.indexOf(t)+"\t");
            System.out.println(t);
        }
    }

    public void displayMessageBoardTopics() {
        System.out.println(mBTitle);
        System.out.println("-----------");
        Iterator<Topic> it = topics.iterator();
        while(it.hasNext()) {
            Topic t = it.next();
            System.out.print(topics.indexOf(t)+"\t");
            System.out.println(t.getTitle());
        }
    }
}
