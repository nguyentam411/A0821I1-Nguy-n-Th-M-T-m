package module2._2_vong_lap_java.exercise.p2;

import java.util.Scanner;

public class _20_so_nguyen_to_dau {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong so nguyen to can in:");
        int number = scanner.nextInt();
        int count=0;
        boolean check=true;
        for (int i=2;count<number;i++){
            if (i !=2) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        check = false;
                        break;
                    }
                }
            }
            if (check){
                System.out.println(i);
                count++;
            }
            check=true;
        }
    }
}
