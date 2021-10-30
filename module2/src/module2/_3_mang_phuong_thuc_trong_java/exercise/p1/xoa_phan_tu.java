package module2._3_mang_phuong_thuc_trong_java.exercise.p1;

import java.util.Scanner;

public class xoa_phan_tu {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size:");
        size = scanner.nextInt();
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Find:");
        int find = scanner.nextInt();
        for (int j = 0; j < array.length; j++) {
            if (array[j] == find) {
                for (int k=j;k<array.length-1;k++) {
                    array[k] = array[k + 1];
                }
                array[array.length - 1] = 0;
            }
        }

        for (int k : array) {
            System.out.println(k);
        }
    }
}
