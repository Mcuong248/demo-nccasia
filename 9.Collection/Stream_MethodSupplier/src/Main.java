import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // forEach() duyệt qua các phần tử của Stream.
        List<String> stringList = Arrays.asList("Java core", "HTML", "CSS", "Javascrip", "Bootrap");
        stringList.stream().forEach(System.out::println);
        System.out.println("--------------");

        // collect() giúp thu thập kết quả Stream sang một Collection.
        Stream<String> stream = Stream.of("Bút", "Vở", "Bảng", "Tẩy", "Phấn");
        List<String> languages = stream.collect(Collectors.toList());
        System.out.println(languages);
        System.out.println("---------------");

        // count() trả về tổng số phần tử cho dữ liệu luồng.
        List<Integer> numbers = Arrays.asList(2, 3, 4, 10, 5, 9, 20);
        long count = numbers.stream().filter(num -> num % 3 == 0).count();
        System.out.println("Count = " + count);
        System.out.println("----------------");

        // max(), min() tìm giá trị lớn nhất và nhỏ nhất
        int max = numbers.stream().max(Integer::compare).get();
        int min = numbers.stream().min(Integer::compare).get();
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("-----------------");

        // summaryStatistics() được sử dụng để lấy giá trị count, min, max, sum và average với tập dữ liệu số.
        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Count: " + stats.getCount());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("------------------");

        // reduce()
        List<Integer> listNumbers = Arrays.asList(66, 5, 7, 2, 12, 443, 12, 3, 55, 188, 55, 43, 76, 3, 2, 7, 7, 5);
        System.out.println("Sum của arr");
        int sum = listNumbers.stream().reduce(0, (a,b) -> a+b);
        System.out.println(sum);
        System.out.println("-----------------------------");
    }
}
