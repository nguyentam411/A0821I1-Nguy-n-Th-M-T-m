package module2.casestudy.FurumaResort.views;

import module2.casestudy.FurumaResort.utils.CommonUtil;

public class FacilityView {
    static void facilityManagement(){
        System.out.println("---Facility View: ---\n"+
                "1. Display list facility\n"+
                "2. Add new facility\n" +
                "3. Edit facility\n"+
                "4. Return main menu\n");
        int choice=0;
        do{
            System.out.println("Input your choice: ");
            choice=Integer.parseInt(CommonUtil.getScanner().nextLine());
        }while (choice<=0|| choice>4);
        switch (choice){
            case 1:
                display();
                break;
            case 2:
                create();
                break;
            case 3:
                edit();
                break;
            case 4:
                HomeView.displayMainMenu();
        }
    }
    private static void display(){

    }
    private static void create(){

    }
    private static void edit(){

    }
}
