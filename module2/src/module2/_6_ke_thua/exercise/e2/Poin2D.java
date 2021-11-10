package module2._6_ke_thua.exercise.e2;

public class Poin2D {
    private float x;
    private float y;

    public Poin2D(){}

    public Poin2D(float x,float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x= x;
        this.y= y;
    }

    public float[] getXY(){
        float[] res= {x, y};
        return res;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
