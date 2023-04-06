public class Test_Mutable {
    public static void main(String[] args) {
        // Tạo một đối tượng mutable là StringBuilder
        StringBuilder mutableObject = new StringBuilder("Hello");

        // Thay đổi nội dung của đối tượng mutable
        mutableObject.append(" World");

        // In ra nội dung của đối tượng mutable
        System.out.println(mutableObject.toString()); // Kết quả: Hello World
    }
}
