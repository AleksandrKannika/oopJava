package homework.hw3.chars;

public class Vector2 {
    public int x;
    public int y;

    public Vector2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isEquals(Vector2 pos){
        if (pos.x == x & pos.y ==y) return true;
        return false;
    }
}
