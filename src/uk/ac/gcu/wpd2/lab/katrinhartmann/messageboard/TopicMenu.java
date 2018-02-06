package uk.ac.gcu.wpd2.lab.katrinhartmann.messageboard;

import java.util.Scanner;

public class TopicMenu {
    private Topic currentTopic;
    private Scanner keyboard;
    private Message currentMessage;

    public TopicMenu(Topic t, Scanner keyboard) {
        currentTopic = t;
        this.keyboard = keyboard;
    }

    public void displayTopicMenu() {

        int option = 0;

        do {
            currentTopic.displayTopic();
            System.out.println("Topic Menu:");
            System.out.println("----------");
            System.out.println("1. Add new message");
            System.out.println("2. Go back to main menu");
            System.out.println("----------");
            System.out.println("Enter your choice:");
            option = keyboard.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the subject of your new topic:");
                    String subject = (String) keyboard.next();

                    System.out.println("Enter the text of your message:");
                    String contents = (String) keyboard.next();

                    currentMessage = new Message(subject, contents, new java.util.Date(), "Admin");

                    System.out.println("Your message: " + currentMessage.displayMessage());
                    currentTopic.addMessage(currentMessage);
                    break;

                case 2:
                    System.out.println("Leaving topic menu...");
                    break;

                default:
                    System.out.println("Invalid option. Please enter one of the options above.");
                    option = 0;
            }

        } while (option != 2);
    }
}
