package homework.hw1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Man> list = new ArrayList<>();
        // list.add(new Peasant());
        // list.add(new Robber());
        // list.add(new Sniper());
        // list.add(new Witch());
        // list.add(new Spearman());
        // list.add(new Arbel());
        // list.add(new Monk());
        
        int count = 0;

        while (count < 50){
            int a = (int) (Math.random()*7);
            if(a == 0)list.add(new Peasant());
            else if(a == 1)list.add(new Robber());
            else if(a == 2)list.add(new Sniper());
            else if(a == 3)list.add(new Witch());
            else if(a == 4)list.add(new Spearman());
            else if(a == 5)list.add(new Arbel());
            else if(a == 6)list.add(new Monk());
            count++;
        }

        // Man peasant = new Peasant();

        // System.out.println(peasant.getName());
        
    
        list.forEach(System.out::println); // (n->System.out.println(n));
    }
}



