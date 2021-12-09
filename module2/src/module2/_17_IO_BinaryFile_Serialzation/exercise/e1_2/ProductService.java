package module2._17_IO_BinaryFile_Serialzation.exercise.e1_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductService {
//    private static List<module2._17_IO_BinaryFile_Serialzation.exercise.e1.Product> productList = new ArrayList<module2._17_IO_BinaryFile_Serialzation.exercise.e1.Product>();
//
//    static void creat(module2._17_IO_BinaryFile_Serialzation.exercise.e1.Product product) throws IOException {
//        productList.add(product);
//       // writeToFile("src/module2/_17_IO_BinaryFile_Serialzation/exercise/e1/Product.txt", productList);
//    }
//
//    static void display() throws IOException, ClassNotFoundException {
////        for (int i = 0; i < productList.size(); i++) {
////            System.out.println(productList.get(i));
////        }
//    //    List<module2._17_IO_BinaryFile_Serialzation.exercise.e1.Product> productDataFromFile = readDataFromFile("src/module2/_17_IO_BinaryFile_Serialzation/exercise/e1/Product.txt");
//        for (module2._17_IO_BinaryFile_Serialzation.exercise.e1.Product product : productDataFromFile) {
//            System.out.println(product);
//        }
//    }
//
//    static void search(String name) {
//        List<module2._17_IO_BinaryFile_Serialzation.exercise.e1.Product> res = new ArrayList<module2._17_IO_BinaryFile_Serialzation.exercise.e1.Product>();
//        int size = productList.size();
//        for (int i = 0; i < size; i++) {
//            if (productList.get(i).getName().contains(name)) {
//                res.add(productList.get(i));
//            }
//        }
//        System.out.println(res);
//    }
//    public List<String> readFile(String filePath) throws IOException {
//        List<String> productList=new ArrayList<>();
//        try {
//            File file = new File(filePath);
//            if (!file.exists()) {
//                throw new FileNotFoundException();
//            }
//            BufferedReader br = new BufferedReader(new FileReader((file)));
//            String line = "";
//            while ((line = br.readLine()) != null) {
//                String[] temp = line.split(" ");
//                for (int i = 0; i < temp.length; i++) {
//                    productList.add(temp[i]);
//                }
//            }
//            br.close();
//        }catch (Exception e){
//            System.err.println("File không tồn tại hoặc nội dung có lỗi");
//        }
//        return productList;
//    }

}