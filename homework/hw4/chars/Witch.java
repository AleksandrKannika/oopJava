package homework.hw4.chars;

import java.util.ArrayList;

public class Witch extends Man {
    public Witch(ArrayList<Man> team, int x,int y) {
        super("читер", 17, 12, 0, new int[] { -5 }, 30, 9, 0, 1, "Witch");
        super.team = team;
        super.position = new Vector2(x, y);

    }

    @Override
    public void Step(ArrayList<Man> team) {
        Man dying = team.get(0);
        for (int i = 1; i < team.size(); i++) {
            if (team.get(i).getHp() < team.get(i).getMaxHp() && team.get(i).getHp() > 0) {

                if(calcHp(team.get(i))<calcHp(dying))
                dying = team.get(i);
            }
        }
        dying.setHp(getDmg());

    }

    public double calcHp(Man x) {

        return x.getHp() / x.getMaxHp() * 100;

    }
    private int getDmg(){

        return dmg[(int) (Math.random() * dmg.length)];
    }
}
