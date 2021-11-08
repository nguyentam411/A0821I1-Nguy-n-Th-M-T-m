package module2._2_vong_lap_java.exercise.p1;

import java.util.Scanner;

public class menu_ve_hinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 4) {
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case (1):
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("1. Top-left");
                    System.out.println("2. Top-right");
                    System.out.println("3. Bottom-left");
                    System.out.println("4. Bottom-right");
                    System.out.println("Enter your choice");
                    int newChoice = input.nextInt();
                    switch (newChoice) {
                        case (1):
                            for (int i = 5; i >= 1; i--) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.print("\n");
                            }
                            break;
                        case (2):
                            for (int i = 1; i <= 5; i++) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print(" ");
                                }
                                for (int k = 5; k >= i; k--) {
                                    System.out.print("*");
                                }
                                System.out.print("\n");
                            }
                            break;
                        case (3):
                            for (int i = 1; i <= 5; i++) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.print("\n");
                            }
                            break;
                        case (4):
                            for (int i = 5; i >= 1; i--) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print(" ");
                                }
                                for (int k = 5; k >=i; k--) {
                                    System.out.print("*");
                                }
                                System.out.print("\n");
                            }
                            break;
                    }
                    break;
                case (3):
                    for (int i = 0; i < 5; i++) {
                        for (int j = 5; j > i; j--) {
                            System.out.print(" ");
                        }

                        for (int k = 0; k < i ; k++) {
                            System.out.print("*");
                        }
                        for (int h = 0; h <= i; h++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
