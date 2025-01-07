package com.proyectosdesarrollo.patronesdiseno.creacionales.prototype;

public class Warrior extends Enemy{

    private int endurance;

    public Warrior(int health, int damage, int endurance) {
        super(health, damage);
        this.endurance = endurance;
    }

    //CONSTRUCTOR QUE SE CONTIENE A SÍ MISMO
    public Warrior(Warrior warrior) {
        super(warrior);
        if(warrior != null) {
            setEndurance(warrior.getEndurance());
        }
    }

    //CLONE
    @Override
    public Enemy clone() {
        return new Warrior(this);
    }

    //GETTERS AND SETTERS
    public int getEndurance() {
        return endurance;
    }

    public Warrior setEndurance(int endurance) {
        this.endurance = endurance;
        return this;
    }

    @Override
    public String toString() {
        return "Warrior [health=" + health + ", endurance=" + endurance + ", damage=" + damage + "]";
    }
    
}
