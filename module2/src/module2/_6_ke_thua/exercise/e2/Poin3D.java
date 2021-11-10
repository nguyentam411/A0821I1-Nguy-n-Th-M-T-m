package module2._6_ke_thua.exercise.e2;

public class Poin3D extends Poin2D {
    private float z;

    public Poin3D(){}

    public Poin3D(float x,float y,float z) {
        setXY(x,y);
        this.z= z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        setXY(x,y);
        this.z= z;
    }

    public float[] getXYZ(){
        float[] res= {getX(), getY(), getZ()};
        return res;
    }

    @Override
    public String toString() {
        return "Point3D{ x="+ getY()+ " y= "+ getY() +
                " z=" + z +
                '}';
    }
}
