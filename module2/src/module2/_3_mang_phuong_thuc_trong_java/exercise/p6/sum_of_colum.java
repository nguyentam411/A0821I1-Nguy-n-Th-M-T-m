package module2._3_mang_phuong_thuc_trong_java.exercise.p6;

import java.util.Scanner;

public class sum_of_colum {
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
        System.out.println("Enter collum find(from collum 0)");
        int find=scanner.nextInt();
        float sum=0;
        for (int k=0;k<row;k++){
            sum+=array[k][find];
        }
        System.out.println("Tổng của cột "+find+" là "+sum);
    }
}
