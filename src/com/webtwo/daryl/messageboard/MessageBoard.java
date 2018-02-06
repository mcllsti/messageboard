package com.webtwo.daryl.messageboard;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class MessageBoard {

    private final String mBTitle;
    private List<Topic> topics;

    public MessageBoard(String name)
    {
        mBTitle = name;
        topics = new ArrayList<Topic>();
    }

    public void addTopic(Topic topic){
        topics.add(topic);
    }

    public Topic getTopic(int i){
        return topics.get(i);
    }
    public void display(){
        System.out.println(mBTitle);
        System.out.println("----------");
        Iterator<Topic> it = topics.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }

}
