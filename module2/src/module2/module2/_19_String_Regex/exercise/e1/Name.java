package module2._19_String_Regex.exercise.e1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Name {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Name: ");
        String name=scanner.nextLine();
        Pattern pattern=Pattern.compile("^((C|P|A)\\d{4}(G|H|I|K|L|M))$");
        Matcher matcher= pattern.matcher(name);
        while (!matcher.matches()){
            System.out.println("Invalid name");
            System.out.println("Name:");
            name=scanner.nextLine();
            matcher= pattern.matcher(name);
        }
        System.out.println("Success");

    }
}
