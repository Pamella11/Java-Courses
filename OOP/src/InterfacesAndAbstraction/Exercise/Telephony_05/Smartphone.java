package InterfacesAndAbstraction.Exercise.Telephony_05;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {

        StringBuilder sb = new StringBuilder();

        boolean isUrlCorrect = true;

        for (String url : urls) {

            for (int i = 0; i < url.length(); i++) {
                char currentSymbol = url.charAt(i);
                if (Character.isDigit(currentSymbol)){
                    isUrlCorrect = false;
                    break;
                }
            }
            if (isUrlCorrect){
                sb.append("Browsing: ").append(url).append("!");
            } else {
                sb.append("Invalid URL!");
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    @Override
    public String call() {

        StringBuilder stringBuilder = new StringBuilder();

        boolean isNumberCorrect = true;

        for (String number : numbers) {

            for (int i = 0; i < number.length(); i++) {

                char currSymbol = number.charAt(i);

                if (!Character.isDigit(currSymbol)) {
                    isNumberCorrect = false;
                    break;
                }
            }
            if (isNumberCorrect) {
                stringBuilder.append("Calling... ").append(number);
            } else {
                stringBuilder.append("Invalid number!");
            }
            stringBuilder.append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }
}
