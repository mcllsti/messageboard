package com.webtwo.daryl.messageboard;

import java.util.Scanner;

/**
 * Created by Administrator on 30/01/2018.
 */
public class TopicMenu {
    private Scanner keyboard;
    private Topic currentTopic;
    private Message currentMessage;

    public TopicMenu(Topic topic,Scanner Keyboard)
    {
        currentTopic = topic;
        keyboard = Keyboard;
    }

    public void displayTopicMenu(){


    }
}
