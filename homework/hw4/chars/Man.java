package homework.hw4.chars;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Man implements Baseinterface {

    protected ArrayList<Man> team;

    // double distance;

    // public double getDistance() {
    //     return distance;
    // }

    protected Vector2 position;
    public Vector2 getPosition() {
        return position;
    }

    private int atack;
    public int getAtack() {
        return atack;
    }

    private int prot;
    public int getProt() {
        return prot;
    }

    protected int arrows;
    public void setArrows(int arrows) {
        this.arrows = arrows;
    }
    public int getArrows() {
        return arrows;
    }

    protected int[] dmg;
    protected double getDmg(Man x) {
        double dmg;
        if(getAtack() > x.getProt()) dmg = this.dmg[1];
        else if(getAtack() < x.getProt()) dmg = this.dmg[0];
        else dmg = (this.dmg[0] + this.dmg[1])/2;
        return dmg;
        
    }

    private double hp;
    public double getHp() {
        return hp;
    }
    public void setHp(int n) {
        this.hp -= n;
        if (this.hp < 0) {
            this.hp = 0;

        }

    }

    private double maxHp;
    public double getMaxHp() {
        return maxHp;
    }

    private int speed;
    public int getSpeed() {
        return speed;
    }

    private int delivery;
    private int magic;

    private String name;
    public String getName() {
        return name;
    }

    private String manType;
    public String getManType() {
        return manType;
    }

    private String status = "loafer";
    public void setStatus() {
        if (status != "RIP"){
            if (status == "loafer") this.status = "in work";
            else this.status = "loafer";
        }
    }
    public String getStatus() {
        return status;
    }

    protected void damage(double dmg) {
        this.hp = this.hp - dmg;
        if (this.hp <= 0) {
            this.hp = 0;
            this.status = "RIP";
        }

    }

    public Man(String name, int atack, int prot, int arrows, int[] dmg, int hp, int speed, int delivery, int magic,
            String manType) {
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

    @Override
    public String getInfo() {
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

    @Override
    public void Step(ArrayList<Man> team) {
    }
}
