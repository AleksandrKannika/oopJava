package homework.hw3.chars;

import java.util.ArrayList;

public class Witch extends Man {
    public Witch(ArrayList<Man> team, int x,int y) {
        super("читер", 17, 12, 0, new int[] { -5 }, 30, 9, 0, 1, "Witch");
        super.team = team;
        super.position = new Vector2(x, y);

    }
}
