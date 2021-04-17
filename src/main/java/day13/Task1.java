package day13;

import java.lang.reflect.AnnotatedArrayType;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Anna");
        User user2 = new User("Ivan");
        User user3 = new User("Petra");

        user1.sendMessage(user2, "Hallo, Ivan");
        user1.sendMessage(user2, "How are you?");

        user2.sendMessage(user1, "Hi, Anna!");
        user2.sendMessage(user1, "I'm fine");
        user2.sendMessage(user1, "And you?");

        user3.sendMessage(user1, "Hallo, Anna");
        user3.sendMessage(user1, "What's up?");
        user3.sendMessage(user1, "I've seen you on the party!");

        user1.sendMessage(user3, "Hallo, Petra!");
        user1.sendMessage(user3, "I'n exited. Yesterday party was really amazing!!");
        user1.sendMessage(user3, "What do you think about?");

        user3.sendMessage(user1, "I think so too!!!");

        MessageDatabase.showDialog(user1, user3);
        MessageDatabase.showDialog(user1, user2);
    }
}
