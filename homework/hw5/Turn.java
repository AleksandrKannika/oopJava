package homework.hw5;
import java.util.ArrayList;

import homework.hw4.chars.*;

public class Turn {
    public static void move(ArrayList<Man> t1, ArrayList<Man> t2){
        for (int i = 0; i < t1.size(); i++) {
            String typeChar = t1.get(i).getManType();
            if (typeChar == "Spearman" || typeChar == "Robber") t1.get(i).Step(t2);
            else if (typeChar == "Sniper" || typeChar == "Arbel") t1.get(i).Step(t2);
            else if (typeChar == "Monk" || typeChar == "With") t1.get(i).Step(t2);
            else if (typeChar == "Peasant") t1.get(i).Step(t2);
        }
    }
    
}
