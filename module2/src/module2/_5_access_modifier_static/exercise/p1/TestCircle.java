package module2._5_access_modifier_static.exercise.p1;

public class TestCircle {
    public static void main(String[] args) {
        module2._5_access_modifier_static.practice.p3.Circle circle = new module2._5_access_modifier_static.practice.p3.Circle(3);
        System.out.println("Radious: " + circle.getRadious());
        System.out.println("Area: " + circle.getArea());
        module2._5_access_modifier_static.practice.p3.Circle circle1=new module2._5_access_modifier_static.practice.p3.Circle();
        System.out.println("Radious1: "+circle1.getRadious());
    }
}
