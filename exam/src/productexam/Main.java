package productexam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductService productService = new ProductService();
        int choice;
        do {
            System.out.println(
                    "Menu\n" +
                            "1. Add new product\n" +
                            "2. Delete product\n" +
                            "3. Display products\n" +
                            "4. Find product\n" +
                            "5. Exist"
            );
            System.out.println("Please choice:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Do you want add ProductAuthentic(1) or HandGoods(2)?");
                    choice = scanner.nextInt();
                    System.out.println("ID:");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Name:");
                    String name = scanner.nextLine();
                    System.out.println("Price:");
                    int price = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Brand: ");
                    String brand = scanner.nextLine();
                    if (choice == 1) {
                        System.out.println("Time");
                        String time = scanner.nextLine();
                        ProductAuthentic productAuthentic = new ProductAuthentic(id, name, price, brand, time);
                        productService.add(choice, productAuthentic);
                    } else {
                        System.out.println("Country:");
                        String country = scanner.nextLine();
                        System.out.println("Status:");
                        String status = scanner.nextLine();
                        HandGoods handGoods = new HandGoods(id, name, price, brand, country, status);
                        productService.add(choice, handGoods);
                    }
                    break;
                case 2:

                case 3:
                    System.out.println(productService.getAll());
                    break;
                case 4:
                case 5:
                    break;
            }
        } while (choice > 0 && choice <= 5);
    }
}
