package module2.casestudy.FurumaResort.views;

import module2.casestudy.FurumaResort.utils.CommonUtil;

public class HomeView {
    public static void main(String[] args) {

    }

    static void displayMainMenu() {
        System.out.println("Welcome to Furama Resort.\n" +
                "1. Employee Management\n" +
                "2. Customer Management\n" +
                "3. Facility Management\n" +
                "4. Booking Management\n" +
                "5. Promotion Management\n" +
                "6. Exit");
        int choice = 0;
        do {
            System.out.println(choice == 0 ? "Input your choice: " : "Please input value from 1 to 6: ");
            choice = Integer.parseInt(CommonUtil.getScanner().nextLine());
        } while (choice <= 0 || choice > 6);
        switch (choice) {
            case 1:
                EmployeeView.employeeManagement();
                break;
            case 2:
                CustomerView.customerManagement();
                break;
            case 3:
                FacilityView.facilityManagement();
                break;
            case 4:
                BookingView.bookingManagement();
                break;
            case 5:
                PromotionView.promotionManagement();
                break;
            case 6:
                break;
        }
        backToMainMenu();
    }

    static private void backToMainMenu() {
        System.out.println("Do you to back main menu (Y/N):");
        String awser = CommonUtil.getScanner().nextLine();
        if (awser.equalsIgnoreCase("Y")) {
            displayMainMenu();
        } else {
            System.exit(0);
        }

    }
}
