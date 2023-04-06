import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        Consumer<Integer> printNumberConsumer = (number) -> System.out.println(number);

        numbers.forEach(printNumberConsumer);
    }
}

