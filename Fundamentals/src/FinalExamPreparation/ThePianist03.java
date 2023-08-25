package FinalExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThePianist03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> piecesList = new ArrayList<>();
        List<String> composersList = new ArrayList<>();
        List<String> keysList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] pieces = scanner.nextLine().split("\\|");
            //"{piece}|{composer}|{key}".
            piecesList.add(pieces[0]);
            composersList.add(pieces[1]);
            keysList.add(pieces[2]);
        }

        String command = scanner.nextLine();

        while (!command.equals("Stop")){

            if (command.startsWith("Add")){
                //•	"Add|{piece}|{composer}|{key}":
                String piece = command.split("\\|")[1];
                String composer = command.split("\\|")[2];
                String key = command.split("\\|")[3];

                if (!piecesList.contains(piece)){
                    piecesList.add(piece);
                    composersList.add(composer);
                    keysList.add(key);
                    //"{piece} by {composer} in {key} added to the collection!"
                    System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                } else {
                    //"{piece} is already in the collection!"
                    System.out.println(piece + " is already in the collection!");
                }

            } else if (command.startsWith("Remove")) {
                //•	"Remove|{piece}":
                String piece = command.split("\\|")[1];

                if (piecesList.contains(piece)){
                    //o	If the piece is in the collection, remove it and print:
                    //"Successfully removed {piece}!"
                    int index = piecesList.indexOf(piece);
                    piecesList.remove(piece);
                    composersList.remove(index);
                    keysList.remove(index);
                    System.out.println("Successfully removed " + piece + "!");
                } else {
                //"Invalid operation! {piece} does not exist in the collection."
                    System.out.println("Invalid operation! " + piece + " does not exist in the collection.");
                }

            } else if (command.startsWith("ChangeKey")) {
                //•	"ChangeKey|{piece}|{new key}":
                String piece = command.split("\\|")[1];
                String key = command.split("\\|")[2];
                if (piecesList.contains(piece)){
                    int index = piecesList.indexOf(piece);
                    keysList.set(index, key);
                    //"Changed the key of {piece} to {new key}!"
                    System.out.printf("Changed the key of %s to %s!%n", piece, key);
                }else {
                    //"Invalid operation! {piece} does not exist in the collection."
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }
            }

            command = scanner.nextLine();
        }

        //"{Piece} -> Composer: {composer}, Key: {key}"
        for (int i = 0; i < piecesList.size(); i++) {
            String piece = piecesList.get(i);
            String composer = composersList.get(i);
            String key = keysList.get(i);

            System.out.printf("%s -> Composer: %s, Key: %s%n", piece, composer, key);
        }
    }
}
