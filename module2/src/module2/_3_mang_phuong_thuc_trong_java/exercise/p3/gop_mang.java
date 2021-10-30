package module2._3_mang_phuong_thuc_trong_java.exercise.p3;

import java.util.Scanner;

public class gop_mang {
    public static void main(String[] args) {
        int size1;
        int[] array1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size1:");
        size1 = scanner.nextInt();
        array1 = new int[size1];
        int i = 0;
        while (i < array1.length ) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
            i++;
        }
        int size2;
        int[] array2;
        System.out.print("Enter a size2:");
        size2 = scanner.nextInt();
        array2 = new int[size2];
        int j= 0;
        while (j < array2.length ) {
            System.out.print("Enter element " + (j + 1) + ": ");
            array2[j] = scanner.nextInt();
            j++;
        }
        int size3=size1+size2;
        int[] array3 = new int[size3];
        for (int m=0;m<array1.length;m++){
            array3[m]=array1[m];
        }
        for (int n=array1.length;n<size3;n++){
            for (int d=0;d<array2.length;) {
                array3[n] = array2[d];
                d++;
            }
        }
        for (int h:array3){
            System.out.println(h);
        }
    }
}
