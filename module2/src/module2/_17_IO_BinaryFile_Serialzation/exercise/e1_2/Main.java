package module2._17_IO_BinaryFile_Serialzation.exercise.e1_2;

import module2._17_IO_BinaryFile_Serialzation.exercise.e1_2.Product;
import module2._17_IO_BinaryFile_Serialzation.exercise.e1_2.ProductService;

import java.io.IOException;
import java.util.Scanner;

public class Main {
//    private static Scanner scanner=new Scanner(System.in);
//    private static ProductService productService=new ProductService();
//
//    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        int choice;
//        do {
//            System.out.println("Menu------");
//            System.out.println(
//                    "1.Thêm sản phẩm\n" +
//                            "2. Hiển thị danh sách sản phẩm\n" +
//                            "3. Tìm kiếm sản phẩm theo tên\n" +
//                            "0. Thoát chương trình");
//            System.out.println("Chọn chức năng: ");
//            choice = scanner.nextInt();
//            switch (choice) {
//                case 1:
//                    System.out.println("Nhập mã:");
//                    int id=scanner.nextInt();
//                    scanner.nextLine();
//                    System.out.println("Nhập tên");
//                    String name=scanner.nextLine();
//                    System.out.println("Nhập thương hiệu:");
//                    String brand=scanner.nextLine();
//                    System.out.println("Nhập giá");
//                    int price=scanner.nextInt();
//                    scanner.nextLine();
//                    System.out.println("Nhập mô tả");
//                    String description=scanner.nextLine();
//                    Product product=new Product(id,name,brand,price,description);
//                   productService.creat(product);
//                   break;
//                case 2:
//                   productService.display();
//                    break;
//                case 3:
//                    System.out.println("Nhập tên muốn tìm:");
//                    scanner.nextLine();
//                    String nameSearch=scanner.nextLine();
//                    productService.search(nameSearch);
//                    break;
//            }
//        } while (choice > 0 && choice <= 3);
//    }


}
