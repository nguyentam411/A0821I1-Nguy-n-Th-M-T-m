package module2._5_access_modifier_static.practice.p3;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println("Radious: " + circle.getRadious());
        System.out.println("Area: " + circle.getArea());
        Circle circle1=new Circle();
        System.out.println("Radious1: "+circle1.getRadious());
    }
}
