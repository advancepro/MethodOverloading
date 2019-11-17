package sample;

public class MyPoint {

    protected int x = 0;
    protected int y = 0;

    public MyPoint() {
        this(0, 0);
    }
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int[] getXY() {
        int[] xy = new int[2];
        xy[0] = this.x;
        xy[1] = this.y;
        return xy;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
    public double distance(int x, int y) {
        int xNum = this.x - x;
        int yNum = this.y - y;
        return Math.sqrt(xNum*xNum + yNum*yNum);
    }
    public double distance(MyPoint another) {
        int xNum = this.x - another.x;
        int yNum = this.y - another.y;
        return Math.sqrt(xNum*xNum + yNum*yNum);
    }
    public double distance() {
        int xNum = this.x - 0;
        int yNum = this.y - 0;
        return Math.sqrt(xNum*xNum + yNum*yNum);
    }
}
