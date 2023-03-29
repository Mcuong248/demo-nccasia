import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManager {
    private List<Document> documents = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // Thêm mới tài liệu: Sách, tạp chí, Báo
    public void addDocument(){
        System.out.println("Nhập loại tài liệu (1-Book, 2-Journal, 3-NewPaper): ");
        int officerType = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhập mã tài liệu sách: ");
        String id = sc.nextLine();
        System.out.println("Nhập tên nhà sản xuất: ");
        String name = sc.nextLine();
        System.out.println("Nhập số bản phát hành: ");
        int number = sc.nextInt();
        sc.nextLine();

        if (officerType == 1){
            System.out.println("Nhập tên tác giả: ");
            String author = sc.nextLine();
            System.out.println("Nhập số trang: ");
            int pageNumber = sc.nextInt();
            Book b = new Book(id,name,number,author,pageNumber);
            documents.add(b);
        } else if (officerType == 2) {
            System.out.println("Nhập số phát hành: ");
            int issueNumber = sc.nextInt();
            System.out.println("Nhập tháng phát hành: ");
            int monthIssue = sc.nextInt();
            Journal j = new Journal(id,name,number,issueNumber,monthIssue);
            documents.add(j);
        } else if (officerType == 3) {
            System.out.println("Nhập ngày phát hành: ");
            int releaseDate = sc.nextInt();
            NewsPaper nPaper = new NewsPaper(id,name,number,releaseDate);
            documents.add(nPaper);
        }else {
            System.out.println("Không có lựa chọn này!");
        }
    }

    // Xóa tài liệu theo mã
    public boolean dltDocumentById(String id) {
        Document doc = this.documents.stream()
                .filter(document -> document.getId().equals(id))
                .findFirst().orElse(null);
        if (doc == null) {
            return false;
        }
        this.documents.remove(doc);
        return true;
    }

    // Hiển thị thông tin về tài liệu
    public void display(){
        for (Document document : documents){
            System.out.println(document);
        }
    }

    // Tìm kiếm tài liệu theo loại
    public void searchByBook() {
        this.documents.stream().filter(doc -> doc instanceof Book).forEach(doc -> System.out.println(doc.toString()));
    }

    public void searchByNewspaper() {
        this.documents.stream().filter(doc -> doc instanceof NewsPaper).forEach(doc -> System.out.println(doc.toString()));
    }

    public void searchByJournal() {
        this.documents.stream().filter(doc -> doc instanceof Journal).forEach(doc -> System.out.println(doc.toString()));
    }

    // Thoát khỏi chương trình
    public void exit(){
        System.out.println("Đã thoát khỏi chương trình");
        System.exit(0);
    }
}

