package module2._6_ke_thua.exercise.e2;

import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Poin2D point2D= new Poin2D(2,3);
        System.out.println(point2D);
        float[] tmp= point2D.getXY();
        System.out.println(Arrays.toString(tmp));

        Poin3D point3D= new Poin3D(4,5,6);
        System.out.println(point3D);
        float[] res= point3D.getXYZ();
        System.out.println(Arrays.toString(res));
    }
}
