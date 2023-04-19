package Test;

public class TestString {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        StringBuilder s3 = new StringBuilder("Hello");
        String s4 = "He";
        String s5 = s4 + "llo";
        StringBuilder s6 = new StringBuilder("Hel");
        StringBuilder s7 = s3.append("lo");

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s5); // false
        System.out.println(s3 == s7); // true
        System.out.println(s3.equals(s7)); // true
        System.out.println(s1.equals(s3)); // false
        //m đúng hết r đấy
        //rồi giờ giải thích tại sao đi nhé tí mà rep


    }
}
