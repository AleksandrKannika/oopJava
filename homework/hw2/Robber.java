package homework.hw2;

import java.util.ArrayList;

public class Robber extends Man {
    public Robber(ArrayList<Man> team) {

        super("хитрый", 8, 3, 0, new int[] { 2, 4 }, 10, 6, 0, 0);
        super.team = team;
    }
}
