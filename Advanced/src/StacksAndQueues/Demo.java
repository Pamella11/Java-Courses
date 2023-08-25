package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<Character> bracketsStack = new ArrayDeque<>();

        //Четем скобите една по една:
        //
        //- ако е отваряща, т.е. ( { [, я добавяме в стека
        //
        //- ако е затваряща, т.е. ) } ], проверяваме в стека:
        //
        //    ---- ако е празен => невалиден израз
        //
        //    ---- ако скобата е от друг тип => невалиден израз
        //
        //    ---- ако скобата е отваряща от правилния тип, продължаваме (след като сме я извадили от стека)
        //
        //- като свършат всички входни данни, проверяваме дали стека е празен:
        //
        //    ---- ако не е празен => невалиден израз
        //
        //    ---- празен стек - всички скоби са формирали валидни
        boolean areBalanced = true;
        for (int i = 0; i < input.length(); i++) {

            char bracket = input.charAt(i);

            if (bracket == '(' || bracket == '[' || bracket == '{'){

                bracketsStack.push(bracket);

            } else if (bracket == ')' || bracket == ']' || bracket == '}') {
                if (bracketsStack.isEmpty()){
                    areBalanced = false;
                    break;
                } else {
                    char lastBracket = bracketsStack.pop();

                    if ((lastBracket == '(' && bracket != ')') || (lastBracket == '[' && bracket != ']') || (lastBracket == '{' && bracket != '}')){
                        areBalanced = false;
                        break;
                    }
                }
            }
        }
        if (!areBalanced){
            System.out.println("NO");
            return;
        }

        if (bracketsStack.isEmpty()){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
