package myClass;

import java.util.Scanner;

public class DoiDonVi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Đổi Km sang m
        System.out.println("Nhập số Km: ");
        double km = scanner.nextDouble();
        double m = km * 1000;
        System.out.println(km + " km = " + m + " m");
        
        // Đổi Byte sang Bit
        System.out.println("Nhập số Byte: ");
        int byteData = scanner.nextInt();
        int bit = byteData * 8;
        System.out.println(byteData + " Byte = " + bit + " Bit");
    }
}
