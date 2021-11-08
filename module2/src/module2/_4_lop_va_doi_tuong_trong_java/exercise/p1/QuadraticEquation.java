package module2._4_lop_va_doi_tuong_trong_java.exercise.p1;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticEquation() {
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * a * c;
    }

    public double getRoot1(){
       return (-this.b+Math.pow(this.getDiscriminant(),0.5))/(2*this.a);
    }

    public double getRoot2(){
        return (-this.b-Math.pow(this.getDiscriminant(),0.5))/(2*this.a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhap c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("PT co 2 nghiem là "+quadraticEquation.getRoot1()+" và "+quadraticEquation.getRoot2());
        }else if (quadraticEquation.getDiscriminant()==0){
            System.out.println("PT co nghiem duy nhat la "+quadraticEquation.getRoot1());
        }else {
            System.out.println("PT vô nghiệm");
        }
    }

}
