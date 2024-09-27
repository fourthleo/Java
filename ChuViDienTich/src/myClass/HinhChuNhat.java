package myClass;

import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhập chiều dài: ");
        double dai = scanner.nextDouble();
        
        System.out.println("Nhập chiều rộng: ");
        double rong = scanner.nextDouble();
        
        double chuVi = 2 * (dai + rong);
        double dienTich = dai * rong;
        
        System.out.println("Chu vi Hình chữ nhật là: " + chuVi);
        System.out.println("Diện tích Hình chữ nhật là: " + dienTich);
    }
}
