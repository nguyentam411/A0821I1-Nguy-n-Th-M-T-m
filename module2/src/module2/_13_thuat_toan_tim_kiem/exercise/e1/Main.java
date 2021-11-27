package module2._13_thuat_toan_tim_kiem.exercise.e1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();
        LinkedList<Character> max = new LinkedList<Character>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<Character>();
            list.add(string.charAt(i));
            for (int j = i +1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character ch: max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
