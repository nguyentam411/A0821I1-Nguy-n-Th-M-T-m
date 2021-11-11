package module2._7_abstract_interface.practice.p3;

import module2._6_ke_thua.practice.he_cac_doi_tuong_hinh_hoc.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1,Circle c2){
        if (c1.getRadius()>c2.getRadius()) return 1;
        else if (c1.getRadius()<c2.getRadius()) return -1;
        else return 0;
    }
}
