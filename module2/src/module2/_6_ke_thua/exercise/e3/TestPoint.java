package module2._6_ke_thua.exercise.e3;

import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point(2, 3);
        System.out.println(point);
        float[] res1 = point.getXY();
        System.out.println(Arrays.toString(res1));

        MovablePoint movablePoint = new MovablePoint(4, 5, 6, 7);
        System.out.println(movablePoint.move());
    }
}
