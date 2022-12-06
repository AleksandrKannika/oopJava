package homework.hw4.chars;

import java.util.ArrayList;

public class Spearman extends Man {
    public Spearman(ArrayList<Man> team, int x, int y) {
        super("шпала", 4, 5, 0, new int[] { 1, 3 }, 10, 4, 0, 0, "Spearman");
        super.team = team;
        super.position = new Vector2(x, y);

    }
}
