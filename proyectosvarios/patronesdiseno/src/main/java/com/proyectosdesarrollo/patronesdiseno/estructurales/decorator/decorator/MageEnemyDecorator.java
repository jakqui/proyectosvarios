package com.proyectosdesarrollo.patronesdiseno.estructurales.decorator.decorator;

import com.proyectosdesarrollo.patronesdiseno.estructurales.decorator.Enemy;

public class MageEnemyDecorator extends EnemyDecorator{

    public MageEnemyDecorator(Enemy enemy) {
        super(enemy);
    }

    @Override
    public void attack() {
        enemy.attack();
        System.out.println("Mage attack");
    }

}
