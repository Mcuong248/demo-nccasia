import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("C:\\Users\\ADMIN\\eclipse-workspace\\Test6_TryCatchResources\\Test.txt")) {
            String msg = "My name is: Nguyễn Mạnh Cường";
            byte arr[]= msg.getBytes();
            fos.write(arr);
            System.out.println("Thông điệp đã được ghi vào file");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

