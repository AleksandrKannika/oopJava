package homework.hw2;

import java.util.ArrayList;

public class Spearman extends Man {
    public Spearman(ArrayList<Man> team) {
        super("шпала", 4, 5, 0, new int[] { 1, 3 }, 10, 4, 0, 0);
        super.team = team;
    }
}
