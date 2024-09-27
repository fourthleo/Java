package truongbn.BaiTap;

import java.util.Scanner;

public class TinhTienDien {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập số điện từ bàn phím
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số điện sử dụng trong tháng
        System.out.print("Nhập số điện sử dụng: ");
        int soDien = scanner.nextInt();
        
        // Khai báo biến để lưu tiền điện
        int tienDien = 0;
        
        // Tính tiền điện theo phương pháp lũy tiến
        if (soDien <= 50) {
            tienDien = soDien * 1000; // Giá 1000 đồng cho 50 số điện đầu tiên
        } else {
            tienDien = 50 * 1000 + (soDien - 50) * 1200; // 50 số đầu giá 1000, số vượt quá 50 giá 1200
        }
        
        // Xuất kết quả tiền điện
        System.out.println("Tiền điện phải trả: " + tienDien + " đồng");
    }
}

