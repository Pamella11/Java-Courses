package FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> sentMessages = new LinkedHashMap<>();
        Map<String, Integer> receivedMessages = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Statistics")){

            String [] parts = input.split("=");
            String command = parts[0];

            if (command.equals("Add")){
                //o	"Add={username}={sent}={received}" // Pam - 9, 3
                String username = parts[1];
                int sent = Integer.parseInt(parts[2]);
                int received = Integer.parseInt(parts[3]);

                sentMessages.putIfAbsent(username, sent);
                receivedMessages.putIfAbsent(username, received);

            } else if (command.equals("Message")) {
                //o	"Message={sender}={receiver}"

                String sender = parts[1];
                String receiver = parts[2];

                if (sentMessages.containsKey(sender) && receivedMessages.containsKey(receiver)){
                    int currentSendMessages = sentMessages.get(sender);
                    sentMessages.put(sender, currentSendMessages + 1);

                    int currentReceivedMessages = receivedMessages.get(receiver);
                    receivedMessages.put(receiver, currentReceivedMessages + 1);

                    if (sentMessages.get(sender) + receivedMessages.get(sender) == capacity){
                        System.out.println(sender + " reached the capacity!");
                        sentMessages.remove(sender);
                        receivedMessages.remove(sender);

                    }
                    if (receivedMessages.get(receiver)  + sentMessages.get(receiver) == capacity) {
                        System.out.println(receiver + " reached the capacity!");
                        sentMessages.remove(receiver);
                        receivedMessages.remove(receiver);
                    }
                }

            } else if (command.equals("Empty")) {
                //o	"Empty={username}"
                String username = parts[1];

                if (username.equals("All")){
                    sentMessages.clear();
                    receivedMessages.clear();
                } else {
                    sentMessages.remove(username);
                    receivedMessages.remove(username);
                }
            }


            input = scanner.nextLine();
        }

        System.out.println("Users count: " + sentMessages.size());
        for (Map.Entry<String, Integer> name : sentMessages.entrySet()) {
            //{username1} - {number of messages}
            int totalMessages = name.getValue() + receivedMessages.get(name.getKey());
            System.out.printf("%s - %d%n", name.getKey(), totalMessages);
        }


    }
}
