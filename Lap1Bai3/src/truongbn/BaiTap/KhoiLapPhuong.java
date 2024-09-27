package truongbn.BaiTap;

import java.util.Scanner;

public class KhoiLapPhuong {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        
        // Nhập cạnh của khối lập phương
        System.out.print("Nhập cạnh của khối lập phương: ");
        double canh = scanner.nextDouble();
        
        // Tính thể tích khối lập phương
        double theTich = Math.pow(canh, 3);
        
        // Xuất thể tích ra màn hình
        System.out.println("Thể tích khối lập phương: " + theTich);
    }
}
