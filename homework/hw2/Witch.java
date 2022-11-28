package homework.hw2;

import java.util.ArrayList;

public class Witch extends Man {
    public Witch(ArrayList<Man> team) {
        super("читер", 17, 12, 0, new int[] { -5 }, 30, 9, 0, 1);
        super.team = team;
    }
}
