package module2._7_abstract_interface.practice.p3;

import module2._6_ke_thua.practice.he_cac_doi_tuong_hinh_hoc.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
       Circle[] circles=new Circle[3];
       circles[0]=new Circle(3.6);
       circles[1]=new Circle();
       circles[2]=new Circle(3.5,"indigo",false);
        System.out.println("Pre-sorted");
        for (Circle circle:circles){
            System.out.println(circle);
        }
        Comparator circleComparator=new CircleComparator();
        Arrays.sort(circles,circleComparator);
        System.out.println("After-sorted:");
        for (Circle circle:circles){
            System.out.println(circle);
        }
    }
}
