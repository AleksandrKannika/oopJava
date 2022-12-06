package homework.hw4.chars;

import java.util.ArrayList;

public class Monk extends Man {
    public Monk(ArrayList<Man> team, int x, int y) {
        super("лысый", 12, 7, 0, new int[] { -4 }, 30, 5, 0, 1, "Monk");
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
