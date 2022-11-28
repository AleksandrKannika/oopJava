package homework.hw2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Man> team1 = new ArrayList<>();
        ArrayList<Man> team2 = new ArrayList<>();
        // list.add(new Peasant());
        // list.add(new Robber());
        // list.add(new Sniper());
        // list.add(new Witch());
        // list.add(new Spearman());
        // list.add(new Arbel());
        // list.add(new Monk());

        int count = 0;

        while (count < 10) {
            int a = (int) (Math.random() * 4);
            if (a == 0)team1.add(new Peasant(team1));
            else if (a == 1)team1.add(new Robber(team1));
            else if (a == 2)team1.add(new Sniper(team1));
            else if (a == 3)team1.add(new Witch(team1));
            count++;
        }
        count = 0;
        while (count < 10) {
            int a = (int) (Math.random() * 4);
            switch (a) {
                case 0 -> team2.add(new Spearman(team2));
                case 1 -> team2.add(new Arbel(team2));
                case 2 -> team2.add(new Monk(team2));
                default -> team2.add(new Peasant(team2));
            }
            count++;
        }
        
        
        Man x = new Monk(team1);
        
        team1.get(1).setHp(5);
        team1.get(6).setHp(5);
        team1.get(5).setHp(5);
        team1.get(3).setHp(5);
        // x.setHp(5);
        team1.forEach(n -> System.out.println(n.getInfo())); // (System.out::println);
        System.out.println();
        x.Step(team1);
        team1.forEach(n -> System.out.println(n.getInfo())); // (System.out::println);
       
        // team2.forEach(n -> System.out.println(n.getInfo())); // (System.out::println);
        // System.out.println();

    }
}
