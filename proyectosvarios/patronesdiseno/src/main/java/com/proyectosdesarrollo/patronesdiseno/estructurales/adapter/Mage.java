package com.proyectosdesarrollo.patronesdiseno.estructurales.adapter;

public class Mage implements Enemy{
    @Override
    public void attack() {
        System.out.println("Mage attack");
    }

    @Override
    public void damage() {
        System.out.println("Mage damage");
    }

}
