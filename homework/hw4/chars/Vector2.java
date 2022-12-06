package homework.hw4.chars;

public class Vector2 {
    private int x;
    private int y;

    public Vector2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isEquals(Vector2 pos){
        if (pos.x == x & pos.y == y) return true;
        return false;
    }

    public double distance(Vector2 enemy){
        return Math.sqrt((enemy.x - x)^2 + (enemy.y - y)^2);
    }
}
