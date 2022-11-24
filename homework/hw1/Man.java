package homework.hw1;

import java.util.Arrays;

public abstract class Man {
    private int atack;
    private int prot;
    private int arrows;
    private int[] dmg;
    private int hp;
    private int speed;
    private int delivery;//?
    private int magic;
    private String name;

    int counter;

    public Man(String name, int atack, int prot, int arrows, int[] dmg, int hp, int speed, int delivery, int magic){
        this.name = name;
        this.atack = atack;
        this.prot = prot;
        this.arrows = arrows;
        this.dmg = dmg;
        this.hp = hp;
        this.speed = speed;
        this.delivery = delivery;
        this.magic = magic;
    }
    public String getName(){
        return this.name;
    }
    
    @Override
    public String toString(){
        return "Имя: " + name + " №"+ ++counter +
                "; атака: " + atack +
                "; защита: " + prot +
                "; стрелы: " + arrows +
                "; урон: " + Arrays.toString(dmg) +
                "; здоровье: " + hp +
                "; скорость: " + speed +
                "; доставка: " + delivery +
                "; магия: " + magic;
    }
}
