package module2.casestudy.FurumaResort.views;

import module2.casestudy.FurumaResort.utils.CommonUtil;

public class BookingView {
    static void bookingManagement(){
        System.out.println("--- Booking View: ---\n"+
                "1. Add new booking\n"+
                "2. Display list booking\n"+
                "3. Create new constracts\n"+
                "4. Display list constracts\n"+
                "5. Edit constracts\n"+
                "6. Return main menu\n");
        int choice=0;
        do {
            System.out.println("Input your choice: ");
            choice=Integer.parseInt(CommonUtil.getScanner().nextLine());
        }while (choice<=0|| choice>6);
        switch (choice){
            case 1:
                add();
                break;
            case 2:
                displayBooking();
                break;
            case 3:
                create();
                break;
            case 4:
                displayConstracts();
                break;
            case 5:
                edit();
                break;
            case 6:
                HomeView.displayMainMenu();
        }
    }
    private static void add(){

    }
    private static void displayBooking(){

    }
    private static void create(){

    }
    private static void displayConstracts(){

    }
    private static void edit(){

    }
}
