package module2._12_Java_Collection_Framework.exercise.e1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManagementLinkedlist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> productList = new ArrayList<Product>();
        Product product1 = new Product(1, "phone", 23);
        productList.add(product1);
        Product product2 = new Product(2, "cake", 20);
        productList.add(product2);

        int choice;
        do {
            System.out.println("Menu------");
            System.out.println(
                    "1.Thêm sản phẩm\n" +
                            "2. Sửa thông tin sản phẩm theo id\n" +
                            "3. Xoá sản phẩm theo id\n" +
                            "4. Hiển thị danh sách sản phẩm\n" +
                            "5. Tìm kiếm sản phẩm theo tên\n" +
                            "6. Sắp xếp sản phẩm tăng dần theo giá\n" +
                            "7. Sắp xếp sản phẩm giảm dần theo giá\n" +
                            "0. Thoát chương trình");
            System.out.println("Chọn chức năng: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int id=productList.size()+1;
                    scanner.nextLine();
                    System.out.println("Nhập tên sản phẩm:");
                    String name = scanner.nextLine();
                    System.out.println("Nhập giá sản phẩm:");
                    int price = scanner.nextInt();
                    Product product = new Product(id, name, price);
                    productList.add(product);
                    break;

                case 2:
                    System.out.println("Sửa thông tin sản phẩm");
                    System.out.println("Nhập id muốn sửa:");
                    int input=scanner.nextInt();
                    for (int i = 0; i < productList.size(); i++) {
                        if (productList.get(i).getId() == input) {
                            scanner.nextLine();
                            System.out.println("Nhập tên:");
                            productList.get(i).setName(scanner.nextLine());
                            System.out.println("Nhập giá:");
                            productList.get(i).setPrice(Integer.parseInt(scanner.nextLine()));
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Xóa sản phẩm-----");
                    System.out.println("Nhập id muốn xóa:");
                    int inputDelete=scanner.nextInt();
                    for (int i = 0; i < productList.size(); i++) {
                        if (productList.get(i).getId() == inputDelete) {
                            productList.remove(i);
                        }
                    }
                    for (int j = inputDelete-1; j < productList.size(); j++) {
                        productList.get(j).setId(j+1);
                    }
                    break;
                case 4:
                    for (int i = 0; i < productList.size(); i++) {
                        System.out.println(productList.get(i).toString());
                    }
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.println("Nhập tên muốn tìm");
                    String find = scanner.nextLine();
                    int count = 0;
                    for (Product productFind : productList) {
                        if (productFind.getName().contains(find)) {
                            System.out.println(productFind);
                            count++;
                        }
                    }
                    if (count == 0) {
                        System.out.println("Không tìm thấy");
                    }
                    break;
                case 6:
                    Collections.sort(productList, new Comparator<Product>() {
                        @Override
                        public int compare(Product o1, Product o2) {
                            return o1.getPrice() - o2.getPrice();
                        }
                    });
                    break;
                case 7:
                    Collections.sort(productList, new Comparator<Product>() {
                        @Override
                        public int compare(Product o1, Product o2) {
                            return o2.getPrice() - o1.getPrice();
                        }
                    });
                    break;
            }
        } while (choice > 0 && choice <= 7);
    }
}
