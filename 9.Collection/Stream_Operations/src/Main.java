import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 2, 3, 11, 15, 20, 25, 24, 50, 60, 40, 100, 200);
        System.out.println("Dãy ban đầu: ");
        System.out.println(numbers);
        System.out.println("--------------");

        // filter() giúp loại bỏ các phần tử dựa trên các tiêu chí nhất định.
        List<Integer> filterNumber = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("Số chẵn là: ");
        System.out.println(filterNumber);
        System.out.println("--------------");

        // skip() loại bỏ các phần tử n đầu tiên của Stream
        List<Integer> skipNumber = numbers.stream().skip(10).collect(Collectors.toList());
        System.out.println("Bỏ qua 10 số đầu tiên: ");
        System.out.println(skipNumber);
        System.out.println("---------------");

        // limit() giới hạn phần tử
        List<Integer> limitNumber = numbers.stream().limit(10).collect(Collectors.toList());
        System.out.println("20 số đầu tiên: ");
        System.out.println(limitNumber);
        System.out.println("----------------");

        // sorted() giúp sắp xếp các phần tử theo một thứ tự xác định.
        List<Integer> sortNumber = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println("Sắp xếp theo trật tự tự nhiên: ");
        System.out.println(sortNumber);
        System.out.println("-----------------");
    }
}

