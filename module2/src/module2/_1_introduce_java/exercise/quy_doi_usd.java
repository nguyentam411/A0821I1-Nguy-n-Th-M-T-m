package module2._1_introduce_java.exercise;

import java.util.Scanner;

public class quy_doi_usd {
    public static void main(String[] args){
        double rate=23000;
        double usd;
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền USD:");
        usd=sc.nextDouble();
        double quydoi=usd*rate;
        System.out.println("Gía trị VND: "+quydoi);
    }
}
