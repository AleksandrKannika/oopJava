package homework.hw5.chars;

public class Vector2 {
    protected int x;
    protected int y;

    // public int getX() {
    //     return x;
    // }

    // public int getY() {
    //     return y;
    // }

    public Vector2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isEquals(Vector2 pos){
        if (pos.x == x & pos.y == y) return true;
        return false;
    }

    public float distance(Vector2 enemy){
        return (float) Math.sqrt(((x - enemy.x)^2) + ((y - enemy.y)^2));
    }
}
