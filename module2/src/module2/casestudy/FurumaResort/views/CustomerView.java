package module2.casestudy.FurumaResort.views;

import module2.casestudy.FurumaResort.utils.CommonUtil;

public class CustomerView {
    static void customerManagement(){
        System.out.println("---Customer View: ---\n"+
                "1. Display list customer\n"+
                "2. Add new customer\n" +
                "3. Edit customer\n"+
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
