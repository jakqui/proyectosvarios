package com.proyectosdesarrollo.patronesdiseno.estructurales.decorator.race;

import com.proyectosdesarrollo.patronesdiseno.creacionales.abstractfactory.enemy.Enemy;

public class Orc implements Enemy{

    @Override
    public void attack() {
        System.out.println("Orc attack");
    }

}
