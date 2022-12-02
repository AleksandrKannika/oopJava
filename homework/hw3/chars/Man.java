package homework.hw3.chars;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Man implements Baseinterface {
    
    protected ArrayList<Man> team;
    protected Vector2 position;

    private int atack;
    private int prot;
    private int arrows;
    private int[] dmg;
    protected double hp;
        protected double maxHp;
    private int speed;
    private int delivery;
    private int magic;
    private String name;
    private String manType;
    

    public Man(String name, int atack, int prot, int arrows, int[] dmg, int hp, int speed, int delivery, int magic, String manType){
        this.name = name;
        this.atack = atack;
        this.prot = prot;
        this.arrows = arrows;
        this.dmg = dmg;
        this.hp = hp;
        this.speed = speed;
        this.delivery = delivery;
        this.magic = magic;
        this.maxHp = hp;
        this.manType = manType;
    }
    public String getName(){
        return name;
    }

    public String GetManType(){
        return manType;
    }
    
    public double getMaxHp(){
        return maxHp;
    }
    public double getHp(){
        return hp;
    }

    public void setHp(int n){
        this.hp -= n;
        if(this.hp < 0) 
        this.hp = 0;
         
    }

    public int getDmg(){     
        return dmg[(int) (Math.random() * dmg.length)];
    }

    @Override
    public String getInfo(){
        return "Имя: " + name +
                "; атака: " + atack +
                "; защита: " + prot +
                "; стрелы: " + arrows +
                "; урон: " + Arrays.toString(dmg) +
                "; здоровье: " + hp +
                "; скорость: " + speed +
                "; доставка: " + delivery +
                "; магия: " + magic;
    }

    public Vector2 getPosition(){
        return position;
    }

    @Override
    public void Step(ArrayList<Man> team) {
    }
}
