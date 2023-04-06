#### Nếu một phương thức được khai báo với từ khóa static thì phương thức đó được gọi là phương thức static.
- Một phương thức static thuộc lớp chứ không phải đối tượng của lớp.
- Một phương thức static có thể được gọi mà không cần tạo khởi tạo (instance) của một lớp.
- Phương thức static có thể truy cập biến static và có thể thay đổi giá trị của nó.
- Một phương thức static chỉ có thể gọi một phương thức static khác, không thể gọi được một phương thức non-static.
- Một phương thức static không thể được sử dụng từ khóa this và super.
- Người dùng không thể override (đè) phương thức static trong Java, bởi vì kỹ thuật đè (overriding) phương thức được dựa trên quá trình gán (binding) động khi khi chương trình đang chạy (runtime) và những phương thức static  được gán tĩnh trong thời gian biên dịch. 
Phương thức tĩnh không ràng buộc với thực thể của lớp nên phương thức tĩnh sẽ không thể override (đè).