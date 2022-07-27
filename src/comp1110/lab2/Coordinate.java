package comp1110.lab2;

public class Coordinate {
    private int x, y;

    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return String.format("(%d, %d)", this.getX(), this.getY());
    }
    public Coordinate(int x, int y) {
        this.setX(x);
        this.setY(y);
    }
    public Coordinate(int v) {
        this.setX(v);
        this.setY(v);
    }
}
