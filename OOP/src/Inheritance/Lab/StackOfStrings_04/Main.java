package Inheritance.Lab.StackOfStrings_04;

public class Main {
    public static void main(String[] args) {
        StackOfStrings stack = new StackOfStrings();

        stack.push("o");
        stack.push("w");
        stack.push("p");
        stack.push("d");

        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
