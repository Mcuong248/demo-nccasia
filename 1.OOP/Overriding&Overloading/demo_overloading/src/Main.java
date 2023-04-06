public class Main {
    public static void main(String[] args) {
        MathOperation mathOperation = new MathOperation();
        System.out.println("cộng hai số nguyên " + mathOperation.add(4,5));
        System.out.println("Cộng hai số thực " + mathOperation.add(5.5,6.5));
        System.out.println("Cộng ba số nguyên " + mathOperation.add(4,5,6));
        System.out.println("Cộng hai chuỗi " + mathOperation.add("Mạnh", "Cường"));
    }
}
