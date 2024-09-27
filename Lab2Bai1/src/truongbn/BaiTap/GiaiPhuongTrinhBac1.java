package truongbn.BaiTap;

import java.util.Scanner;

public class GiaiPhuongTrinhBac1 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        
        // Nhập hệ số a và b của phương trình bậc nhất
        System.out.println("Giải phương trình bậc nhất có dạng: ax+b=0 ");
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        
        // Kiểm tra giá trị của a và b
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            // Tính nghiệm x = -b/a
            double x = -b / a;
            System.out.println("Phương trình có nghiệm x = " + x);
        }
    }
}
