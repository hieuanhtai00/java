public class mypoint {
    int x, y;

    mypoint() {
        x = 0;
        y = 0;
    }

    mypoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    String ToString() {
        return "( " + x + "," + y + " )";
    }

    double distance(int a, int b) {
        return Math.sqrt(Math.pow(a - x, 2) + Math.pow(b - y, 2));
    }

    double distance(mypoint p1) {
        return Math.sqrt(Math.pow(p1.x - x, 2) + Math.pow(p1.y - y, 2));
    }

    public static void main(String[] args) {
        mypoint mp = new mypoint(10, 20);
        mp.distance(2, 4);
    }
}
