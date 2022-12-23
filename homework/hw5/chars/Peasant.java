package homework.hw5.chars;

import java.util.ArrayList;

public class Peasant extends Man {
    public Peasant(ArrayList<Man> team, int x, int y) {
        super("батрак", 1, 1, 0, new int[] { 1 }, 1, 3, 1, 0, "Peasant");
        super.team = team;
        super.position = new Vector2(x, y);

    }
    
    

    @Override
    public void Step(ArrayList<Man> team) {
        setStatus();
    }
}
