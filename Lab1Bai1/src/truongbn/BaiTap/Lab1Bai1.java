package truongbn.BaiTap;

import java.util.Scanner;

public class Lab1Bai1 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        
        // Nhập họ và tên
        System.out.print("Họ và tên: ");
        String hoTen = scanner.nextLine();  // Đọc chuỗi nhập vào
        
        // Nhập điểm trung bình
        System.out.print("Điểm TB: ");
        double diemTB = scanner.nextDouble();  // Đọc số thực nhập vào
        
        // Xuất kết quả ra màn hình
        System.out.printf("%s %.2f điểm", hoTen, diemTB);  // In ra kết quả với 2 chữ số thập phân cho điểm
    }
}


