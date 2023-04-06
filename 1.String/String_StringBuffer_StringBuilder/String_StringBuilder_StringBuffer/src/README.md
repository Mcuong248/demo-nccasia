## String:
- String là một đối tượng không thể thay đổi. Nghĩa là, nếu bạn muốn sửa đổi nội dung của chuỗi, bạn cần tạo một đối tượng mới.
- Khi bạn thực hiện các phép toán trên đối tượng String, Java tạo ra các đối tượng chuỗi mới cho mỗi phép toán. 
Do đó, String không hiệu quả về mặt tài nguyên.
- Vì String là đối tượng không thể thay đổi, nên nó an toàn để sử dụng trong đa luồng.
- Vì vậy, nó phù hợp để sử dụng trong môi trường đa luồng.

## StringBuffer
- StringBuffer được sử dụng để tạo và sửa đổi chuỗi. 
Vì StringBuffer là một đối tượng có thể thay đổi, bạn có thể thực hiện các phép toán trên đối tượng này mà không cần tạo ra đối tượng mới.
- Khi bạn thực hiện các phép toán trên đối tượng StringBuffer, Java không tạo ra các đối tượng chuỗi mới. 
Thay vào đó, Java sử dụng bộ nhớ hiện có của đối tượng StringBuffer để thực hiện các phép toán này
- Vì StringBuffer là đối tượng có thể thay đổi, nên nó không an toàn để sử dụng trong đa luồng mà không có các phương pháp đồng bộ hóa.

## StringBuilder
- StringBuilder giống như StringBuffer, nó được sử dụng để tạo và sửa đổi chuỗi.
- Tuy nhiên, StringBuilder nhanh hơn StringBuffer trong môi trường đơn luồng do nó không đồng bộ hóa.
- Tương tự như StringBuffer, StringBuilder không an toàn để sử dụng trong đa luồng mà không có các phương pháp đồng bộ hóa.

Nếu bạn đang làm việc với chuỗi trong một môi trường đơn luồng, thì StringBuilder là lựa chọn tốt nhất vì nó nhanh hơn StringBuffer\
Tuy nhiên, nếu bạn đang làm việc với chuỗi trong một môi trường đa luồng, thì bạn nên sử dụng StringBuffer để đảm bảo tính an toàn và đồng bộ