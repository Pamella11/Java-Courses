package Inheritance.Lab.RandomArrayList_03;

public class Main {
    public static void main(String[] args) {
        RandomArrayList<String> randomArrayList = new RandomArrayList<>();
        randomArrayList.add("Meow");
        randomArrayList.add("Ivan");
        randomArrayList.add("Rosi");
        randomArrayList.add("Meg");
        randomArrayList.add("Pamela");
        randomArrayList.add("Mishe");

        System.out.println(randomArrayList.getRandomElement());
    }
}
