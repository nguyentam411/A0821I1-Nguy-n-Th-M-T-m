package module2.casestudy.FurumaResort.views;

import module2.casestudy.FurumaResort.utils.CommonUtil;

public class PromotionView {
    static void promotionManagement(){
        System.out.println("--- Promotion View: ---\n"+
                "1. Display list customer use service\n"+
                "2. Display customer get voucher\n"+
                "3. Return main menu\n");
        int choice=0;
        do {
            System.out.println("Input your choice: ");
            choice=Integer.parseInt(CommonUtil.getScanner().nextLine());
        }while (choice<0|| choice>3);
        switch (choice){
            case 1:
                displayCustomerService();
                break;
            case 2:
                displayCustomerVoucher();
                break;
            case 3:
                HomeView.displayMainMenu();
        }
    }
    private static void displayCustomerService(){

    }
    private static void displayCustomerVoucher(){

    }
}
