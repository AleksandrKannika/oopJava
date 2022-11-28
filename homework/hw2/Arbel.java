package homework.hw2;

import java.util.ArrayList;

public class Arbel extends Man{
    public Arbel(ArrayList<Man> team) {
        super("стрела", 6, 3,16, new int[]{2,3}, 10, 4, 0, 0);
        super.team = team;
    }
    
}
