package module2._6_ke_thua.exercise.p1;

public class Circle {
    private double radious = 1.0;
    private String color = "blue";

    public Circle() {
    }


    public Circle(double radious, String color) {
        this.radious=radious;
        this.color=color;
    }


    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radious * radious * Math.PI;
    }

    public String toString() {
        return "A Circle with radius="
                + this.getRadious()
                +", color:"
                +this.getColor()
                + ", area= "
                + this.getArea();
    }

    public static void main(String[] args) {
        Circle circle=new Circle(3,"red");
        System.out.println(circle);
    }
}
