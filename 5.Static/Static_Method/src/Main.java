public class Main {
    public static void main(String[] args) {
        UsingStaticExample example = new UsingStaticExample("Java core");
        UsingStaticExample.changeWebsite("ngmanhcuong.com");
        example.print();
        System.out.println("--------------");
        UsingStaticExample.changeWebsite("https://ngmanhcuong.com");
        example.print();
    }
}
