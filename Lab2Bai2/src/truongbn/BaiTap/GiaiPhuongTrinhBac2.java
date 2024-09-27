package truongbn.BaiTap;

import java.util.Scanner;

public class GiaiPhuongTrinhBac2 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        
        // Nhập các hệ số a, b và c
        System.out.println("Giải phương trình bậc 2 có dạng: ax^2 + bx + c = 0");
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        
        // Xét trường hợp phương trình bậc nhất khi a = 0
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                double x = -c / b;
                System.out.println("Phương trình có nghiệm bậc nhất x = " + x);
            }
        } else {
            // Trường hợp phương trình bậc hai khi a != 0
            // Tính delta
            double delta = Math.pow(b, 2) - 4 * a * c;
            System.out.println("Delta = " + delta);
            
            // Biện luận theo giá trị của delta
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm thực.");
            } else if (delta == 0) {
                // Nghiệm kép
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép x = " + x);
            } else {
                // Hai nghiệm phân biệt
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có hai nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}
