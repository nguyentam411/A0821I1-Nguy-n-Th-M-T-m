package module2._3_mang_phuong_thuc_trong_java.exercise.p5;

import java.util.Scanner;

public class min_element_in_array {
    public static void main(String[] args){
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size:");
        size = scanner.nextInt();
        array = new int[size];
        int i = 0;
        while (i < array.length ) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        int max=array[0];
        for (int j=1;j<array.length;j++){
            if (array[j]<max){
                max=array[j];
            }
        }
        System.out.println("Gía trị nhỏ nhất là "+max);
    }
}
