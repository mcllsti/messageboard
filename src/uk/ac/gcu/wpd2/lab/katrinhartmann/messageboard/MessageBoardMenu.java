package uk.ac.gcu.wpd2.lab.katrinhartmann.messageboard;

import java.util.Scanner;

public class MessageBoardMenu {
    private MessageBoard currentBoard;
    private Topic currentTopic;

    public MessageBoardMenu(MessageBoard mb) {
        currentBoard = mb;
    }

    public void displayMessageBoardMenu() {
        currentBoard.displayMessageBoardTopics();

        int option = 0;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("Main Menu:");
            System.out.println("----------");
            System.out.println("1. Add a new topic");
            System.out.println("2. Select a topic to view");
            System.out.println("3. Quit");
            System.out.println("----------");
            System.out.println("Enter your choice:");
            option = keyboard.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Enter the title of your new topic:");
                    String t = keyboard.next();
                    currentBoard.addTopic(new Topic(t));
                    currentBoard.displayMessageBoard();
                    break;

                case 2:
                    currentBoard.displayMessageBoardTopics();
                    System.out.println("Enter the number of the topic you would like to go to:");
                    int choice = keyboard.nextInt();
                    Topic topic = currentBoard.getTopic(choice);
                    new TopicMenu(topic, keyboard).displayTopicMenu();
                    break;

                case 3:
                    System.out.println("Goodbye.");
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please enter one of the options above.");
                    displayMessageBoardMenu();
            }

        } while (option != 3);
    }
}
