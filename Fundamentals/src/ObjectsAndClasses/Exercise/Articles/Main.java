package ObjectsAndClasses.Exercise.Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Article article = new Article(input.split(", ")[0], input.split(", ")[1], input.split(", ")[2]);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String command = scanner.nextLine();

            if (command.startsWith("Edit")) {
                String content = command.split(": ")[1];
                article.Edit(content);
            } else if (command.startsWith("ChangeAuthor")) {
                String author = command.split(": ")[1];
                article.ChangeAuthor(author);
            } else if (command.startsWith("Rename")) {
                String title = command.split(": ")[1];
                article.Rename(title);
            }
        }

        System.out.println(article);

    }
}
