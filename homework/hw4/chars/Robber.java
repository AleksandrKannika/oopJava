package homework.hw4.chars;

import java.util.ArrayList;

public class Robber extends Man {
    public Robber(ArrayList<Man> team, int x, int y) {

        super("хитрый", 8, 3, 0, new int[] { 2, 4 }, 10, 6, 0, 0, "Robber");
        super.team = team;
        super.position = new Vector2(x, y);

    }
}
