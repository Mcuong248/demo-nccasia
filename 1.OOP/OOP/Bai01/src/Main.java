import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerOfficer managerOfficer = new ManagerOfficer();
        Scanner sc = new Scanner(System.in);
        boolean isContinue = false;
        while (!isContinue) {
            menu();
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    managerOfficer.addOfficer();
                    System.out.println("Danh sách cán bộ đã thêm: ");
                    managerOfficer.display();
                    break;
                case 2:
                    managerOfficer.findByName();
                    break;
                case 3:
                    System.out.println("Thông tin về danh sách các cán bộ: ");
                    managerOfficer.display();
                    break;
                case 4:
                    System.out.println("Thoát khỏi chương trình: ");
                    managerOfficer.exit();
                    break;
                default:
                    System.out.println("Không có lựa chọn này!");
            }
        }
    }

    private static void menu(){
        System.out.println("Mời bạn lựa chọn chức năng");
        System.out.println("1. Thêm cán bộ: ");
        System.out.println("2. Tìm kiếm theo họ tên: ");
        System.out.println("3. Hiện thị thông tin về danh sách cán bộ: ");
        System.out.println("4. Thoát trương trình!");
    }
}

