package com.proyectosdesarrollo.patronesdiseno.estructurales.bridge.fighter;

public class WarriorFighterImpl implements Fighter{

    @Override
    public void attack() {
        System.out.println("Warrior attack");
    }

    @Override
    public void protect() {
        System.out.println("Warrior protect");
    }

}
