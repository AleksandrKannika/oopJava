package homework.hw5.chars;

import java.util.ArrayList;

public class Robber extends Man {
    public Robber(ArrayList<Man> team, int x, int y) {

        super("хитрый", 8, 3, 0, new int[] { 2, 4 }, 10, 6, 0, 0, "Robber");
        super.team = team;
        super.position = new Vector2(x, y);

    }
// @Override
// public String toString() {
//     return "" + get
// }

private Man target (ArrayList<Man> team){
    int minInd = 0;
    float min = Float.MAX_VALUE;
    for (int i = 1; i < team.size(); i++) {
        if (team.get(i).getStatus() == "RIP") continue;
            float x = getPosition().distance(team.get(i).getPosition());
            if (min > x){
                min = x;
                minInd = i;
        }
    }
    return team.get(minInd);
}


@Override
public void Step(ArrayList<Man> team) {
        Man evill = target(team);
        int newX = getPosition().x;
        int newY = getPosition().y;
        if (getPosition().distance(evill.getPosition()) < 2){   
            getDmg();
        }
        else {
            if(evill.getPosition().x > getPosition().x)
                setPosition(new Vector2(newX++, newY));
            else if(evill.getPosition().x < getPosition().x)
                setPosition(new Vector2(newX--, newY));
            else if(evill.getPosition().y > getPosition().y)
                setPosition(new Vector2(newX, newY++));
            else if(evill.getPosition().y< getPosition().y)
                setPosition(new Vector2(newX, newY--));

            }
    }
private double getDmg() {
    
    return 3;
}

}
