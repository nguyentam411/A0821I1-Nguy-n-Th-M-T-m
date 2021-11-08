package module2._5_access_modifier_static.practice.p3;

public class Circle {
    private double radious = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double r) {
        this.radious = r;
    }

    public double getRadious() {
        return radious;
    }

    public double getArea() {
        return radious * radious * Math.PI;
    }


}
