package module2._1_introduce_java.exercise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class hello {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Hello: "+name);
    }
}
