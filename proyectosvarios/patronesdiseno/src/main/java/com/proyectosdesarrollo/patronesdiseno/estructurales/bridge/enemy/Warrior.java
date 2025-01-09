package com.proyectosdesarrollo.patronesdiseno.estructurales.bridge.enemy;

import com.proyectosdesarrollo.patronesdiseno.estructurales.bridge.fighter.Fighter;
import com.proyectosdesarrollo.patronesdiseno.estructurales.bridge.fighter.WarriorFighterImpl;

public class Warrior extends Enemy {

    public Warrior() {
        setFighter(new WarriorFighterImpl());
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    @Override
    public Fighter getFighter() {
        return super.getFighter();
    }

    @Override
    public void setFighter(Fighter fighter) {
        super.setFighter(fighter);
    }



    

    public void attack() {
        System.out.println("Warrior: ");
        getFighter().attack();
    }

    public void protect() {
        System.out.println("Warrior: ");
        getFighter().protect();
    }
    
}
