package bankaccount.view;

import bankaccount.exception.NotFoundBankAccountException;
import bankaccount.model.PayAccount;
import bankaccount.model.SaveAccount;
import bankaccount.service.PayAccountService;
import bankaccount.service.SaveAccountService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NotFoundBankAccountException {
        Scanner scanner = new Scanner(System.in);
        SaveAccountService saveAccountService = new SaveAccountService();
        PayAccountService payAccountService=new PayAccountService();
        int choice;
        do {
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÍ TÀI KHOẢN NGÂN HÀNG--\n" +
                    "Chọn chức năng theo số để tiếp tục\n" +
                    "1. Thêm mới\n" +
                    "2. Xóa\n" +
                    "3. Xem danh sách các tài khoản ngân hàng\n" +
                    "4. Tìm kiếm\n" +
                    "5. Thoát\n" +
                    "Chọn chức năng:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Mã tài khoản:");
                    int ma = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Tên chủ tài khoản:");
                    String name = scanner.nextLine();
                    System.out.println("Ngày tạo tài khoản");
                    String date = scanner.nextLine();
                    System.out.println("Bạn muốn tạo tài khoản tiết kiệm(1) hay thanh toán(2):");
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    if (choice == 1) {
                        System.out.println("Số tiền gửi tiết kiệm:");
                        int amount = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Ngày gủi tiết kiệm:");
                        String sendDate = scanner.nextLine();
                        System.out.println("Lãi xuất:");
                        int laiSuat = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Kì hạn (số tháng):");
                        int kiHan = scanner.nextInt();
                        SaveAccount saveAccount = new SaveAccount(0, ma, name, date, amount, sendDate, laiSuat, kiHan);
                        saveAccountService.add(saveAccount);
                    } else {
                        System.out.println("Số thẻ");
                        int soThe = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Số tiền trong tài khoản:");
                        int amount = scanner.nextInt();
                        PayAccount payAccount = new PayAccount(0, ma, name, date, soThe, amount);
                        payAccountService.add(payAccount);
                    }
                    break;
                case 2:
                    System.out.println("Bạn muốn xóa tài khoản tiết kiệm(1) hay thanh toán(2)");
                    choice=scanner.nextInt();
                    System.out.println("Mã tài khoản muốn xóa");
                    int code=scanner.nextInt();
                    if (choice==1){
                        saveAccountService.delete(code);
                    }else {
                        payAccountService.delete(code);
                    }
                    break;
                case 3:
                    List<SaveAccount> saveAccountList = saveAccountService.getAll();
                    System.out.println("SaveAccount:");
                    for (SaveAccount saveAccount : saveAccountList) {
                        System.out.println(saveAccount);
                    }
                    List<PayAccount> payAccountList = payAccountService.getAll();
                    System.out.println("PayAccount");
                    for (PayAccount payAccount : payAccountList) {
                        System.out.println(payAccount);
                    }
                    break;
                case 4:
                    System.out.println("Name");
                    scanner.nextLine();
                    String nameFind = scanner.nextLine();
                    List<SaveAccount> saveAccountList1 = saveAccountService.find(nameFind);
                    for (int i = 0; i < saveAccountList1.size(); i++) {
                        System.out.println(saveAccountList1.get(i));
                    }
                    List<PayAccount> payAccountList1 = payAccountService.find(nameFind);
                    for (int i = 0; i < payAccountList1.size(); i++) {
                        System.out.println(payAccountList1.get(i));
                    }
                    break;
                case 5:
                    System.exit(0);

            }
        }while (choice>0&& choice<=5);
    }
}
