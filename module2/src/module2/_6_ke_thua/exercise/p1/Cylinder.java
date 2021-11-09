package module2._6_ke_thua.exercise.p1;

public class Cylinder extends Circle {
    private double height=1.0;
    public Cylinder(){
    }
    public Cylinder(double height,double radious, String color){
        super(radious, color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return this.getArea()*this.height;
    }
    public String toString() {
        return "A Cylinder with radius="
                + this.getRadious()
                +", color:"
                +this.getColor()
                + ", height= "
                + this.getHeight()
                +", volume="
                +this.getVolume();
    }

    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder(3,3,"red");
        System.out.println(cylinder);
    }
}
