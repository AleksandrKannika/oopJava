
package homework.hw3.chars;

import java.util.ArrayList;

public class Sniper extends Man {
    public Sniper(ArrayList<Man> team, int x, int y) {
        super("мышь", 12, 10, 32, new int[] { 8, 10 }, 15, 9, 0, 0, "Sniper");
        super.team = team;
        super.position = new Vector2(x, y);

    }
}
