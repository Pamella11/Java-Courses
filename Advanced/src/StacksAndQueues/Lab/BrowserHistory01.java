package StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> deque = new ArrayDeque<>();

        while (!input.equals("Home")){

            if (input.equals("back")){
                if (deque.size() > 1){
                    String url = deque.poll();
                    System.out.println(deque.peek());
                }else {
                    System.out.println("no previous URLs");
                }

            } else {
                deque.push(input);
                System.out.println(input);
            }

            input = scanner.nextLine();
        }
    }
}
