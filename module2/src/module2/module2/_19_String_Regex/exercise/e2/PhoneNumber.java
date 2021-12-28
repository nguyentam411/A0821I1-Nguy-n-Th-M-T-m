package module2._19_String_Regex.exercise.e2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phone Number");
        String phonenumb = scanner.nextLine();
        while (!Pattern.matches("^\\(\\d{2}\\)-\\((0)\\d{9}\\)$", phonenumb)) {
            System.out.println("Invalid phone number");
            System.out.println("Phone number again:");
            phonenumb = scanner.nextLine();
        }
        System.out.println("Sucess");
    }
}
