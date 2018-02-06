package com.webtwo.daryl.messageboard;

import java.util.Scanner;

/**
 * Created by Administrator on 30/01/2018.
 */
public class MessageBoardMenu {

    private MessageBoard currentBoard;
    private Topic currentTopic;

    public MessageBoardMenu(MessageBoard mb){
        currentBoard = mb;
    }

    public void displayMessageBoardMenu(){
        currentBoard.display();

        int option = 0;

        Scanner keyboard = new Scanner(System.in);

        do
        {
            System.out.println("Main Menu:");
            System.out.println("----------");
            System.out.println("1.Add New Topic");
            System.out.println("2.Select a Topic");
            System.out.println("3.Quit");
            System.out.println("----------");
            System.out.println("Enter your choice:");

            option = keyboard.nextInt();

            switch(option){
                case 1:
                    System.out.println("Enter the title of your new topic");
                    String t = keyboard.next();
                    System.out.println("t is :" + t);
                    currentBoard.addTopic(new Topic(t));
                    currentBoard.display();
                    break;
                case 2:
                    System.out.println("Enter the number of the topic you would like to read:");
                    int choice = keyboard.nextInt();
                    Topic topic = currentBoard.getTopic(choice);
                    System.out.println("topic " + choice + " selected");
                    new TopicMenu(topic,keyboard).displayTopicMenu();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid system option!");
                    displayMessageBoardMenu();



            }








        }while(option != 3);


    }






}
