### Exception là gì?
Exception là một sự kiện mà phá vỡ luồng chuẩn của chương trình. 
Nó là một đối tượng mà được ném tại Runtime. 
Một exception (ngoại lệ) trong Java là một vấn đề xảy ra trong quá trình thực hiện của chương trình. 
Một ngoại lệ có thể xảy ra với nhiều lý do khác nhau.

Để hiểu về cách xử lý ngoại lệ trong Java, bạn cần phải hiểu những loại ngoại lệ như sau:
#### Checked Exception:
Checked Exception: Là ngoại lệ thường xảy ra do người dùng mà không thể lường trước được bởi lập trình viên. 
Ví dụ, một file được mở, nhưng file đó không thể tìm thấy và ngoại lệ xảy ra. 
Những ngoại lệ này không thể được bỏ qua trong quá trình biên dịch. 
Checked Exception là các lớp mà kế thừa lớp Throwable ngoại trừ RuntimeException và Error. 
Ví dụ như IOException, SQLException, … Checked Exception được kiểm tra tại thời gian biên dịch compile-time.
#### Unchecked Exception:
Unchecked Exception: Một ngoại lệ xảy ra ở runtime là ngoại lệ có thể tránh được bởi lập trình viên. 
Unchecked Exception là các lớp kế thừa RuntimeException, ví dụ ArithmaticException, NullPointerException, ArrayIndexOutOfBoundsException, … 
Unchecked Exception không được kiểm tra tại compile-time, thay vào đó chúng được kiểm tra tại runtime.
#### Error:
Error: Nó không giống các exception, nhưng vấn đề xảy ra vượt quá tầm kiểm soát của lập trình viên hay người dùng. 
Error được bỏ qua trong code của bạn vì bạn hiếm khi có thể làm gì đó khi chương trình bị error. 
Ví dụ như OutOfMemoryError, VirtualMachineError, AssertionError, … 
Nó được bỏ qua trong quá trình Java biên dịch.
#### Exception Handling:
Xử lý ngoại lệ (Exception Handling) là một kỹ thuật để xử lý các Runtime Error như ClassNotFound, IO, SQL, Remote, … 
Lợi thế chính của xử lý ngoại lệ là để duy trì luồng chuẩn của ứng dụng. 
Exception thường phá vỡ luồng chuẩn của ứng dụng, và đó là tại sao chúng ta sử dụng Exception Handling.

