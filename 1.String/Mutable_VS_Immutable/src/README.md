Mutable (thay đổi được) đề cập đến các đối tượng có thể được thay đổi trạng thái của chúng sau khi được khởi tạo. 
Các thuộc tính của các đối tượng có thể được thay đổi bằng cách sử dụng các phương thức public hoặc thông qua việc truy cập trực tiếp vào các thuộc tính đó. 
Ví dụ về các đối tượng có thể thay đổi được là các đối tượng của lớp ArrayList, StringBuilder, StringBuffer hoặc các đối tượng của lớp bất kỳ được tạo bởi người dùng.

Immutable (không thay đổi được) đề cập đến các đối tượng không thể thay đổi trạng thái của chúng sau khi được tạo. 
Các thuộc tính của các đối tượng Immutable được đặt giá trị một lần khi đối tượng được khởi tạo và không thể thay đổi bằng cách sử dụng phương thức public hoặc thông qua việc truy cập trực tiếp vào các thuộc tính đó. 
Ví dụ về các đối tượng Immutable là các đối tượng của lớp String, Integer hoặc các đối tượng của lớp bất kỳ được thiết kế để không thay đổi.

Lợi ích của việc sử dụng đối tượng Immutable là an toàn đa luồng, vì các đối tượng Immutable không thể bị thay đổi bởi các luồng khác. 
Ngoài ra, các đối tượng Immutable có thể được sử dụng an toàn trong các cấu trúc dữ liệu như Set hoặc Map, vì các đối tượng này đảm bảo không bao giờ thay đổi giá trị sau khi được thêm vào.

Trong Java, có nhiều cách để tạo ra các đối tượng Immutable. 
Một trong số đó là định nghĩa tất cả các thuộc tính là final, đồng thời tạo một constructor hoặc phương thức tĩnh (static method) để khởi tạo các thuộc tính đó. 
Một cách khác là sử dụng các lớp đã được xây dựng sẵn trong Java, chẳng hạn như lớp String hoặc lớp Integer.