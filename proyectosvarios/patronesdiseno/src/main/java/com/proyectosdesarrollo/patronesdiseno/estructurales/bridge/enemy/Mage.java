package com.proyectosdesarrollo.patronesdiseno.estructurales.bridge.enemy;

import com.proyectosdesarrollo.patronesdiseno.estructurales.bridge.fighter.Fighter;
import com.proyectosdesarrollo.patronesdiseno.estructurales.bridge.fighter.MageFighterImpl;

public class Mage extends Enemy {
    public Mage() {
        setFighter(new MageFighterImpl());
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
        System.out.println("Mage:");
        getFighter().attack();
    }

    public void protect() {
        System.out.println("Mage:");
        getFighter().protect();
    }
    
}
