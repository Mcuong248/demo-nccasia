public class Test_Immutable {
    public static void main(String[] args) {
        // Tạo một đối tượng immutable là String
        String immutableObject = "Hello";

        // Tạo ra đối tượng mới bằng '+='.Thêm chuỗi vào đối tượng immutable
        immutableObject += " World";

        // In ra nội dung của đối tượng immutable
        System.out.println(immutableObject); // Kết quả: Hello World
    }
}
