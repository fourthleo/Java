package truongbn.BaiTap;

import java.util.Scanner;

public class MenuChucNang {

    // Phương thức menu để xuất thực đơn và nhận lựa chọn
    public static void menu() {
        System.out.println("+-------------------------+");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Kết thúc");
        System.out.println("+-------------------------+");
        System.out.print("Chọn chức năng: ");
    }

    // Phương thức giải phương trình bậc nhất
    public static void giaiPTB1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;
            System.out.println("Phương trình có nghiệm x = " + x);
        }
    }

    // Phương thức giải phương trình bậc 2
    public static void giaiPTB2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                double x = -c / b;
                System.out.println("Phương trình bậc nhất có nghiệm x = " + x);
            }
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm thực.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có hai nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }

    // Phương thức tính tiền điện
    public static void tinhTienDien() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số điện sử dụng: ");
        int soDien = scanner.nextInt();
        int tienDien = 0;

        if (soDien <= 50) {
            tienDien = soDien * 1000;
        } else {
            tienDien = 50 * 1000 + (soDien - 50) * 1200;
        }

        System.out.println("Tiền điện phải trả: " + tienDien + " đồng");
    }

    // Phương thức main để chạy chương trình
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            menu();  // Hiển thị menu
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    giaiPTB1();  // Gọi phương thức giải phương trình bậc nhất
                    break;
                case 2:
                    giaiPTB2();  // Gọi phương thức giải phương trình bậc hai
                    break;
                case 3:
                    tinhTienDien();  // Gọi phương thức tính tiền điện
                    break;
                case 4:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 4);  // Lặp lại cho đến khi chọn "4. Kết thúc"
    }
}
