package module2._15_exception_debug.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Side 1:");
            int side1 = scanner.nextInt();
            System.out.println("Side 2:");
            int side2 = scanner.nextInt();
            System.out.println("Side 3");
            int side3 = scanner.nextInt();
            if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
                throw new IlligleTriangleExcception("Độ dài không âm");
            }
            if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
                throw new IlligleTriangleExcception("Không phải độ dài 3 cạnh của tam giác");
            }
        } catch (IlligleTriangleExcception e) {
            System.out.println(e.getMessage());
        }


    }
}
