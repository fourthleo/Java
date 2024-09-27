package truongbn.BaiTap;

import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        
        // Nhập chiều dài và chiều rộng của hình chữ nhật
        System.out.print("Nhập chiều dài: ");
        double dai = scanner.nextDouble();
        
        System.out.print("Nhập chiều rộng: ");
        double rong = scanner.nextDouble();
        
        // Tính chu vi
        double chuVi = (dai + rong) * 2;
        
        // Tính diện tích
        double dienTich = dai * rong;
        
        // Tìm cạnh nhỏ nhất
        double canhNhoNhat = Math.min(dai, rong);
        
        // Xuất kết quả ra màn hình
        System.out.println("Chu vi hình chữ nhật: " + chuVi);
        System.out.println("Diện tích hình chữ nhật: " + dienTich);
        System.out.println("Cạnh nhỏ nhất: " + canhNhoNhat);
    }
}