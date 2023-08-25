package FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class WorldTour01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String info = scanner.nextLine();
        StringBuilder newInfo = new StringBuilder(info);

        String command = scanner.nextLine();

        while (!command.equals("Travel")) {

            if (command.startsWith("Add Stop")) {
                //•	"Add Stop:{index}:{string}":
                int index = Integer.parseInt(command.split(":")[1]);
                String text = command.split(":")[2];
                //o	Insert the given string at that index only if the index is valid
                if (index >= 0 && index < newInfo.length()) {
                    newInfo.insert(index, text);
                }
                System.out.println(newInfo);
            } else if (command.startsWith("Remove Stop")) {
                //•	"Remove Stop:{start_index}:{end_index}":
                int startIndex = Integer.parseInt(command.split(":")[1]);
                int endIndex = Integer.parseInt(command.split(":")[2]);
                //o	Remove the elements of the string from the starting index to the end index (inclusive) if both indices are valid
                if (startIndex >= 0 && startIndex < newInfo.length() && endIndex >= 0 && endIndex < newInfo.length()) {
                    newInfo.delete(startIndex, endIndex + 1);
                }
                System.out.println(newInfo);
            } else if (command.startsWith("Switch")) {
                //•	"Switch:{old_string}:{new_string}":
                //o	If the old string is in the initial string, replace it with the new one (all occurrences)
                String oldText = command.split(":")[1];
                String newText = command.split(":")[2];
                newInfo = new StringBuilder(newInfo.toString().replaceAll(oldText, newText));
               // newInfo = replaceAll(newInfo, oldText, newText);
              //  System.out.println(newInfo);
            }

            command = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + newInfo);
    }
   // public  static StringBuilder replaceAll(StringBuilder sb, String oldWord, String newWord){
    //    return new StringBuilder(Pattern.compile(oldWord).matcher(sb).replaceAll(newWord));
   // }
}
