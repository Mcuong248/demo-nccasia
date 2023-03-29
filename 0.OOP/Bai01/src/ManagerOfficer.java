import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerOfficer {
    private List<Officer> officerList = new ArrayList<>();

    // Thêm mới cán bộ
    Scanner sc = new Scanner(System.in);
    public void addOfficer(){
            System.out.println("Nhập loại cán bộ (1-Worker, 2-Engineer, 3-Staff): ");
            int officerType = sc.nextInt();
            sc.nextLine();

            System.out.println("Nhập họ tên: ");
            String name = sc.nextLine();
            System.out.println("Nhập tuổi: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhập giới tính: ");
            String gender = sc.nextLine();
            System.out.println("Nhập địa chỉ: ");
            String address = sc.nextLine();

            if (officerType == 1){
                System.out.println("Nhập bậc: ");
                int level = sc.nextInt();
                Worker workers = new Worker(name, age, gender, address, level);
                officerList.add(workers);
            } else if (officerType == 2) {
                System.out.println("Nhập ngành đào tạo: ");
                String branch = sc.nextLine();
                Engineer engineer = new Engineer(name, age, gender, address, branch);
                officerList.add(engineer);
            } else if (officerType == 3) {
                System.out.println("Nhập công việc: ");
                String task = sc.nextLine();
                Staff staff = new Staff(name, age, gender, address, task);
                officerList.add(staff);
            }else {
                System.out.println("Không có loại cán bộ này! ");
            }
        }




    // Tìm kiếm theo họ tên
    public void findByName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên cán bộ cần tìm: ");
        String name = sc.nextLine();
        boolean found = false;
        for (Officer officer : officerList) {
            if (officer.getName().equalsIgnoreCase(name)) {
                System.out.println(officer.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy cán bộ nào có họ tên là " + name);
        }
    }

    // Hiện thị danh sách các cán bộ
    public void display(){
        for (Officer o : officerList){
            System.out.println(o);
        }
    }

    // Thoát khỏi chương trình
    public void exit(){
        System.out.println("Đã thoát khỏi chương trình: ");
        System.exit(0);
    }
}

