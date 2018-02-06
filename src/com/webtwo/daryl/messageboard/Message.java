package com.webtwo.daryl.messageboard;

import java.util.Date;

/**
 * Created by Administrator on 30/01/2018.
 */
public class Message {

    private String subject;
    private String contents;
    private Date sentDate;
    private String author;

    public Message(String Subject,String Contents,Date SentDate,String Author){
        subject = Subject;
        contents = Contents;
        sentDate = SentDate;
        author = Author;
    }

    public String displayMessage()
    {
        StringBuilder b = new StringBuilder();
        b.append("Author: ");b.append(author);b.append('\n');
        b.append("Date: ");b.append(sentDate);b.append('\n');
        b.append("Subject: ");b.append(subject);b.append('\n');
        b.append("Message: ");b.append(contents);b.append('\n');

        return b.toString();
    }

}
