package com.proyectosdesarrollo.patronesdiseno.estructurales.decorator.decorator;

import com.proyectosdesarrollo.patronesdiseno.estructurales.decorator.Enemy;

public class WarriorEnemyDecorator extends EnemyDecorator{

    public WarriorEnemyDecorator(Enemy enemy) {
        super(enemy);
    }

    @Override
    public void attack() {
        enemy.attack();
        System.out.println("Warrior attack");
    }

}
