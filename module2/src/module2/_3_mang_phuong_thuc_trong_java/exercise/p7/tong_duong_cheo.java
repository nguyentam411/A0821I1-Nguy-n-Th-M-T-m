package module2._3_mang_phuong_thuc_trong_java.exercise.p7;

import java.util.Scanner;

public class tong_duong_cheo {
   public static void main(String[] args){
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
       float sum=0;
       for (int k=0;k<row;k++){
           sum+=array[k][k];
       }
       System.out.println("Tổng đường chéo chính là "+sum);
   }
}
