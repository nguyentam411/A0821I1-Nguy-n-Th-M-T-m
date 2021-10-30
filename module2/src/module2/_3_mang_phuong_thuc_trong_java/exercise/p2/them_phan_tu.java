package module2._3_mang_phuong_thuc_trong_java.exercise.p2;

import java.util.Scanner;

public class them_phan_tu {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size:");
        size = scanner.nextInt();
        array = new int[size+1];
        int i = 0;
        while (i < array.length-1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Number insert");
        int num= scanner.nextInt();
        System.out.println("Position:");
        int index= scanner.nextInt();
        if (index<=1||index>=array.length-1){
            System.out.println("Can't insert");
        }else {
            for (int j =array.length-1;j>index;j--){
                array[j]=array[j-1];
            }
            array[index]=num;
        }
        for (int k:array){
            System.out.println(k);
        }
    }
}
