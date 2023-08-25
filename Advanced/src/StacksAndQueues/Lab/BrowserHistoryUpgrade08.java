package StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> urls = new ArrayDeque<>();
        ArrayDeque<String> URLS = new ArrayDeque<>();

        while (!input.equals("Home")){

            if (input.equals("back")){
                if (urls.size() > 1){
                    String currentURL = urls.pop();
                    String previousURL = urls.peek();
                    System.out.println(previousURL);
                    URLS.addFirst(currentURL);
                }else {
                    System.out.println("no previous URLs");
                }

            } else if (input.equals("forward")) {
                if (!URLS.isEmpty()){
                    String currentURL = URLS.pollFirst();
                    System.out.println(currentURL);
                    urls.push(currentURL);
                }else {
                    System.out.println("no next URLs");
                }

            } else {
                urls.push(input);
                System.out.println(input);
                URLS.clear();
            }
            input = scanner.nextLine();
        }

    }
}
