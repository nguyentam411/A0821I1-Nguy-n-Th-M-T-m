package module2._15_exception_debug.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException  {


    public static void main(String[] args) {
        try {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Side 1:");
            int side1=scanner.nextInt();
            System.out.println("Side 2:");
            int side2=scanner.nextInt();
            System.out.println("Side 3");
            int side3=scanner.nextInt();
            if (side1<=0||side2<=0||side3<=0||side1+side2<=side3||side1+side3<=side2||side2+side3<=side1){
                throw new Exception("Invalid side") ;
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
