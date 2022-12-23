package homework.hw5.chars;

import java.util.ArrayList;

public class Arbel extends Man{
    public Arbel(ArrayList<Man> team, int x, int y) {
        super("стрела", 6, 3,16, new int[]{2,3}, 10, 4, 0, 0, "Arbel");
        super.team = team;
        super.position = new Vector2(x, y);

    }
    
}
