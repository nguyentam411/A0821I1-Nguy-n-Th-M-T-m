package module2._2_vong_lap_java.practice.p2;

import java.util.Scanner;

public class interest_calculator {
    public static void main(String[] args) {
        double money ;
        int month ;
        double interestRate ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = input.nextDouble();
        System.out.println("Enter number of months: ");
        month = input.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = input.nextDouble();
        double totalInterest = money * (interestRate/100)/12*month ;
        System.out.println("Total of interest: " + totalInterest);
    }
}
