package uk.ac.gcu.wpd2.lab.katrinhartmann.messageboard;

import java.util.Date;

public class Message {
    private String subject;
    private String contents;
    private Date sentDate;
    private String author;

    public Message(String s, String c, Date d, String a) {
        subject = s;
        contents = c;
        sentDate = d;
        author = a;
    }

    public String displayMessage() {
        StringBuilder b = new StringBuilder();
        b.append("Subject: "); b.append(subject); b.append('\n');
        b.append("From: "); b.append(author); b.append('\n');
        b.append(sentDate); b.append('\n');
        b.append(contents); b.append('\n');
        return b.toString();
    }


}
