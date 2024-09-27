package myClass;

import java.util.Scanner;

public class DoiNgoaiTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhập tỉ giá USD -> VND: ");
        double tiGia = scanner.nextDouble();
        
        System.out.println("Nhập số tiền USD: ");
        double usd = scanner.nextDouble();
        
        double vnd = usd * tiGia;
        System.out.println(usd + " USD = " + vnd + " VND");
    }
}
