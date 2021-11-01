package module2._3_mang_phuong_thuc_trong_java.exercise.p8;

import java.util.Scanner;

public class dem_ki_tu_giong {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        str = sc.nextLine();
        System.out.println("Nhập kí tự cần kiểm tra: ");
        char c;
        c = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của kí tự là "+count);
    }
}
