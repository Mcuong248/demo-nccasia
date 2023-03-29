import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Scanner sc = new Scanner(System.in);
        boolean isContinue = false;
        while (!isContinue){
            menu();
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    bookManager.addDocument();
                    System.out.println("Tài liệu đã thêm: ");
                    bookManager.display();
                    break;
                case 2:
                    System.out.println("Nhập mã tài liệu cần xóa: ");
                    sc.nextLine();
                    String id = sc.nextLine();
                    System.out.println(bookManager.dltDocumentById(id));
                    break;
                case 3:
                    bookManager.display();
                    break;
                case 4:
                    System.out.println("Nhập tài liệu cần tìm kiếm (1-Book, 2-Journal, 3-NewPaper): ");
                    int type = sc.nextInt();
                    if (type == 1){
                        bookManager.searchByBook();
                    } else if (type == 2) {
                        bookManager.searchByJournal();
                    }else if (type == 3){
                        bookManager.searchByNewspaper();
                    }else {
                        System.out.println("Không có lựa chọn này!");
                    }
                    break;
                case 5:
                    System.out.println("Thoát khỏi chương trình: ");
                    bookManager.exit();
                    break;
            }
        }
    }

    private static void menu(){
        System.out.println("Mời bạn lựa chọn chức năng");
        System.out.println("1.Thêm mới tài liêu:Sách, tạp chí, báo ");
        System.out.println("2.Xoá tài liệu theo mã tài liệu ");
        System.out.println("3.Hiện thị thông tin về tài liệu ");
        System.out.println("4.Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo ");
        System.out.println("5.Thoát khỏi chương trình ");
    }
}
