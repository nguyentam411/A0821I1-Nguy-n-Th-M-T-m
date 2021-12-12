package productexam;

import productexam.model.HandGoods;
import productexam.model.ProductAuthentic;
import productexam.service.HandGoodsService;
import productexam.service.ProductAuthService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductAuthService productAuthService = new ProductAuthService();
        HandGoodsService handGoodsService = new HandGoodsService();
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
                    System.out.println("Add new product");
                    System.out.println("Do you want add ProductAuthentic(1) or HandGoods(2)?");
                    choice = scanner.nextInt();
//                    System.out.println("ID:");
//                    int id = scanner.nextInt();
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
                        ProductAuthentic productAuthentic = new ProductAuthentic(0, name, price, brand, time);
                        productAuthService.add(productAuthentic);
                    } else {
                        System.out.println("Country:");
                        String country = scanner.nextLine();
                        System.out.println("Status:");
                        String status = scanner.nextLine();
                        HandGoods handGoods = new HandGoods(0, name, price, brand, country, status);
                        handGoodsService.add(handGoods);
                    }
                    break;
                case 2:
                    System.out.println("Delete product");
                    System.out.println("Do you want delete ProductAuth(1) or HandGoods(2)");
                    choice = scanner.nextInt();
                    System.out.println("ID delete");
                    int id = scanner.nextInt();
                    if (choice == 1) {
                        productAuthService.delete(id);
                    } else {
                        handGoodsService.delete(id);
                    }
                    break;
                case 3:
                    List<ProductAuthentic> productAuthenticList = productAuthService.getAll();
                    System.out.println("ProductAuthentic:");
                    for (int i = 0; i < productAuthenticList.size(); i++) {
                        System.out.println(productAuthenticList.get(i));
                    }
                    List<HandGoods> handGoodsList = handGoodsService.getAll();
                    System.out.println("HandGoods: ");
                    for (int i = 0; i < handGoodsList.size(); i++) {
                        System.out.println(handGoodsList.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Find product");
                    System.out.println("Name");
                    scanner.nextLine();
                    String nameFind = scanner.nextLine();
                    List<ProductAuthentic> productAuthenticList1=productAuthService.find(nameFind);
                    for (int i = 0; i < productAuthenticList1.size(); i++) {
                        System.out.println(productAuthenticList1.get(i));
                    }
                    List<HandGoods> handGoodsList1=handGoodsService.find(nameFind);
                    for (int i = 0; i < handGoodsList1.size(); i++) {
                        System.out.println(handGoodsList1.get(i));
                    }
                    break;
                case 5:
                    break;
            }
        } while (choice > 0 && choice <= 5);
    }
}
