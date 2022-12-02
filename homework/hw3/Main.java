package homework.hw3;

import homework.hw3.chars.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    protected static final int TeamSize = 10;
    protected static ArrayList<Man> team1;
    protected static ArrayList<Man> team2;
    public static void main(String[] args) {
        init();
        
        try (Scanner scanner = new Scanner(System.in)) {
            while(true){
            ConsoleView.view();
            System.out.println("Press Enter");
            scanner.nextLine();
            }
        }
    }
    public static void init(){
        team1 = new ArrayList<>();
        team2 = new ArrayList<>();

        int x = 1;
        int y = 1;
        for (int i = 0; i < TeamSize; i++) {
            int a = (int) (Math.random() * 4);
            if (a == 0)
                team1.add(new Peasant(team1, x, y));
            else if (a == 1)
                team1.add(new Robber(team1, x, y));
            else if (a == 2)
                team1.add(new Sniper(team1, x, y));
            else if (a == 3)
                team1.add(new Witch(team1, x, y));
            x++;

        }

        x = 1;
        y = 10;
        for (int i = 0; i < TeamSize; i++) {
            int a = (int) (Math.random() * 4);
            switch (a) {
                case 0 -> team2.add(new Spearman(team2, x++, y));
                case 1 -> team2.add(new Arbel(team2, x++, y));
                case 2 -> team2.add(new Monk(team2, x++, y));
                default -> team2.add(new Peasant(team2, x++, y));
                
            }

        }

    }
}
