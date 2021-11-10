package module2._7_abstract_interface.practice.p2;

import module2._6_ke_thua.practice.he_cac_doi_tuong_hinh_hoc.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle(){}
    public ComparableCircle(double radious){
        super(radious);
    }
    public ComparableCircle(double radious,String color, boolean filled){
        super(radious, color,filled);
    }
    @Override
    public int compareTo(ComparableCircle o){
        if (getRadius()>o.getRadius()) return 1;
        else if (getRadius()<o.getRadius()) return -1;
        else return 1;
    }
}
