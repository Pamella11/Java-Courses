package WhileLoop.Exercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookName = scanner.nextLine();

        int bookCount = 0;

        while (!bookName.equals("No More Books")) {

            String books = scanner.nextLine();

            bookCount ++;

            if (books.equals(bookName)) {
                bookCount --;
                System.out.printf("You checked %d books and found it.", bookCount);
                break;
            }

            if (books.equals("No More Books")) {
                bookCount --;
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", bookCount);
                break;
        }
        }
    }
}
