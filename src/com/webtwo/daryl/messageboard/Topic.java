package com.webtwo.daryl.messageboard;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 30/01/2018.
 */
public class Topic {
    private List<Message> messages;
    private String title;

    public Topic(String t) {
        title = t;
        messages = new ArrayList<>();
    }

    public String displayTopic() {
        StringBuilder b = new StringBuilder();
        b.append(title);
        b.append('\n');
        b.append("------------\n");
        Iterator<Message> it = messages.iterator();
        while (it.hasNext()) {
            b.append(it.next().displayMessage());
        }


        return b.toString();
    }

    public void addMessage(Message m) {
        messages.add(m);

    }

    public String getTitle()
    {
        return title;
    }

    @Override
    public String toString(){
        StringBuilder b = new StringBuilder();
        b.append("Title: ");b.append(title);b.append('\n');
        for(Message m : messages){
            b.append(m.displayMessage());
        }

        return b.toString();
    }

}
