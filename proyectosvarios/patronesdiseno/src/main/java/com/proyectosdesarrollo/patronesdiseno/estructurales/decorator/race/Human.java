package com.proyectosdesarrollo.patronesdiseno.estructurales.decorator.race;

import com.proyectosdesarrollo.patronesdiseno.estructurales.decorator.Enemy;

public class Human implements Enemy{

    @Override
    public void attack() {
        System.out.println("Human attack");
    }

}
