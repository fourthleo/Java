package myClass;

import java.util.Scanner;

public class HinhTron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhập bán kính hình tròn: ");
        double banKinh = scanner.nextDouble();
        
        double chuVi = 2 * Math.PI * banKinh;
        double dienTich = Math.PI * banKinh * banKinh;
        
        System.out.println("Chu vi Hình Tròn: " + chuVi);
        System.out.println("Diện tích Hình Tròn: " + dienTich);
    }
}
