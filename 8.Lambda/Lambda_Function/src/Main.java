import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> stringLengthFunction = (s) -> s.length();

        String inputString = "Hello, world!";
        int stringLength = stringLengthFunction.apply(inputString);

        System.out.println("The length of \"" + inputString + "\" is " + stringLength + ".");
    }
}

