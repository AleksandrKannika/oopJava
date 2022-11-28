
package homework.hw2;

import java.util.ArrayList;

public class Sniper extends Man {
    public Sniper(ArrayList<Man> team) {
        super("мышь", 12, 10, 32, new int[] { 8, 10 }, 15, 9, 0, 0);
        super.team = team;
    }
}
