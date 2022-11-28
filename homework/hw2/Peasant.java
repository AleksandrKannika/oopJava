package homework.hw2;

import java.util.ArrayList;

public class Peasant extends Man {
    public Peasant(ArrayList<Man> team) {
        super("батрак", 1, 1, 0, new int[] { 1 }, 1, 3, 1, 0);
        super.team = team;
    }
}
