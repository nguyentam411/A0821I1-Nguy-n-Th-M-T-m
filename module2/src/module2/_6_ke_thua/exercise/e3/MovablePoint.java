package module2._6_ke_thua.exercise.e3;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        setXY(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] res = {xSpeed, ySpeed};
        return res;
    }

    @Override
    public String toString() {
        return "Point: ("
                + this.getX() +
                "," + this.getY() +
                ") speed: ("
                + this.getXSpeed()
                + ","
                + this.getYSpeed()
                + ")";

    }

    public MovablePoint move() {
        this.setX(this.getX() + xSpeed);
        this.setY(this.getY() + ySpeed);
        return this;
    }
}
