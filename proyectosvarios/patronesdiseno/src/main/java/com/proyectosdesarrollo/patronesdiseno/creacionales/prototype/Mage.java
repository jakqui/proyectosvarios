package com.proyectosdesarrollo.patronesdiseno.creacionales.prototype;

public class Mage extends Enemy{
    private int mana;

    public Mage(int health, int damage, int mana) {
        super(health, damage);
        this.mana = mana;
    }

    //CONSTRUCTOR QUE SE CONTIENE A SÍ MISMO
    public Mage(Mage mage){
        super(mage);
        if(mage != null) {
            setMana(mage.getMana());
        }
    }

    //CLONE
    @Override
    public Enemy clone() {
        return new Mage(this);
    }

    public int getMana() {
        return mana;
    }

    public Mage setMana(int mana) {
        this.mana = mana;
        return this;
    }

    @Override
    public String toString() {
        return "Mage [health=" + health + ", mana=" + mana + ", damage=" + damage + "]";
    }    
}
