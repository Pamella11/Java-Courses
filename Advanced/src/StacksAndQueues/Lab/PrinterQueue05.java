package StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fileNames = scanner.nextLine();

        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!fileNames.equals("print")){

            if (fileNames.equals("cancel")){
                if (!queue.isEmpty()){
                    String cancelledFile = queue.poll();
                    System.out.println("Canceled " + cancelledFile);
                }else {
                    System.out.println("Printer is on standby");
                }
            } else {
                queue.offer(fileNames);
            }
            fileNames = scanner.nextLine();
        }

        for (String file: queue) {
            System.out.println(file);
        }
    }
}
