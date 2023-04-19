import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        boolean rs = isEven.test(4);
        System.out.println(rs); // Output: true


        Operation add = (a,b) -> a + b;
        Operation subtract = (a, b) -> a - b;
        Operation multiply = (a, b) -> a * b;
        Operation divide = (a, b) -> a / b;

        int result = add.operation(10, 5);
        System.out.println("10 + 5 = " + result);

        result = subtract.operation(10, 5);
        System.out.println("10 - 5 = " + result);

        result = multiply.operation(10, 5);
        System.out.println("10 * 5 = " + result);

        result = divide.operation(10, 5);
        System.out.println("10 / 5 = " + result);
    }
}