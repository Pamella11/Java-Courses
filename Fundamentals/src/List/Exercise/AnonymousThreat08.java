package List.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> textList = Arrays
                .stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        //IvoJohnyTonyBonyMony
        while (!command.equals("3:1")) {

            if (command.startsWith("merge")) {
                //•	merge {startIndex} {endIndex}
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);

                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > textList.size() - 1) {
                    endIndex = textList.size() - 1;
                }
                if (startIndex < textList.size() - 1 && endIndex > 0) {
                    String mergedText = "";
                    for (int i = startIndex; i <= endIndex; i++) {
                        String textToMerge = textList.get(i);
                        mergedText += textToMerge;
                    }

                    textList.subList(startIndex, endIndex + 1).clear();
                    textList.add(startIndex, mergedText);
                }
            } else if (command.startsWith("divide")) {
                //•	divide {index} {partitions}
                int index = Integer.parseInt(command.split(" ")[1]);
                int partitions = Integer.parseInt(command.split(" ")[2]);

                String wordToDivide = textList.get(index);

                StringBuilder newWord = new StringBuilder(wordToDivide);

                if (wordToDivide.length() % 2 == 0){
                    int index1 = wordToDivide.length() / partitions;   // 6 / 3 = 2  ab cd ef  ///qrstuvwxyz -> 2 - qr
                    for (int i = index1; i <= wordToDivide.length() + partitions; i+=index1 + 1) {
                        newWord.insert(i, " ");
                    }
                } else {
                    int index1 = (wordToDivide.length() - 1) / partitions;
                    for (int i = index1; i <= wordToDivide.length() + partitions; i+=index1 + 1) {
                        newWord.insert(index1, " ");
                    }
                }
                textList.set(index, newWord.toString());
            }

            command = scanner.nextLine();
        }
        //abcd efgh ijkl mnop qr st uv wx yz

        System.out.println(String.join(" ", textList));

    }
}
