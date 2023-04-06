import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tuổi của bạn");
        int age = sc.nextInt();
        try {
            int a = age / 0;
            System.out.println("Chia một số cho 0");
        }catch (ArithmeticException e){
            System.out.println("Không thể chia 1 số cho 0");
            e.getMessage();
        }finally {
            System.out.println("Đây là khối finally");
        }

        try {
            int[] arr = new int[5];
            arr[5] = 10;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    // Throw
    // throw sử dụng để ném ra ngoại lệ cụ thể
    public static void validate(int age) {
        try {
            if (age < 18) {
                throw new ArithmeticException("Không hợp lệ");
            } else {
                System.out.println("Welcome");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    // Throws
    // throws được sử dụng khai báo ngoại lệ có thể được ném ra khỏi phương thức
    public static void a() throws IOException {
        throw new IOException("Lỗi ");
    }

    public static void b() throws IOException {
        a();
    }

    public static void c() {
        try {
            b();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Ngoại lệ được xử lý");
    }
}
