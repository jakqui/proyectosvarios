package com.proyectosdesarrollo.patronesdiseno.estructurales.adapter;

public class Warrior implements Enemy {
    @Override
    public void attack() {
        System.out.println("Warrior attack");
    }

    @Override
    public void damage() {
        System.out.println("Warrior damage");
    }

}
