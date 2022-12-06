package homework.hw4.chars;


import java.util.ArrayList;

public class Sniper extends Man {
    public Sniper(ArrayList<Man> team, int x, int y) {
        super("мышь", 12, 10, 32, new int[] { 8, 10 }, 15, 9, 0, 0, "Sniper");
        super.team = team;
        super.position = new Vector2(x, y);
        
    }

    // int arrows = getArrows();
    @Override
    public void Step(ArrayList<Man> team) {
        String mark = "Peasant";
        String stat = "loafer";
        for (int i = 0; i < this.team.size(); i++) {
            if(this.team.get(i).getManType().equals(mark) && this.team.get(i).getStatus() == stat) {
                arrows++;
                team.get(i).setStatus();
            }
            if(arrows > 0) {
                double min = getPosition().distance(team.get(0).getPosition());;
                int indMin = 0;
                for (int j = 0; j < team.size(); j++) {
                    double x = getPosition().distance(team.get(i).getPosition());
                    if(x < min){
                        min = x;
                        indMin = j;
                    }

                }
                double dmg = getDmg(team.get(indMin));
                if (min > team.get(indMin).getSpeed())dmg /=2;
                damage(dmg);
                arrows--;

            }
        }
            // super.Step(team);
    }

    
    
}
