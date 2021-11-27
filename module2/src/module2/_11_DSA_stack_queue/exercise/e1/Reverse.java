package module2._11_DSA_stack_queue.exercise.e1;

import java.util.LinkedList;

public class Reverse {
    private static LinkedList wStack = new LinkedList();
    private static LinkedList Stack = new LinkedList();

    public static void reverseNumber() {
        int[] arrays= {1,2,3,4,5};
        for (int i=0;i<arrays.length;i++){
            Stack.push(arrays[i]);
        }
        System.out.print("Mảng đảo ngược: ");
        for (int i=0;i<arrays.length;i++){
            System.out.print(Stack.pop());
        }
        System.out.println();
    }

    public static void reverseString(String str) {
        for (int i = 0; i < str.length(); i++) {
            wStack.push(str.charAt(i) + "");
        }
        System.out.print("Chuỗi đảo ngược: ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(wStack.pop());
        }
    }

    public static void main(String[] args) {
        reverseNumber();
        reverseString("abc");
    }
}

