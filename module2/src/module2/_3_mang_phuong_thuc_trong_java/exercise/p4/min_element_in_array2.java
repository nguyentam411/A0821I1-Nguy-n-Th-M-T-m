package module2._3_mang_phuong_thuc_trong_java.exercise.p4;

import java.util.Scanner;

public class min_element_in_array2 {
    public static void main(String[] args) {
        int row;
        int col;
        float[][] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row:");
        row = scanner.nextInt();
        System.out.println("Enter collum");
        col = scanner.nextInt();
        array = new float[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]");
                array[i][j] = scanner.nextFloat();
            }
        }
        int pos1 = 0;
        int pos2 = 0;
        float min = array[0][0];
        for (int m = 0; m < row; m++) {
            for (int n = 0; n < col; n++) {
                if (array[m][n] < min) {
                    min = array[m][n];
                    pos1 = m;
                    pos2 = n;
                }
            }
        }
        System.out.println("Gía trị nhỏ nhất là: "+min+" nằm ở hàng "+pos1+1+" cột "+pos2+1);
    }
}
